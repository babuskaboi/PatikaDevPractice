import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner inp=new Scanner(System.in);

        int inpNumber;
        System.out.println("Sayi giriniz:");
        inpNumber=inp.nextInt();

        System.out.println("Girilen sayiya katar cift olan sayılar:");

        for(int i=0;i<inpNumber;i++){

            if(i%2==0){
                System.out.println(i);

            }


        }
    }
}
