import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double toplam=0,num;
        Scanner inp=new Scanner(System.in);
        System.out.println("sayi giriniz:\n");
        num=inp.nextDouble();


        for(int i=1;i<=num;i++){
            toplam=toplam+(1.0/i);
        }
        System.out.println("girilen sayının harmonik formülü:\n"+toplam);

    }
}
