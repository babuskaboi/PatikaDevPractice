import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int year ;
        System.out.print("Enter the year : ");
        year = input.nextInt();

        if(year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.print(year + " is a leap year ! ");
            }
            else {
                System.out.print(year + " is not a leap year ! ");
            }
        } else if (year % 4 == 0 ) {
                System.out.print(year + " is a leap year ! ");
        } else {
            System.out.print(year + " is not a leap year ! ");
        }
    }
}
