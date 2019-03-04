
import java.util.*;

public class AddressIndex {

    private Map<String, String> addressIndex;

    // CONSTRUCTOR
    public AddressIndex() {
        this.addressIndex = new HashMap<String, String>();
    }

    // INTERFACE METHOD. Add an address to a parameter name
    public void add(String person, String address) {

        if (!this.addressIndex.containsKey(person)) {
            this.addressIndex.put(person, address);
        } else {
            this.addressIndex.replace(person, address);
        }
    }

    // INTERFACE METHOD. Searches for a person's address
    public void searchByName(String person) {
        try {
            System.out.println(this.addressIndex.get(person));
        }
        catch (Exception e) {
            System.out.println("address unknown");
        }
    }

    // INTERFACE METHOD. Remove the person's number
    public void removeInfo(String person) {
        this.addressIndex.remove(person);
    }
    
}
