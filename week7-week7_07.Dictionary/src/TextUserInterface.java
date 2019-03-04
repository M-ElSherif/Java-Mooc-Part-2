
import java.util.*;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    // CONSTRUCTOR
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    //-------------------------------------------------------------------------
    // METHOD. Starts the text user interface
    public void start() {

        while (true) {
            System.out.println("Statement:");
            System.out.println("quit - quit the text user interface");
            System.out.println("");

            System.out.print("Statement: ");
            String input = this.reader.nextLine();

            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }
            if (input.equals("add")) {
                this.add();
            }
            if (input.equals("translate")) {
                this.translate();
            } else {
                System.out.println("Unknown statement");
            }
        }

    }

    //-------------------------------------------------------------------------
    // METHOD. Asks for a word pair and adds them to the dictionary
    public void add() {
        System.out.print("In Bazrameet: ");
        String word = this.reader.nextLine();
        System.out.print("Translation: ");
        String translation = this.reader.nextLine();
        
        this.dictionary.add(word, translation);
        
    }

    //-------------------------------------------------------------------------
    // METHOD. Asks for a word from the user and prints the translation
    public void translate() {
        System.out.print("Give a word: ");
        String word = this.reader.nextLine();
        System.out.print(this.dictionary.translate(word));
    }
}
