
import java.util.*;

public class Container {

    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();
    private int container_maxweight;

    // CONSTRUCTOR
    public Container(int maxweight) {
        this.container_maxweight = maxweight;
    }

    //-------------------------------------------------------------------------------
    // METHOD. Adds a suitcase to the container if weight limit will not be exceeded
    public void addSuitcase(Suitcase suitcase) {

        if (!weightLimitExceed(suitcase)) {
            suitcases.add(suitcase);
        }

    }

    //-------------------------------------------------------------------------------
    // METHOD. Checks if the weight limit of the container has been exceeded.
    // Returns true if exceeded
    public boolean weightLimitExceed(Suitcase suitcase) {
        // if the curent weight of the container plus the parameter suitcase weight exceed the limit
        // return true. Else return false
        if ((this.totalWeight() + suitcase.totalWeight()) > this.container_maxweight) {
            return true;
        }
        return false;
    }

    //-------------------------------------------------------------------------------
    // METHOD. Calculates the total weight of suitcases inside the container
    public int totalWeight() {
        int weight = 0;

        // loop through things arraylist to determine total weight of suitcases
        for (Suitcase suitcase : this.suitcases) {
            weight += suitcase.totalWeight();
        }

        return weight;

    }

    //-------------------------------------------------------------------------------
    // METHOD. Print all items inside container's suitcases
    public void printThings() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printThings();
        }
    }
    
    //-------------------------------------------------------------------------------
    // METHOD.
    public String toString() {
        int amount_suitcases = suitcases.size();
        
        return amount_suitcases + " suitcases" + " (" + totalWeight() + " kg)";
    }
}
