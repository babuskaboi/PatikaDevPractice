import java.util.ArrayList;

public class AddressManager {
    public static void addAddress(User user, Address address) {
        ArrayList<Address> addressList = user.getAddressList();
        addressList.add(address);
        user.setAddressList(addressList);
    }

    public static void removeAddress(User user, Address address) {
        ArrayList<Address> addressList = user.getAddressList();
        addressList.remove(address);
        user.setAddressList(addressList);
    }
}
