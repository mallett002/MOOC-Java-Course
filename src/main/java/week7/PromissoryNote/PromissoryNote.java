package week7.PromissoryNote;

import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> notes;

    public PromissoryNote() {
        notes = new HashMap<>();
    }

    public void setLoan(String toWhom, double value) {
        notes.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        return notes.get(whose);
    }
}