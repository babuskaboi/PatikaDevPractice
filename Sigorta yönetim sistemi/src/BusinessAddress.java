public class BusinessAddress implements Address {
    private String street;
    private String city;
    private String country;
    
    public BusinessAddress(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    @Override
    public String getAddresInfo() {
        return "Business Address: " + street + ", " + city + ", " + country;
    }
    
}
