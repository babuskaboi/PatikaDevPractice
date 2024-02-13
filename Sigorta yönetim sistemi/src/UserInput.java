import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    public void closeScanner() {
        scanner.close();
    }

    public String getEmailFromUser() {
        System.out.print("Enter your email: ");
        return scanner.nextLine();
    }

    public String getPasswordFromUser() {
        System.out.print("Enter your password: ");
        return scanner.nextLine();
    }
}
