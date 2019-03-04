package application;

import java.util.*;

public class Thermometer implements Sensor {

    private int status; // indicates if thermometer is on or off

    // CONSTRUCTOR
    public Thermometer() {
    }

    @Override
    public boolean isOn() {
        if (this.status == 1) {
            return true;
        }
        return false;
    }

    @Override
    public void on() {
        this.status = 1;
    }

    @Override
    public void off() {
        this.status = 0;
    }

    // INTERFACE METHOD. Returns random number between -30 to 30
    @Override
    public int measure() {
        if (this.isOn()) {
            Random random = new Random();
            int min = -30; // lower bound
            int max = 61;  // upper bound
            int randomNumber = min + random.nextInt(max);
            return randomNumber;
        }
        else {
            throw new IllegalStateException("Thermometer is OFF!");
        }
    }
    
}
