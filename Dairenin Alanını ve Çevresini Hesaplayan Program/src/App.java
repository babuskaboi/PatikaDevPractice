import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception {
       double pi=3.14,alan;
       int r,mAcıOlcusu;

       Scanner inp=new Scanner(System.in);

       System.out.println("Yarıcap giriniz:");

       r=inp.nextInt();
       System.out.println("Merkez acı olcusu giriniz:");
       mAcıOlcusu=inp.nextInt();

       alan=pi*r*r*mAcıOlcusu/360;

       System.out.println("Dilimin Alanı:"+alan);



    
    }
}
