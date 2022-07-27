
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int k, toplam = 0,adet =0;
        double ort;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Sayý giriniz : ");
        k = inp.nextInt();

        for (int i = 1; i <= k; i++){
            if (i%12 == 0){
                toplam += i;
                adet = k / 12;}}
        ort = toplam / adet;
        System.out.println("Deðerlerin ortalmalarý : " + ort);


    }
}