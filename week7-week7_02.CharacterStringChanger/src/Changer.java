import java.util.*;

public class Changer {
    
    private ArrayList<Change> changes;  // holds all changes to be made
    
    // CONSTRUCTOR
    public Changer() {
        this.changes = new ArrayList<Change>();
    }
    
    // METHOD. Adds a new Change to the Changer
    public void addChange(Change change) {
        this.changes.add(change);
    }
    
    
    public String change(String characterString) {
        String changedString = "";
        
        for (Change eachChange : this.changes) {
            changedString = eachChange.change(characterString);
            characterString = changedString;
        }
        return changedString;
    }
    
}
