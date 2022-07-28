public class App {
    public static void main(String[] args) throws Exception {

        for (int i = 1; i < 10; i++) {
            if (i <= 5) {

                for (int n = 1; n <= 5 - i; n++) {

                    System.out.print(" ");
                }

                for (int n = 1; n <= i; n++) {
                    System.out.print("*");

                }
                for(int n=1;n<=i-1;n++){
                    System.out.print("*");
                }

                System.out.println();
            }
            if (i > 5) {

                for (int n = 1; n <= i - 5; n++) {
                    System.out.print(" ");

                }
                for (int n = 1; n <= 10 - i; n++) {

                    System.out.print("*");
                }
                for (int n = 1; n <= 10 - i-1; n++) {

                    System.out.print("*");
                }

                System.out.println();

            }

        }
    }
}