package week5.Clock;

import week4.ClockUsingACounter.BoundedCounter;

public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hours, int minutes, int seconds) {
        this.hours = new BoundedCounter(23);
        this.minutes = new BoundedCounter(59);
        this.seconds = new BoundedCounter(59);

        this.hours.setValue(hours);
        this.minutes.setValue(minutes);
        this.seconds.setValue(seconds);
    }

    public void tick() {
        this.seconds.next();
        if (seconds.getValue() == 0) {
            this.minutes.next();
            if (this.minutes.getValue() == 0) {
                this.hours.next();
            }
        }
    }

    public String toString() {
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
