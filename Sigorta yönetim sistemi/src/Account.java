import java.util.ArrayList;
import java.util.Objects;

public abstract class Account implements Comparable<Account> {
    private AuthenticationStatus authenticationStatus;
    private User user;
    private ArrayList<Insurance> insuranceList;

    public Account(User user) {
        this.user = user;
        this.authenticationStatus = AuthenticationStatus.FAIL; // Varsayılan olarak çıkış yapılmış durumda
        this.insuranceList = new ArrayList<>();
    }

    @Override
    public int compareTo(Account other) {
        // E-posta adreslerine göre karşılaştırma yap
        return this.user.getEmail().compareTo(other.getUser().getEmail());
    }

    @Override
public int hashCode() {
    return Objects.hash(user.getEmail()); // E-posta adresine göre hash kodu hesapla
}

@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Account account = (Account) obj;
    return Objects.equals(user.getEmail(), account.user.getEmail()); // E-posta adreslerini karşılaştır
}



    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(ArrayList<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }

    public void addInsurance(Insurance insurance) {
        insuranceList.add(insurance);
    }

    public void removeInsurance(Insurance insurance) {
        insuranceList.remove(insurance);
    }

    public final void showUserInfo() {
        System.out.println("User Information:");
        System.out.println("Name: " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Occupation: " + user.getOccupation());
        System.out.println("Age: " + user.getAge());
        System.out.println("Last Login Date: " + user.getLastLoginDate());
    }

    public void login(String email, String password) throws InvalidAuthenticationException {

        if (email.equals(user.getEmail()) && password.equals(user.getPassword()))
            setAuthenticationStatus(AuthenticationStatus.SUCCESS);

        else {
            throw new InvalidAuthenticationException("Invalid email or password.");
        }

    }

    public abstract void displayAccountInfo();

    public void addAddress(Address address) {

        AddressManager.addAddress(user, address);
    }

    public void removeAddress(Address address) {

        AddressManager.removeAddress(user, address);
    }

    public boolean isLoged() {
        return authenticationStatus.status;
    }

}
