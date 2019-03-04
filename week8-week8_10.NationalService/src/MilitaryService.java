
public class MilitaryService implements NationalService {
    
    private int daysLeft;
    
    // CONSTRUCTOR
    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }
    
    // INTERFACE METHOD
    public int getDaysLeft() {
        return this.daysLeft;
    }
    
    // INTERFACE METHOD
    public void work() {
        this.daysLeft--;
        
        if (this.daysLeft < 0) {
            this.daysLeft = 0;
        }
    }

}
