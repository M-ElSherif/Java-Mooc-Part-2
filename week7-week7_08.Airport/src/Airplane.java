import java.util.*;

public class Airplane {
    
    private String id;
    private int capacity;
    
    
    // CONSTRUCTOR
    public Airplane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    
    // GETTER
    public String getID() {
        return this.id;
    }
    
    // GETTER
    public int getCapacity() {
        return this.capacity;
    }
    
}
