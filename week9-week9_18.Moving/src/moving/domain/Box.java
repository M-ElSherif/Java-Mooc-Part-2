package moving.domain;

import java.util.*;

public class Box implements Thing {
    
    private int maximumCapacity;
    private List<Thing> box;
    
    // CONSTRUCTOR
    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.box = new ArrayList<Thing>();
    }
    
    // METHOD. If max box capacity not exceeded, add the item and return true
    public boolean addThing(Thing thing) {
        
        if (thing.getVolume() + this.getVolume() <= maximumCapacity ) {
            this.box.add(thing);
            return true;
        }
        return false;
    }

    // METHOD. Returns the total volume of the items in the box
    public int getVolume() {
        int boxVolume = 0;
        
        for (Thing thing : this.box) {
            boxVolume += thing.getVolume();
        }
        
        return boxVolume;
    }
    
    @Override
    public String toString() {
        return "  items in the box" + this.box;
    }
}
