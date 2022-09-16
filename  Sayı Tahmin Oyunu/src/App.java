import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Random rand = new Random();

        int number = rand.nextInt(100);

        System.out.println(number);

        Scanner input = new Scanner(System.in);

        int right = 0;
        int selected;
        int[] wrongs = new int[5];
        while (right < 5) {

            System.out.println("lütfen tahmin giriniz: ");
            selected = input.nextInt();

            if (selected < 0 && selected > 99) {
                System.out.println("0-100 arasi değer girniz");
                continue;
            }

            if (selected == number) {

                System.out.println("Dogru Tahmin: " + selected);
                break;

            } else {

                wrongs[right] = selected;
                right++;

                System.out.println("Yanlıs sayi girildi!");
                if (selected < number) {
                    System.out.println("aranan sayi " + selected + " sayisindan büyüktür.");
                } else {
                    System.out.println("aranan sayi " + selected + " sayisindan kücüktür.");
                }

                System.out.println("Kalan Hak: " + (5 - right));

                if (right == 5) {
                    System.out.println("Doğru Cevap: " + number);

                    System.out.println("verilen cevaplar: ");

                    System.out.println("Tahmin edilen sayilar: ");
                    for (int a : wrongs) {
                        if (a != 0) {
                            System.out.println(a);
                        }

                    }

                }

            }

        }

    }
}
