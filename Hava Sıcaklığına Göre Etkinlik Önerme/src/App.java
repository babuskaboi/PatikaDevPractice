import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int heat;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter Temperature Type (°C) : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("You can ski");
        } else if ( heat <= 25) {
            if (heat >= 5 && heat <= 15) {
                System.out.println("You can go cinema");


            }

            if (heat >= 15 && heat <= 25) {
                System.out.println("You can go picnic");
            }


        } else  {
            System.out.println("You can go swim");

        }
    }
}
