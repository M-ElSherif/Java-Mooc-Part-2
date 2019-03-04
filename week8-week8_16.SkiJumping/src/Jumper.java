import java.util.*;

public class Jumper implements Comparable<Jumper>{
    
    private String name;
    private int points;
    private List<Integer> lengths;
    
    // CONSTRUCTOR
    public Jumper(String name, int points) {
        this.name = name;
        this.points = points;
        this.lengths = new ArrayList<Integer>();
    }
    
    // GETTER
    public String getJumperName() {
        return this.name;
    }
    
    // GETTER
    public int getJumperPoints() {
        return this.points;
    }
    
    // SETTER
    public void setJumperPoints(int points) {
        this.points = points;
    }
    
    // METHOD. Adds a jump length to the lengths array
    public void addLength(int length) {
        this.lengths.add(length);
    }
    
    // GETTER
    public List<Integer> getLengths() {
        return this.lengths;
    }
    
    @Override
    public int compareTo(Jumper jumper) {
        return this.points - jumper.points;
    }
    
}
