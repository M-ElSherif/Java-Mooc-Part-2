
import java.util.*;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    // CONSTRUCTOR
    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    //------------------------------------------------------------
    // METHOD
    public boolean add(RegistrationPlate plate, String owner) {

        if (!this.owners.containsKey(plate)) {
            this.owners.put(plate, owner);
            return true;
        }
        return false;
    }

    //------------------------------------------------------------
    // METHOD
    public String get(RegistrationPlate plate) {
        return this.owners.get(plate);
    }

    //------------------------------------------------------------
    // METHOD
    public boolean delete(RegistrationPlate plate) {
        if (this.owners.containsKey(plate)) {
            this.owners.remove(plate);
            return true;
        }
        return false;
    }

    //------------------------------------------------------------
    // METHOD
    public void printRegistrationPlates() {
        for (RegistrationPlate plate : this.owners.keySet()) {
            System.out.println(plate.getCountry() + " " + plate.getRegCode());
        }
    }

    //------------------------------------------------------------
    // METHOD
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<String>(this.owners.values());
        String DuplicateOwner = owners.get(0);

        for (String owner : owners) {
            if (!owner.equals(DuplicateOwner)) {
                System.out.println(owner);
            }
            DuplicateOwner = owner;
        }

    }
}
