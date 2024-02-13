public class IndividualAccount extends Account {
    

    public IndividualAccount(User user) {
        super(user);
        
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Individual Account Information:");
        System.out.println("Name: " + getUser().getFirstName() + " " + getUser().getLastName());
        System.out.println("Email: " + getUser().getEmail());
        
    }

   
}