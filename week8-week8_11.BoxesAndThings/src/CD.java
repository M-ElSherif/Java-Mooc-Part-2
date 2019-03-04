import java.util.*;

public class CD implements ToBeStored {
    
    private String artist;
    private String title;
    private int publishYear;
    private static final double weight = 0.1;  // kilograms
    
    // CONSTRUCTOR
    public CD(String artist, String title, int publishYear) {
        this.artist = artist;
        this.title = title;
        this.publishYear = publishYear;
    }
    
    // INTERFACE METHOD
    public double weight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.title + " (" + this.publishYear + ")";
    }
}
