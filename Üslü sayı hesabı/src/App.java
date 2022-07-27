import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int a,b,sonuc=1;

        Scanner inp=new Scanner(System.in);

        System.out.println("a^b yi giriniz\na:");
        a=inp.nextInt();
        System.out.println("b yi giriniz:");
        b=inp.nextInt();

        for(int i=1;i<=b;i++){
            sonuc*=a;
        }

        System.out.println("a^b nin cevabı= "+sonuc);


    }
}
