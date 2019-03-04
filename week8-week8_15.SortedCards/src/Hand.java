import java.util.*;

public class Hand implements Comparable<Hand> {
    
    private List<Card> handCards;
    
    // CONSTRUCTOR
    public Hand() {
        this.handCards = new ArrayList<Card>();
    }
    
    // METHOD. Add card to cards on hand
    public void add(Card card) {
        this.handCards.add(card);
    }
    
    // METHOD. Sort all cards on hand in ascending order
    public void sort() {
        Collections.sort(this.handCards);
    }
    
    // METHOD. Print all cards on hand
    public void print() {
        
        for (Card card : this.handCards) {
            System.out.println(card);
        }
    }
    
    // METHOD. Calculates the sum of the cards value on hand
    public int handValue(List<Card> cards) {
        int sum = 0;
        
        for (Card card : cards) {
            sum += card.getValue();
        }
        
        return sum;
    }
    
    // METHOD. Hand's cards are sorted according to the comparator SortAgainstSuitAndValue
    // After sorting, the cards are printed in order
    public void sortAgainstSuit() {
        
        Collections.sort(handCards,new SortAgainstSuitAndValue() );
    }
    
    
    @Override
    public int compareTo(Hand hand) {
        if (this.handValue(this.handCards) > this.handValue(hand.handCards) ) {
            return 1;
        }
        if (this.handValue(this.handCards) < this.handValue(hand.handCards) ) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
