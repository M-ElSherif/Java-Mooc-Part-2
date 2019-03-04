package tools;

import java.util.*;

public class PersonalDuplicateRemover implements DuplicateRemover{
    
    private Set<String> characterStrings;
    private int numberOfDuplicates;
    
    // CONSTRUCTOR
    public PersonalDuplicateRemover() {
        this.characterStrings = new HashSet<String>();
        this.numberOfDuplicates = 0;
    }
    
    // INTERFACE METHOD. Stores a characterString if its not a duplicate
    public void add(String characterString) {
        if(!this.characterStrings.contains(characterString)) {
            this.characterStrings.add(characterString);
        }
        else if(this.characterStrings.contains(characterString)) {
            this.numberOfDuplicates++;
        }
    }

    // INTERFACE METHOD. Returns the number of detected duplicates
    public int getNumberOfDetectedDuplicates() {
        return this.numberOfDuplicates;
    }
    
    // INTERFACE METHOD. Returns a set of unique characterStrings. If there are none
    // it returns empty set.
    public Set<String> getUniqueCharacterStrings() {
        
        if(this.characterStrings.isEmpty()) {
            return new HashSet<String>();
        }
        return this.characterStrings;
    }
    
    // INTERFACE METHOD. Removes stored characterStrings and resets the amount
    // of detected duplicates
    public void empty() {
        this.characterStrings.clear();
        this.numberOfDuplicates = 0;
    }
}
