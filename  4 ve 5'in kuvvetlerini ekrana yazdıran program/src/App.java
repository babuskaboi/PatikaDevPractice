import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n;
        System.out.print("Sınır sayısını giriniz : ");
        n= input.nextInt();

        System.out.println( n+ " sayısından küçük dördün kuvvetleri: ");
        for(int i=1; i<n; i*=4){
            System.out.print(i+" ");
        }

        System.out.println("");//boşluk bırakmak için
        System.out.println(n+ " sayısından küçük beşin kuvvetleri: ");
        for(int i=1; i<n; i*=5){
            System.out.print(i+ " ");

        }

    }
}