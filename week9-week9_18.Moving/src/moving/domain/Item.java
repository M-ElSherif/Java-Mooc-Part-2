package moving.domain;

public class Item implements Thing, Comparable<Item> {
    
    private String itemName;
    private int volume;
    
    // CONSTRUCTOR
    public Item(String itemName, int volume) {
        this.itemName = itemName;
        this.volume = volume;
    }

    // GETTER
    public String getName() {
        return this.itemName;
    }
    
    // INTERFACE METHOD
    @Override
    public int getVolume() {
        return this.volume;
    }
    
    @Override
    public String toString() {
        return this.itemName + " (" + this.volume + " dm^3)";  
    }

    @Override
    public int compareTo(Item other) {
        return this.getVolume() - other.getVolume();
    }
    
}
