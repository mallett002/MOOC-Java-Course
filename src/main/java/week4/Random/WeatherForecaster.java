package week4.Random;

import java.util.Random;

public class WeatherForecaster {
    private Random random;

    public WeatherForecaster() {
        this.random = new Random();
    }

    public String forecastWeather() {
        double probability = this.random.nextDouble();

        if (probability <= 0.1) {
            return "Sleet";
        } else if (probability <= 0.4) {
            return "Snow";
        } else {
            return "Sunny";
        }
    }

    public int forcastTemperature() {
        return (int) (4 * this.random.nextGaussian() - 3);
    }
}
