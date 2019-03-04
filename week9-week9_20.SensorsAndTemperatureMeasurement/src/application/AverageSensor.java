
package application;

import java.util.*;

public class AverageSensor implements Sensor{

    private List<Sensor> sensors;
    private List<Integer> readings;
    
    // CONSTRUCTOR
    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
        
    }
    
    // INTERFACE METHOD. Check the sensors to determine on or off status
    @Override
    public boolean isOn() {
        int offCount = 0;
        
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                offCount++;
            }
        }
        if (offCount > 0) {
            return false;
        }
        return true;
    }

    @Override
    public void on() {
        // swtiches on all sensors
        for (Sensor sensor : this.sensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        // switches off all sensors
        for (Sensor sensor : this.sensors) {
            sensor.off();
        }
    }

    // INTERFACE METHOD. Returns average of sensor readings
    @Override
    public int measure() {
        int sum = 0;
        int avg = 0;
        
        if (!this.isOn() || this.sensors == null) {
            throw new IllegalStateException("Sensors are off or no sensors found!");
        }
        for (Sensor sensor : this.sensors) {
            sum += sensor.measure();
        }
        avg = sum / this.sensors.size();
        this.readings.add(avg);
        return avg;
    }
    
    // METHOD. Returns a list of the reading results of all the measurements
    // executed through your AverageSensor.
    public List<Integer> readings() {
        return this.readings;
    }
    
}
