import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double yas, mesafe, yon,tutar,indirimlitutar,yasindirimi=1,yonindirimi=1;

        Scanner inp = new Scanner(System.in);

        System.out.println("Yolculuk Tipi seçiniz!\n1- Tek Yön\n2-Gidiş ve Dönüş");
        yon = inp.nextDouble();

        System.out.println("Yaşınızı giriniz");
        yas = inp.nextDouble();

        System.out.println("gidilen mesafeyi giriniz");
        mesafe = inp.nextDouble();

        if(yon!=1&&yon!=2||yas<=0||mesafe<=0){
            System.out.println("Hatalı Veri Girdiniz");
            System.exit(0);
        }
        if(yas<12){
            yasindirimi=0.5;
        }
        else if(yas>=12&&yas<24){
            yasindirimi=0.9;
        }
        else if(yas>=65){
            yasindirimi=0.7;
        }
        if(yon==2){
            yonindirimi=0.8;

        }
        tutar=mesafe*0.10*yon;

        System.out.println("İndirimsiz Tutar"+tutar);

        indirimlitutar=tutar*yasindirimi*yonindirimi;
        System.out.println("\nİndirimli tutar"+indirimlitutar);
        


    }
}
