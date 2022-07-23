import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        double birinciKenar, ikinciKenar, ucuncuKenar, alan, u, cevre;

        Scanner input = new Scanner(System.in);
        System.out.print("1. kenar uzunluğunu giriniz: ");
        birinciKenar = input.nextDouble();

        System.out.print("2. kenar uzunluğunu giriniz: ");
        ikinciKenar = input.nextDouble();

        System.out.print("3. kenar uzunluğunu giriniz: ");
        ucuncuKenar = input.nextDouble();

        u = (birinciKenar + ikinciKenar + ucuncuKenar) / 2;
        cevre = 2 * u;
        alan = Math.sqrt(u * (u - birinciKenar) * (u - ikinciKenar) * (u - ucuncuKenar));
        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " + cevre);
    }
}
