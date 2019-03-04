import java.util.*;

public class Reader {
     
    private final Scanner reader = new Scanner(System.in);
    
    // METHOD. Reads input string and returns it
    public String readString() {
        
        String inputString = this.reader.nextLine();
        return inputString;
    }
    
    // METHOD. Reads input integer and returns it
    public int readInteger() {

        int inputInteger = Integer.parseInt(this.reader.nextLine());
        return inputInteger;
    }
    
}
