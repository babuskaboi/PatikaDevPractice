import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        double anaPara, Kdv, toplamtutar = 0;

        Scanner inp = new Scanner(System.in);

        // kullanıcıdan anapara tutarı alındı
        System.out.println("ana para girişi");
        anaPara = inp.nextInt();

        // anaparaya göre kdv tutarı belirlendi
        if (anaPara > 0 && anaPara < 1000) {
            Kdv = 0.18;
        } else {
            Kdv = 0.08;
        }
        //kdv hesaplanıp ekrana yazdırıldı
        toplamtutar = anaPara + (Kdv * anaPara);

        System.out.println("son Tutar= " + toplamtutar);

    }

}
