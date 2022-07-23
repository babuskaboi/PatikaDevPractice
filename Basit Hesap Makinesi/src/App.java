import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double select, number1, number2, sonuc=0;
        

        Scanner inp = new Scanner(System.in);

        System.out.println("İlk sayiyi giriniz:");

        number1 = inp.nextInt();

        System.out.println("İkinci sayiyi giriniz:");

        number2 = inp.nextInt();

        System.out.println("1-Topmlama\n2-Cıkarma\n3-Bolme\n4.Carpma");

        select = inp.nextInt();

        if (select == 1){
            sonuc = number1 + number2;
        }
        else if (select == 2){
            sonuc = number1 - number2;
        }
        else if (select == 3){
            sonuc = (double) (number1 / number2);
        }
        else if (select == 4){
            sonuc = number1 * number2;
        }
        else {

            System.out.println("hatalı seçim yaptınız");

        }

        System.out.println(sonuc);



    }
}
