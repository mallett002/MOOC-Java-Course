package week4.Random;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        WeatherForecaster forecaster = new WeatherForecaster();

        // Use a list to help organize things
        ArrayList<String> days = new ArrayList<>();
        Collections.addAll(days, "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"); // add all of these into days

        System.out.println("Weather forecast for the next week:");
        for (String day : days) {
            String weatherForecast = forecaster.forecastWeather();
            int temperatureForecast = forecaster.forcastTemperature();

            System.out.println(day + ": " + weatherForecast + " " + temperatureForecast + " degrees.");
        }
    }
}
