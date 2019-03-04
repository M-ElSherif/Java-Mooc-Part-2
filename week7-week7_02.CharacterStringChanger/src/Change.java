import java.util.*;

public class Change {
    
    private char fromCharacter;
    private char toCharacter;
    
    // CONSTRUCTOR. Creates an object that makes changes from character fromCharacter to toCharacter
    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }
    
    //METHOD. returns the changed version of the given character string
    public String change(String characterString) {
        
        String replacedString = characterString.replace(this.fromCharacter, this.toCharacter);
        return replacedString;
    }
}
