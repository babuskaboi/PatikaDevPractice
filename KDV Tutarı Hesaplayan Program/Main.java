import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        double anaPara, Kdv, toplamtutar=0;

        Scanner inp = new Scanner(System.in);

        System.out.println("ana para girişi");
        anaPara = inp.nextInt();

        if (anaPara > 0 && anaPara < 1000) {
            Kdv = 0.18;
        }
        else{
            Kdv=0.08;
        }
        toplamtutar=anaPara+(Kdv*anaPara);

        System.out.println("son Tutar= "+toplamtutar);



    }

}
