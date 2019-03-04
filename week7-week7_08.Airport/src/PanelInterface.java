
import java.util.*;

public class PanelInterface {

    private Scanner reader;
    private Airport airport;

    // CONSTRUCTOR
    public PanelInterface(Scanner reader, Airport airport) {
        this.reader = reader;
        this.airport = airport;
    }

    //---------------------------------------------------------------
    // METHOD. Starts panel interface 
    public void startPanel(Scanner reader) {

        System.out.println("Airport panel\n"
                + "--------------------\n"
                + "\n");

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");

            String input = this.reader.nextLine();

            if (input.equals("1")) {
                this.addAirplane(reader);
            }
            if (input.equals("2")) {
                this.addFlight(reader);
            }
            if (input.equals("x")) {
                break;
            }
        }
    }

    //---------------------------------------------------------------
    // METHOD. Start service interface
    public void startSerivce(Scanner reader) {

        System.out.println("Flight service\n"
                + "------------\n"
                + "");

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");

            String input = this.reader.nextLine();

            if (input.equals("1")) {
                this.printPlanes();
            }
            if (input.equals("2")) {
                this.printFlights();
            }
            if (input.equals("3")) {
                System.out.println("Give plane ID: ");
                this.printPlaneInfo(reader);
            }
            if (input.equals("x")) {
                break;
            }
        }

    }

    //---------------------------------------------------------------
    // METHOD. Add airplane into airport log
    public void addAirplane(Scanner reader) {

        System.out.println("Give plane ID: ");
        String planeID = this.reader.nextLine();
        System.out.println("Give plane capacity: ");
        int capacity = Integer.parseInt(this.reader.nextLine());

        this.airport.addPlane(planeID, capacity);

    }

    //---------------------------------------------------------------
    // METHOD. Add flight into airport log
    public void addFlight(Scanner reader) {

        System.out.println("Give plane ID: ");
        String planeID = this.reader.nextLine();
        System.out.println("Give departure airport code: ");
        String departure = this.reader.nextLine();
        System.out.println("Give destination airport code: ");
        String destination = this.reader.nextLine();

        Flight flight = new Flight(planeID, departure, destination);
        this.airport.addFlight(flight);
    }

    //---------------------------------------------------------------
    // METHOD. Print all planes
    public void printPlanes() {

        HashMap<String, Integer> airplaneList = this.airport.getAirplanes();

        for (String key : airplaneList.keySet()) {
            System.out.println(key + " (" + airplaneList.get(key) + " ppl)");
        }
    }

    //---------------------------------------------------------------
    // METHOD. Print all flights
    public void printFlights() {

        ArrayList<Flight> flightList = this.airport.getFlights();
        HashMap<String, Integer> airplaneList = this.airport.getAirplanes();

        for (Flight flight : flightList) {
            String planeID = flight.getPlaneID();
            System.out.println(planeID + " (" + airplaneList.get(planeID) + " ppl) ("
                    + flight.getDeparture() + "-" + flight.getDestination() + ")");
        }
    }

    //---------------------------------------------------------------
    // METHOD. Print all planes' info
    public void printPlaneInfo(Scanner reader) {
        String planeID = this.reader.nextLine();
        
        HashMap<String, Integer> airplaneList = this.airport.getAirplanes();
        
        if (airplaneList.containsKey(planeID)) {
            System.out.println(planeID + " (" + airplaneList.get(planeID) + " ppl)");
        }

    }
}
