import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = "1\n" + "HA-LOL\n" + "50\n"  // test add plane
                        + "1\n" + "GW-OWAC\n" + "64\n"  // test add plane
                        + "2\n" + "HA-LOL\n" + "BAL\n" + "HEL\n" +"x\n" // test add flight
                        + "2\n" + "GW-OWAC\n" + "HEL\n" + "BAL\n" +"x\n" // test add flight
                        + "1\n" + "2\n" 
                        + "3\n" + "HA-LOL\n" + "x\n";
        
        
        Scanner reader = new Scanner(System.in);
        Airport airport = new Airport();
        
        PanelInterface ui = new PanelInterface(reader, airport);
        ui.startPanel(reader);
        ui.startSerivce(reader);
    }
}
