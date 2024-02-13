public class HomeAddress implements Address {
    private String street;
    private String city;
    private String country;

    public HomeAddress(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

  

    @Override
    public String getAddresInfo() {
        return "Home Address:"+street+","+city+","+country;
    }
    
}
