package week9.Sensors.application;

public interface Sensor {
    boolean isOn();
    void on();
    void off();
    int measure(); // gets reading if on. throws IllegalStateException if off
}
