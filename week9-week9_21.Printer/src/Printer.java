
import java.util.*;
import java.io.File;

public class Printer {

    private File file;
    // CONSTRUCTOR
    public Printer(String fileName) throws Exception {
        this.file = new File(fileName); 
    }
    
    // METHOD. Prints every line in the file that contain the parameter word
    public void printLinesWhichContain(String word) throws Exception {
        Scanner reader = new Scanner(this.file);
        
        while (reader.hasNext()) {
            String nextWord = reader.nextLine();
            
            if (nextWord.contains(word)) {
                System.out.println(nextWord);
            }
        }
    }
}
