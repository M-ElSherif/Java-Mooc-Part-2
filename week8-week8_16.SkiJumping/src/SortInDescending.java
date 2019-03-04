import java.util.*;

public class SortInDescending implements Comparator<Jumper>{
    public int compare(Jumper jumper1, Jumper jumper2) {
        return jumper2.getJumperPoints() - jumper1.getJumperPoints();
    }
    
}
