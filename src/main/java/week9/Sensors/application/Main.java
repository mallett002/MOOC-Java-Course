package week9.Sensors.application;

public class Main {
    public static void main(String... args) {
//        ConstantSensor ten = new ConstantSensor(10);
//        ConstantSensor minusFive = new ConstantSensor(-5);
//
//        System.out.println( ten.measure() );
//        System.out.println( minusFive.measure() );
//
//        System.out.println( ten.isOn() );
//        ten.off();
//        System.out.println( ten.isOn() ); // doesn't turn off

        // *** Thermometer ***
//        Thermometer thermo = new Thermometer();
//        System.out.println("Thermometer is on ?: " + thermo.isOn());
//
//        thermo.on();
//        System.out.println("Thermometer is on ?: " + thermo.isOn());
//
//        int temp = thermo.measure();
//        System.out.println(temp);
//
//        thermo.off();
//        int badVal = thermo.measure();

        // *** Average Sensor ***
        Sensor kumpula = new Thermometer();
        Sensor kaisaniemi = new Thermometer();
        Sensor helsinkiVantaa = new Thermometer();

        AverageSensor helsinkiArea = new AverageSensor();
        helsinkiArea.addSensor(kumpula);
        helsinkiArea.addSensor(kaisaniemi);
        helsinkiArea.addSensor(helsinkiVantaa);

        helsinkiArea.on(); // Turns all the sensors on
        // Each time a thermometer.measure() is called, returns random reading
        System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
        System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
        System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");

        System.out.println("readings: " + helsinkiArea.readings());
    }
}
