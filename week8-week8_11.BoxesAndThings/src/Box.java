
import java.util.*;

public class Box implements ToBeStored {

    private double maxWeight;   // in kilograms
    private ArrayList<ToBeStored> box;

    // CONSTRUCTOR
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.box = new ArrayList<ToBeStored>();
    }
    
    
    // METHOD. Returns the current box weight
    public double weight() {
        double boxWeight = 0;
        
        for (ToBeStored item : this.box) {
            boxWeight += item.weight();
        }
        
        return boxWeight;
    }
    
    // METHOD. Checks if current item can be added to the box
    // according to the weight
    public boolean checkWeight(ToBeStored item) {
        
        double newWeight = item.weight() + this.weight();
        
        if ( newWeight < this.maxWeight ) {
            return true;
        }
        return false;
    }

    // METHOD. Adds to box an item that implements ToBeStored interface
    // item weight must not exceed max weight of box
    public void add(ToBeStored item) {
        
        if (this.checkWeight(item)) {
            box.add(item);
        }
        
    }
    
    @Override
    public String toString() {
        return "Box: " + box.size() + " things, total weight " + this.weight() + " kg";
    }

}
