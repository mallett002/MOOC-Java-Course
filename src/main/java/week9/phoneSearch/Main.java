package week9.phoneSearch;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    private static Contacts contacts;
    private static Scanner reader;

    public static void main(String[] args) {
        contacts = new Contacts();
        reader = new Scanner(System.in);

        printUserInterface();
        hydrateContacts();
        startProgram();
    }

    public static void startProgram() {
        String input = "";

        while (!input.equals("x")) {
            System.out.print("command: ");
            input = reader.nextLine().toLowerCase();

            if  (input.equals("1")) {
                addNumber();
            } else if (input.equals("2")) {
                getNumber();
            } else if (input.equals("3")) {
                getPersonByNumber();
            } else if (input.equals("4")) {
                addAddress();
            } else if (input.equals("5")) {
                getPersonalInfo();
            } else if (input.equals("6")) {
                deletePersonalInfo();
            } else if (input.equals("7")) {
                System.out.println("You entered " + input);
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Not a valid entry");
            }
        }
    }

    public static void printUserInterface() {
        System.out.println(
            "phone search\n" +
            "available operations\n" +
            " 1 add a number\n" +
            " 2 search for a number\n" +
            " 3 search for a person by phone number\n" +
            " 4 add an address\n" +
            " 5 search for personal information\n" +
            " 6 delete personal information\n" +
            " 7 filtered listing\n" +
            " x quit"
        );
    }

    public static void hydrateContacts() {
        // Create people
        contacts.addPerson("Will");
        contacts.addPerson("Marcela");
        contacts.addPerson("Brad");
        contacts.addPerson("Matt");
        contacts.addPerson("Aaron");

        // Get people
        Person will = contacts.getPerson("Will");
        Person marcela = contacts.getPerson("Marcela");
        Person brad = contacts.getPerson("Brad");
        Person matt = contacts.getPerson("Matt");
        Person aaron = contacts.getPerson("Aaron");

        // Adding numbers
        will.addNumber("319-531-7602");
        marcela.addNumber("231-234-2345");
        matt.addNumber("232-345-2345");

        // Adding addresses
        will.addAddress("203 Harmony St.","Des Moines");
        brad.addAddress("1775 Woodward Ave","Houston");
        aaron.addAddress("1620-280th St.", "Old York");
    }

    public static void addNumber() {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        Person person = contacts.getPerson(name);

        System.out.print("number: ");
        String number = reader.nextLine();
        person.addNumber(number);
        System.out.println();
    }

    public static void getNumber() {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        Person person = contacts.getPerson(name);

        Set<String> numbers = person.getNumbers();
        if (numbers.size() == 0) {
            System.out.println("Not found");
        } else {
            numbers.forEach(System.out::println);
        }

        System.out.println();
    }

    public static void getPersonByNumber() {
        System.out.print("number: ");
        String number = reader.nextLine();

        String personName = contacts.getPeople().keySet().stream()
                .filter(name -> contacts.getPerson(name).getNumbers().contains(number))
                .findFirst()
                .get();

        System.out.println(personName);
    }

    public static void addAddress() {
        System.out.print("name: ");
        String name = reader.nextLine();

        System.out.print("street: ");
        String street = reader.nextLine();

        System.out.print("city: ");
        String city = reader.nextLine();

        contacts.getPerson(name).addAddress(street, city);
        System.out.println();
    }

    public static void getPersonalInfo() {
        System.out.print("whose information: ");
        String name = reader.nextLine();

        Person person = contacts.getPerson(name);
        String[] streetAndCity = person.getAddress();
        Set<String> phoneNumbers = person.getNumbers();

        Boolean noAddress = streetAndCity.length != 2 ||
                streetAndCity[0] == null ||
                streetAndCity[1] == null;

        // Build the address string
        String address = "address: ";
        if (noAddress) {
            address = "address unknown";
        } else {
            address += Arrays.asList(streetAndCity)
                    .stream()
                    .collect(Collectors.joining(" "));
        }

        // build the phone numbers string
        String phoneNumbersToString = phoneNumbers.stream()
                .collect(Collectors.joining("\n"));

        String numbers = "phone numbers: ";
        if (phoneNumbers.size() == 0) {
            numbers = "phone number not found";
        } else {
            numbers += phoneNumbersToString;
        }

        // Print address and string together
        System.out.println(address + "\n" +
                numbers);
    }

    public static void deletePersonalInfo() {
        System.out.print("delete info for whom: ");
        String name = reader.nextLine();

        Boolean isPersonalInfoCleared = contacts.getPerson(name).clearPersonalInfo();
        if (isPersonalInfoCleared) {
            System.out.println("Personal info for " + name + " has been removed.");
        } else {
            System.out.println("There was an error removing information for " + name);
        }
    }
}
