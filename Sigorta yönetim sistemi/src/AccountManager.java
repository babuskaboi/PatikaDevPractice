import java.util.TreeSet;

public class AccountManager {

    private TreeSet<Account> accountTreeList;

    public AccountManager() {
        this.accountTreeList = new TreeSet<>();
    }

    public void addAccount(Account account) {
        accountTreeList.add(account);

    }

    public Account login(String email, String pasword) throws InvalidAuthenticationException {

        for (Account account : accountTreeList) {
            try {
                if (account.getUser().getEmail().equals(email) && account.getUser().getPassword().equals(pasword)) {
                    account.login(email,pasword);
                    return account;
                }

            } catch (InvalidAuthenticationException e) {
                
            }
        }throw new InvalidAuthenticationException("Invalid email or password.");
        

    }

}
