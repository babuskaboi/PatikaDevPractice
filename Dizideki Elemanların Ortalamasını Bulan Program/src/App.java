
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int[] list = { 15, 8, 6, 21, 12, 5 };
        int number;
        Arrays.sort(list);

        int sC = list[0];
        int bC = list[list.length - 1];

        System.out.println(list[0] + "-" + list[list.length - 1] + " aralıgında sayı giriniz: ");
        Scanner inp = new Scanner(System.in);
        number = inp.nextInt();
        inp.close();

        for (int i = 0; i < list.length; i++) {
            if (list[i] < number && Math.abs(number - list[i]) < Math.abs(number - sC)) {
                sC = list[i];

            }
            if (list[i] > number && Math.abs(number - list[i]) < Math.abs(number - bC)) {
                bC = list[i];

            }

        }

        System.out.println("Girilen sayıdan küçük en yakın sayi: " + sC);
        System.out.println("Girilen sayıdan büyük en yakın sayi: " + bC);
    }
}
