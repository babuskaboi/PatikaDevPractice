import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double boy,endeks,kilo;
        
         
        Scanner inp=new Scanner (System.in);

        System.out.println("Boyunuzu giriniz:(metre)");
        boy=inp.nextDouble();
        System.out.println("kilonuzu giriniz:");
        kilo=inp.nextDouble();
        endeks=(kilo/(boy*boy));
        System.out.println("vücüt kitle endeksiniz:"+endeks);



        
    }
}