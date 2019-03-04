import java.util.*;

public class Book implements ToBeStored {
    
    private String writer;
    private String name;
    private double weight;
    
    // CONSTRUCTOR
    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }
    
    
    // INTERFACE METHOD
    public double weight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
      return this.writer + ": " + this.name;
    }

    
    
}

