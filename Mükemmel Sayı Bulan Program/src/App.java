import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int total=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a positive number");
        int n = sc.nextInt();
        for (int i=1; i<n;i++){
            if(n%i==0){
              total+=i;
            }
        }
        if (total==n)
            System.out.println(n + " is a great number");
        else
            System.out.println(n + " is not a great number.");
    }
}