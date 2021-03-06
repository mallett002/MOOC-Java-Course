package week8.CarRegistrationCenter;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String... args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");
        if (!finnish.contains(newPlate)) finnish.add(newPlate);

        System.out.println("Finnish: " + finnish);

        HashMap<RegistrationPlate, String> owners = new HashMap<>();
        owners.put(reg1, "Arto");
        owners.put(reg3, "Jurgen");

        System.out.println("owners:");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));
    }
}
