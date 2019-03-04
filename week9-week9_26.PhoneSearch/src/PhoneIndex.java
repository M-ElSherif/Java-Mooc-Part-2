
import java.util.*;

public class PhoneIndex implements IndexTools {

    private Map<String, Set<String>> phoneIndex;

    // CONSTRUCTOR
    public PhoneIndex() {
        this.phoneIndex = new HashMap<String, Set<String>>();
//        this.reversePhoneIndex = new HashMap<String, Set<String>>();
    }

    // INTERFACE METHOD. Add a phone number to parameter name
    public void add(String person, String number) {

        if (!this.phoneIndex.containsKey(person)) {
            this.phoneIndex.put(person, new HashSet<String>()); // initiate empty set for the person's numbers
            this.phoneIndex.get(person).add(number);
        } else {
            this.phoneIndex.get(person).add(number);
        }
    }

    // INTERFACE METHOD. Searches phone index for parameter name and prints
    // the phone numbers
    public void searchByName(String person) {
        
        try {
            Set<String> searchedNumbers = this.phoneIndex.get(person);
            for (String number : searchedNumbers) {
                System.out.println(" " + number);
            }
        }
        catch (Exception e) {
            System.out.println("phone number not found");
        }
    }
    
    // INTERFACE METHOD. Searches phone index for parameter phone number and
    // prints the corresponding name 
    public void searchByInfo(String number) {
        
        try {
            for (String person : this.phoneIndex.keySet()) {
                Set<String> numbers = this.phoneIndex.get(person);
                for (String num : numbers) {
                    if (num.equals(number)) {
                        System.out.println(" " + person);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("not found");
        }
    }

    
    // INTERFACE METHOD. Remove the person's number
    public void removeInfo(String person) {
        this.phoneIndex.remove(person);
    }

}
