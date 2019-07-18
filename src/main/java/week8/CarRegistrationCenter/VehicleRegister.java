package week8.CarRegistrationCenter;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {
    private final HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<>();
    }

    public boolean hasNoOwnerThenAdddOne(RegistrationPlate plate, String owner) {
        if (owners.get(plate) == null) {
            owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String getOwner(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            return owners.get(plate);
        }
        return null;
    }

    public boolean hasOwnerThenDelete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : this.owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> owner = new ArrayList<>();

        for (RegistrationPlate plate : this.owners.keySet()) {
            String ownerName = owners.get(plate);
            if (!owner.contains(ownerName)) {
                owner.add(ownerName);
            }
        }

        for (String name : owner) {
            System.out.println(name);
        }
    }
}
