import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp=new Scanner(System.in);

        int i;

        System.out.println("basamak sayısi giriniz:");
        i=inp.nextInt();
       
        for(int a=0;a<i;a++){
            for(int n=1;n<=a;n++){
                System.out.print(" ");

            }
            for(int n=1;n<=i-a;n++){
                System.out.print("*");
            }
            for(int n=1;n<=i-a-1;n++){
                System.out.print("*");
            }
            System.out.println();



        }
    }
}
