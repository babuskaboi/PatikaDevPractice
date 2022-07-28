import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int ebob = 0, ekok, num1, num2, numL;
        Scanner inp = new Scanner(System.in);
        System.out.println("birinci sayi giriniz:");

        num1 = inp.nextInt();

        System.out.println("ikinci sayiyi giriniz:");
        num2 = inp.nextInt();

        numL = (num1 < num2) ? num1 : num2;
        int a = 1;
        while (a <= numL) {
            if (num1 % a == 0 && num2 % a == 0) {
                ebob = a;

            }
            a++;

        }

        ekok = num1 * num2 / ebob;

        System.out.println("Girilen iki sayinin ebobu: " + ebob);
        System.out.println("Girilen iki sayinin ekoku: " + ekok);
    }
}
