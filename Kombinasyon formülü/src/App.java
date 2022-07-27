import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n, r, combination,nf=1,rf=1,nrf=1;
        Scanner inp = new Scanner(System.in);

        System.out.println("C(n,r) n ve r yi giriniz\nn:");
        n = inp.nextInt();
        System.out.println("r yi giriniz.");
        r = inp.nextInt();

        for(int i=1;i<=n;i++)
        nf*=i;

        for(int i=1;i<=r;i++)
        rf*=i;

        for(int i=1;i<=n-r;i++)
        nrf*=i;



        combination=nf/(rf*(nrf));

        System.out.println(n+"in"+r+"li kombinasyonu="+combination);


    }
}
