
import java.util.*;

public class Suitcase {

    private int suitcase_maxweight;
    private ArrayList<Thing> things = new ArrayList<Thing>();

    // CONSTRUCTOR
    public Suitcase(int maxweight) {
        this.suitcase_maxweight = maxweight;
    }

    //-------------------------------------------------------------------------------
    // METHOD. If max weight limit not exceeded, add thing
    public void addThing(Thing thing) {

        if (!this.weightLimitExceed(thing)) {
            this.things.add(thing);
        }
    }

    //-------------------------------------------------------------------------------
    // METHOD. Checks if the weight limit has been exceeded. If exceeded, returns true
    public boolean weightLimitExceed(Thing thing) {

        if ((this.totalWeight() + thing.getWeight()) > this.suitcase_maxweight) {
            return true;
        }
        return false;
    }

    //-------------------------------------------------------------------------------
    // METHOD
    public int totalWeight() {
        int weight = 0;

        // loop through things arraylist to determine total weight of things inside
        for (Thing thing : this.things) {
            weight += thing.getWeight();
        }

        return weight;
    }

    //-------------------------------------------------------------------------------
    // METHOD
    public void printThings() {

        System.out.println("Your suitcase contains the following things:");

        for (Thing thing : this.things) {
            System.out.println(thing.getName() + "(" + thing.getWeight() + " kg)");
        }
        System.out.println("Total weight: " + this.totalWeight() + " kg");
    }

    //-------------------------------------------------------------------------------
    // METHOD
    public Thing heaviestThing() {
        if (this.things.isEmpty()) {
            return null;
        }
        int heaviest_weight = 0;
        Thing heaviestThing = new Thing("", 0);

        // loop through suitcase things array. If a heavier thing is found,
        // the thing's name and weight are assigned to the heaviest variables
        for (Thing thing : this.things) {
            if (thing.getWeight() > heaviest_weight) {
                heaviestThing = thing;
                heaviest_weight = thing.getWeight();
            }

        }
        return heaviestThing;
    }
    
    //-------------------------------------------------------------------------------
    // METHOD

    public String toString() {

        int amount_things = things.size();

        if (amount_things == 0) {
            return "empty" + " 0 kg";
        } else if (amount_things == 1) {
            return amount_things + " thing " + " (" + totalWeight() + " kg)";
        }
        return amount_things + " things " + " (" + totalWeight() + " kg)";
    }

}
