
import file.*;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File("test/testfile.txt");
        
        Analysis analysis = new Analysis(file);
        System.out.println("Lines: " + analysis.lines());
        System.out.println("Character count: " + analysis.characters());

    }
}
