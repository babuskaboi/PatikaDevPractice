import java.util.Scanner;

public class MineSweeper {

    int line;
    int column;
    int mines;
    int rounds;
    int selected_line;
    int selected_column;
    int count;

    public MineSweeper(int line, int column) {
        this.line = line;
        this.column = column;
        this.mines = line * column / 4;
        this.rounds = (line * column) - mines;
    }

    public void run() {
        String[][] board = new String[line][column];
        String[][] game = new String[line][column];

        for (int i = 0; i < line; i++) {

            for (int j = 0; j < column; j++) {

                game[i][j] = " - ";

            }

        }

        // for (int i = 0; i < line; i++) {

        // for (int j = 0; j < column; j++) {

        // System.out.print(game[i][j]);

        // }
        // System.out.println();
        // }
        // GAMEİN MAYINLANMA AŞAMASI
        while (mines > 0) {

            for (int i = 0; i < line - 1 && mines > 0; i++) {

                for (int j = 0; j < column - 1 && mines > 0; j++) {
                    int rand = (int) (Math.random() * 100);

                    if (rand >= 95 && game[i][j] == " - ") {
                        game[i][j] = " * ";
                        mines--;
                        if (mines == 0) {
                            break;
                        }
                    }

                }
            }

            if (mines == 0) {
                break;
            }

        }
        // GAMEİN MAYINLANMA AŞAMASI

        // for (int i = 0; i < line - 1; i++) {
        // for (int j = 0; j < column - 1; j++)
        // board[i][j] = " - ";

        // }

        // OYUNU EKRANA YAZDIRMA
        for (int i = 0; i < line; i++) {

            for (int j = 0; j < column; j++) {

                System.out.print(game[i][j]);

            }
            System.out.println();
        }
        System.out.println("-------------------");

        for (int i = 0; i < line; i++) {

            for (int j = 0; j < column; j++) {

                board[i][j] = " - ";

            }

        }

        for (int i = 0; i < line; i++) {

            for (int j = 0; j < column; j++) {

                System.out.print(board[i][j]);

            }
            System.out.println();
        }
        // OYUNU EKRANA YAZDIRMA

        while (rounds > 0) {
            System.out.println("-------------------------------------");
            Scanner scan = new Scanner(System.in);
            System.out.print("Satır giriniz: ");
            selected_line = scan.nextInt();
            System.out.print("Sütün giriniz: ");
            selected_column = scan.nextInt();

            if (board[selected_line][selected_column] == " * ") {
                System.out.println("OYUN KAYBEDİLDİ");
                break;
            } else if (selected_line == 0) {
                if (selected_column == 0) {

                    int count = 0;
                    for (int i = selected_line; i < selected_line + 2; i++) {
                        for (int j = selected_column; j < selected_column + 2; j++) {
                            if (i == selected_line && j == selected_column)
                                continue;
                            if (game[i][j] == " * ") {
                                count++;
                            }

                        }
                    }
                    board[selected_line][selected_column] = " " + Integer.toString(count) + " ";

                } else if (selected_column == column - 1) {
                    int count = 0;
                    for (int i = selected_line; i < selected_line + 2; i++) {
                        for (int j = selected_column - 1; j < selected_column + 1; j++) {
                            if (i == selected_line && j == selected_column)
                                continue;
                            if (game[i][j] == " * ") {
                                count++;
                            }

                        }
                    }
                    board[selected_line][selected_column] = " " + Integer.toString(count) + " ";

                } else {
                    int count = 0;
                    for (int i = selected_line; i < selected_line + 2; i++) {
                        for (int j = selected_column - 1; j < selected_column + 2; j++) {
                            if (i == selected_line && j == selected_column)
                                continue;
                            if (game[i][j] == " * ") {
                                count++;
                            }

                        }
                        board[selected_line][selected_column] = " " + Integer.toString(count) + " ";
                    }

                }
            } else if (selected_column == 0) {
                if (selected_line == line - 1) {
                    int count = 0;
                    for (int i = selected_line - 1; i < selected_line + 1; i++) {
                        for (int j = selected_column; j < selected_column + 2; j++) {
                            if (i == selected_line && j == selected_column)
                                continue;
                            if (game[i][j] == " * ") {
                                count++;
                            }

                        }
                    }
                    board[selected_line][selected_column] = " " + Integer.toString(count) + " ";

                } else {
                    int count = 0;
                    for (int i = selected_line - 1; i < selected_line + 2; i++) {
                        for (int j = selected_column; j < selected_column + 2; j++) {
                            if (i == selected_line && j == selected_column)
                                continue;
                            if (game[i][j] == " * ") {
                                count++;
                            }

                        }
                        board[selected_line][selected_column] = " " + Integer.toString(count) + " ";
                    }
                }

            } else if (selected_column == column - 1) {
                if (selected_line == line - 1) {
                    int count = 0;
                    for (int i = selected_line - 1; i < selected_line + 1; i++) {
                        for (int j = selected_column - 1; j < selected_column + 1; j++) {
                            if (i == selected_line && j == selected_column)
                                continue;
                            if (game[i][j] == " * ") {
                                count++;
                            }

                        }
                    }
                    board[selected_line][selected_column] = " " + Integer.toString(count) + " ";

                } else {
                    int count = 0;
                    for (int i = selected_line - 1; i < selected_line + 2; i++) {
                        for (int j = selected_column - 1; j < selected_column + 1; j++) {
                            if (i == selected_line && j == selected_column)
                                continue;
                            if (game[i][j] == " * ") {
                                count++;
                            }

                        }
                        board[selected_line][selected_column] = " " + Integer.toString(count) + " ";
                    }

                }

            } else if (selected_line == line - 1) {
                int count = 0;
                for (int i = selected_line - 1; i < selected_line + 1; i++) {
                    for (int j = selected_column - 1; j < selected_column + 2; j++) {
                        if (i == selected_line && j == selected_column)
                            continue;
                        if (game[i][j] == " * ") {
                            count++;
                        }

                    }
                }
                board[selected_line][selected_column] = " " + Integer.toString(count) + " ";

            }

            else if (selected_line != 0 || selected_line != line || selected_column != 0 || selected_column != column) {
                int count = 0;
                for (int i = selected_line - 1; i < selected_line + 2; i++) {
                    for (int j = selected_column - 1; j < selected_column + 2; j++) {

                        if (i == selected_line && j == selected_column)
                            continue;
                        if (game[i][j] == " * ") {
                            count++;
                        }

                    }

                }
                board[selected_line][selected_column] = " " + Integer.toString(count) + " ";
            }

            for (int i = 0; i < line; i++) {

                for (int j = 0; j < column; j++) {

                    System.out.print(board[i][j]);

                }
                System.out.println();
            }
            // GERCEK OYUNUN AŞAMASININ EKRANA YAZDIRILMASI
            // System.out.println("---------------------");

            // for (int i = 0; i < line; i++) {

            // for (int j = 0; j < column; j++) {

            // System.out.print(game[i][j]);

            // }
            // System.out.println();
            // }
            // GERCEK OYUNUN AŞAMASININ EKRANA YAZDIRILMASI
            rounds--;

        }

        for (int i = 0; i < line - 1; i++) {
            for (int j = 0; j < column - 1; j++) {
                if (board[i][j] == " - ") {
                    board[i][j] = " * ";

                }
            }
        }

        System.out.println("TEBRİKLER KAZANDINIZ!!");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < line; i++) {

            for (int j = 0; j < column; j++) {

                System.out.print(board[i][j]);

            }
            System.out.println();
        }

    }

}
