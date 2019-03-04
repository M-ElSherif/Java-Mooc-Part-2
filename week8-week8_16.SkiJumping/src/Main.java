
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        String input = "joe\n" + "lola\n" + "zizi\n" + "\n"
                + "jump\n" + "jump\n" + "quit";

        Scanner scanner = new Scanner(System.in);
//          Scanner scanner = new Scanner(input);

        Tournament tournament = new Tournament();
        tournament.start(scanner);

    }
}
