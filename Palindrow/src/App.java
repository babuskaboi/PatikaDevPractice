import java.util.Scanner;

public class App {

    public static int tersSayi(int number) {

        int lastNumber = 0, reverseNumber = 0;

        int temp = number;

        while (temp != 0) {
            lastNumber = temp % 10;

            temp = temp / 10;

            reverseNumber = (reverseNumber * 10) + lastNumber;

        }

       

        return reverseNumber;

    }

    public static void main(String args[]) {
        System.out.println("Sayinin tersi:\n"+tersSayi(255));
        

    }

}