package file;

import java.io.File;
import java.util.*;

public class Analysis {

    private File file;

    // CONSTRUCTOR
    public Analysis(File file) {
        this.file = file;
    }

    // METHOD. Returns the number of lines of the file the constructor recieved 
    // as parameter
    public int lines() {
        String fileText = this.readFile();
        String[] lines = fileText.split("\n");  // converts the file text into string array, containing the lines
        return lines.length;    // returns the length of string array
    }

    // METHOD. Returns the number of characters of the file constructor recieved 
    // as parameter
    public int characters() {
        String fileText = this.readFile();
        return fileText.length();
    }
    
    // METHOD. Reads the file, parses the lines into a string,
    // and handles file not found exception error
    private String readFile() {
        try {
            String string = "";
            Scanner reader = new Scanner(this.file);
            
            while(reader.hasNextLine()) {
                string += reader.nextLine();
                string += "\n";
            }
            
            return string;
        } catch (Exception e) {
            return "";
            
        }
    }
}
