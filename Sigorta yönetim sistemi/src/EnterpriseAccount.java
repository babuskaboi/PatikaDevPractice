public class EnterpriseAccount extends Account {
    
    private String companyName;
    private String companyRegistrationNumber;

    public EnterpriseAccount(User user, String companyName, String companyRegistrationNumber) {
        super(user);
        this.companyName = companyName;
        this.companyRegistrationNumber = companyRegistrationNumber;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Enterprise Account Information:");
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Registration Number: " + companyRegistrationNumber);
        System.out.println("Contact Person: " + getUser().getFirstName() + " " + getUser().getLastName());
        System.out.println("Contact Email: " + getUser().getEmail());
    }
}