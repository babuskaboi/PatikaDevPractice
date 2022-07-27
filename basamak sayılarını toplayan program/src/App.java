import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num = 1, i = 1, toplam = 0;
        Scanner inp = new Scanner(System.in);

        System.out.println("sayı giriniz:");
        num = inp.nextInt();

        while (num != 0) {

            toplam += num % 10;
            num /= 10;

        }

        System.out.println("girilen sayının basamaklarının toplamı:\n" + toplam);

    }
}
