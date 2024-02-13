import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) throws InvalidAuthenticationException {
        UserInput userInput = new UserInput();
        AccountManager accountManager = new AccountManager();

        // Kullanıcı nesnelerini oluştur
        User user1 = new User("duhan", "Ayg", "duhan@", "1234", "Engineer", 30, new ArrayList<>(), new Date());
        User user2 = new User("serkan", "Ayg", "serkan@", "4321", "Teacher", 25, new ArrayList<>(), new Date());

        // AccountManager'a örnek hesaplar ekle
        Account account1 = new IndividualAccount(user1);
        Account account2 = new IndividualAccount(user2);
        accountManager.addAccount(account1);
        accountManager.addAccount(account2);

        // Klavyeden email ve şifre al
        String email = userInput.getEmailFromUser();
        String password = userInput.getPasswordFromUser();

        Account loggedInAccount = accountManager.login(email, password);
    System.out.println("Login successful! Welcome, " + loggedInAccount.getUser().getEmail());

        userInput.closeScanner();
    }
}
