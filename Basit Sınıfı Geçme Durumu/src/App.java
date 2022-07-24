import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int mat,fizik,turkce,kimya,muzik;
        double avarage;

        Scanner inp=new Scanner(System.in);

        System.out.println("Matemetik notu giriniz:");
        mat=inp.nextInt();

        System.out.println("turkce notu giriniz:");
        turkce=inp.nextInt();

        System.out.println("fizik notu giriniz:");
        fizik=inp.nextInt();

        System.out.println("kimya notu giriniz:");
        kimya=inp.nextInt();

        System.out.println("muzik notu giriniz:");
        muzik=inp.nextInt();

        avarage=(mat+fizik+kimya+turkce+muzik)/5;

        if(avarage<50){
            System.out.println("Sınıfta Kaldınız");
            
        }
        else{
            System.out.println("Sınıfı Gectiniz");
        }

        System.out.println("Notunuz:"+avarage);


    }
}
