package week9.Sensors.application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }

    public void addSensor(Sensor newSensor) {
        sensors.add(newSensor);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }

        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                sensor.on();
            }
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if (!isOn()) {
            throw new IllegalStateException("The sensor needs to be on");
        } else if (sensors.size() == 0) {
            throw new IllegalStateException("Add a sensor to get an average");
        }

        int sum = 0;

        for (Sensor sensor : sensors) {
            sum += sensor.measure();
        }

        int average = sum / sensors.size();

        this.readings.add(average);

        return average;
    }

    public List<Integer> readings() {
        return this.readings;
    }
}
