import java.util.*;

public class PromissoryNote {
    
    private HashMap<String, Double> note;
    
    // CONSTRUCTOR
    public PromissoryNote() {
        this.note = new HashMap<String, Double>();
    }
    
    // METHOD. Stores info about loans to specific people
    public void setLoan(String toWhom, double value) {
        this.note.put(toWhom, value);
    }
    
    // METHOD. Returns the entrity of the debt held by the parameter person
    public double howMuchIsTheDebt(String whose) {
        if (this.note.containsKey(whose)) {
            return this.note.get(whose);
        }
        return 0;
    }
    
}
