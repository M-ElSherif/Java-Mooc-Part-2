
public class Thing {
    
    private String name;
    private int weight;
    
    // CONSTRUCTOR
    public Thing(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    // GETTER
    public String getName() {
        return this.name;
    }
    
    // GETTER
    public int getWeight() {
        return this.weight;
    }
    
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }
}
