
import java.util.*;

public class Airport {

    private Flight flight;
    private ArrayList<Flight> airportFlights;
    private ArrayList<Airplane> airplanes;
    private HashMap<String, Integer> Airplanes;

    // CONSTRUCTOR
    public Airport() {
        this.Airplanes = new HashMap<String, Integer>();
        this.airplanes = new ArrayList<Airplane>();
        this.airportFlights = new ArrayList<Flight>();
    }

    // GETTER
    public HashMap getAirplanes() {
        return this.Airplanes;
    }

    // GETTER
    public ArrayList getFlights() {
        return this.airportFlights;
    }

    //---------------------------------------------------------------
    // METHOD. Adds airplane to the airport
    public void addPlane(String ID, Integer capacity) {
        this.Airplanes.put(ID, capacity);
    }

    //---------------------------------------------------------------
    // METHOD. Adds a flight to the airport
    public void addFlight(Flight flight) {
        this.airportFlights.add(flight);
    }

    //---------------------------------------------------------------
}
