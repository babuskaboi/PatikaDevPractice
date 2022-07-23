import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double tutar;
        int gidilenKm;

        Scanner inp=new Scanner(System.in);

        System.out.println("Gidilen Kmyi giriniz:");
        gidilenKm=inp.nextInt();

        tutar=10+gidilenKm*2.2;
        if(tutar<20)
        tutar=20;
        

        System.out.println("Verilecek ücret"+tutar);
    }
}
