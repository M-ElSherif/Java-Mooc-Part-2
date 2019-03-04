
import java.util.*;

public class SortAgainstSuitAndValue implements Comparator<Card> {
    
    // CONSTRUCTOR
    public SortAgainstSuitAndValue() {
        
    }

    // METHOD. Compares 2 cards. Returns negative if card1 less than card2,
    // positive if card2 before card1, and 0 otherwise
    @Override
    public int compare(Card card1, Card card2) {
        if (card1.getSuit() - card2.getSuit() == 0) {
            return card1.getValue() - card2.getValue();
        } else {
            return card1.getSuit() - card2.getSuit();
        }
    }
}
