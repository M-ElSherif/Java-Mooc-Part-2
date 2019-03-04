package application;

/* ConstantSesnor is online at all times. Interface methods
on() and off() do nothing */

public class ConstantSensor implements Sensor {

    private int parameter;

    // CONSTRUCTOR
    public ConstantSensor(int parameter) {
        this.parameter = parameter;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {
    }

    @Override
    public void off() {
    }

    @Override
    public int measure() {
        return this.parameter;
    }

}
