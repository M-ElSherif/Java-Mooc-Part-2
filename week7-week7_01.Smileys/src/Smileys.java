
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
//        printWithSmileys("\\:)/");
        printWithSmileys("Beerbottle");
//        printWithSmileys("Interface");
    }

    //---------------------------------------------------------------------------------------
    // METHOD. prints the top and bottom smileys rows
    private static void printSmileys(int number) {

        // while counter is less or equal to amount of smileys
        for (int i = 0; i <= number; i++) {
            System.out.print(":)");
        }
        System.out.println("");
    }

    //---------------------------------------------------------------------------------------
    // METHOD. Creates the string in the middle
    // if length of parameter string is odd, add 2 whitespaces to the right of string
    // else, add just 1 space
    private static String createTheStringInTheMiddle(String characterString) {
        
        String returnedString = " " + characterString + " ";
        int length = characterString.length();  // length of method parameter string
        
        if (length % 2 == 1) {
            return returnedString + " ";
        } 
        else {
            return returnedString;
        }
    }

    //---------------------------------------------------------------------------------------
    // METHOD. Prints the top and bottom rows of smileys
    private static void printWithSmileys(String characterString) {

        // each smiley is 2 characters long. Total number of smileys

        int amount = (characterString.length() + 5) / 2;

        // top row smileys
        printSmileys(amount);
        System.out.println(":)" + createTheStringInTheMiddle(characterString) + ":)");
        printSmileys(amount);


    }
}
