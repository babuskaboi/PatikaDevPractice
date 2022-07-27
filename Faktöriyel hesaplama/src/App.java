import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int toplam = 1, number, k;

        Scanner inp = new Scanner(System.in);

        System.out.println("faktöriyeli alınacak sayıyı giriniz:");
        number = inp.nextInt();

        for (k = 1; k <= number; k++) {
            toplam *= k;
        }

        System.out.println("faköriyel= "+toplam);

    }
}
