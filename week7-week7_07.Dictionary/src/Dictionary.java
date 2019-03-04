
import java.util.*;

public class Dictionary {

    private HashMap<String, String> dictionary;

    // CONSTRUCTOR
    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    //-------------------------------------------------------------------------
    // METHOD. Returning the translation of its parameter. If word unknown
    // it returns null
    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        return null;
    }

    //-------------------------------------------------------------------------
    // METHOD. Adds a new translation to the dictionary
    public void add(String word, String translation) {
        this.dictionary.put(word, translation);
    }
    
    //-------------------------------------------------------------------------
    // METHOD. Returns size of the HashMap dictionary
    public int amountOfWords() {
        return this.dictionary.size();
    }
    
    //-------------------------------------------------------------------------
    // METHOD. Returns ArrayList translationList in the for key = value
    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<String>();
        
        for ( String key : dictionary.keySet() ) {
            String translation = key + " = " + dictionary.get(key);
            translationList.add(translation);
        }
        return translationList;
    }
    
}
