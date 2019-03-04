import java.util.*;

public class CivilService implements NationalService  {
    
    private int daysLeft;
    
    // CONSTRUCTOR
    public CivilService() {
        this.daysLeft = 362;
    }
    
    // INTERFACE METHOD
    public int getDaysLeft() {
        return this.daysLeft;
    }

    
    // INTERFACE METHOD
    public void work() {
        this.daysLeft--;
        
        if (this.daysLeft < 0 ) {
            this.daysLeft = 0;
        }
    }
    
}
