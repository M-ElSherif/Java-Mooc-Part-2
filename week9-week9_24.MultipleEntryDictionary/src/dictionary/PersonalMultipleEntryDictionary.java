package dictionary;

import java.util.*;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private Map<String, Set<String>> words;

    // CONSTRUCTOR
    public PersonalMultipleEntryDictionary() {
        this.words = new HashMap<String, Set<String>>();
    }

    // INTERFACE METHOD
    public void add(String word, String entry) {
        // if word not in Map, we put the entry and create new corresponding 
        // empty Set
        if (!this.words.containsKey(word)) {
            this.words.put(word, new HashSet<String>());
        }
        this.words.get(word).add(entry);    // retrieve the parameter word, and add parrameter entry
    }

    // INTERFACE METHOD
    public Set<String> translate(String word) {
        if(!this.words.containsKey(word)) {
            return null;
        }
        
        Set<String> translations = this.words.get(word);
        return translations;
    }

    // INTERFACE METHOD
    public void remove(String word) {
        this.words.remove(word);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PersonalMultipleEntryDictionary other = (PersonalMultipleEntryDictionary) obj;
        if (this.words != other.words && (this.words == null || !this.words.equals(other.words))) {
            return false;
        }
        return true;
    }

}
