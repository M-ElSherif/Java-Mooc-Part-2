
import java.util.*;

public class UserInterface {

    private Scanner reader;
    private PhoneIndex phoneIndex;
    private AddressIndex addressIndex;

    // CONSTRUCTOR
    public UserInterface() {
        this.reader = new Scanner(System.in);
        this.phoneIndex = new PhoneIndex();
        this.addressIndex = new AddressIndex();
    }
    
    // METHOD. Start the UI
    public void start(Scanner reader) {
        System.out.println("phone search");
        System.out.println("available operations");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
        
        while (true) {
            System.out.println("");
            System.out.println("command: ");
            String input = reader.nextLine();
            
            if (input.equals("1")) {
                this.addNumber(reader);
            }
            if (input.equals("2")) {
                this.searchNumByPerson(reader);
            }
            if (input.equals("3")) {
                this.searchPersonByNum(reader);
            }
            if (input.equals("4")) {
                this.addAddress(reader);
            }
            if (input.equals("5")) {
                this.searchInfo(reader);
            }
        }
    }
    
    // METHOD. Add a number
    public void addNumber(Scanner reader) {
        System.out.print("whose number: ");
        String person = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();
        this.phoneIndex.add(person, number);
    }
    
    // METHOD. Search for a phone number by person
    public void searchNumByPerson(Scanner reader) {
        System.out.print("whose number: ");
        String person = reader.nextLine();
        this.phoneIndex.searchByName(person);   //prints results
    }
    
    // METHOD. Search for a person by phone number
    public void searchPersonByNum(Scanner reader) {
        System.out.println("number: ");
        String number = reader.nextLine();
        this.phoneIndex.searchByInfo(number);   // prints results
    }
    
    // METHOD. Add an address to a person
    public void addAddress(Scanner reader) {
        System.out.println("whose address: ");
        String person = reader.nextLine();
        System.out.println("street: ");
        String street = reader.nextLine();
        System.out.println("city: ");
        String city = reader.nextLine();
        String address = street + " " + city;   // concatenate the street and city for address
        this.addressIndex.add(person, address); // add the address to specified person in the index HashMap
    }
    
    public void searchInfo(Scanner reader){
        System.out.println("whose information:");
        String person = reader.nextLine();
        System.out.println("address:");
        this.addressIndex.searchByName(person);
        System.out.println("phone numbers:");
        this.phoneIndex.searchByName(person);
    }
    
    
}
