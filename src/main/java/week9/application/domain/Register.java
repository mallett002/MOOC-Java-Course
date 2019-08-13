package week9.application.domain;

import java.util.*;

public class Register {
    private HashMap<String, Identifiable> registered;

    public Register() {
        this.registered = new HashMap<>();
    }

    public void add(Identifiable toBeAdded) {
        this.registered.put(toBeAdded.getID(), toBeAdded);
    }

    public Identifiable get(String id) {
        return this.registered.get(id);
    }

    public List<Identifiable> getAll() {
        return new ArrayList<Identifiable>(registered.values());
    }
}
