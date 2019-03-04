
import java.util.*;

public class Flight {

    private String planeID;
    private String departure;   // deparature airport code
    private String destination; // destination airport code

    // CONSTRUCTOR
    public Flight(String planeID, String departure, String destination) {
        this.planeID = planeID;
        this.departure = departure;
        this.destination = destination;
    }

    // GETTER
    public String getPlaneID() {
        return this.planeID;
    }
    
    // GETTER
    public String getDeparture() {
        return this.departure;
    }

    // GETTER
    public String getDestination() {
        return this.destination;
    }

}

