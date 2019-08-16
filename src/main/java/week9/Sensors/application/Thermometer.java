package week9.Sensors.application;

import java.util.Random;

public class Thermometer implements Sensor {
    private boolean turnedOn;


    public Thermometer() {
        this.turnedOn = false;
    }

    @Override
    public boolean isOn() {
        return this.turnedOn;
    }

    @Override
    public void on() {
        if (!isOn()) {
            this.turnedOn = true;
        }
    }

    @Override
    public void off() {
        if (isOn()) {
            this.turnedOn = false;
        }
    }

    @Override
    public int measure() {
        if (isOn()) {
            Random random = new Random();
            int temp = random.nextInt(31);
            int negOrPosIndex = random.nextInt(2);
            Integer[] negativeOrNot = {1, -1};

            if (temp != 0) {
                return temp * negativeOrNot[negOrPosIndex];
            }
            return temp;
        } else {
            throw new IllegalStateException("Thermometer is turned off.");
        }
    }
}
