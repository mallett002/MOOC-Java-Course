package week8.NumberList;

import java.util.ArrayList;
import week8.Readable.Readable;

public class NumberList implements Readable {
    private ArrayList<Readable> readables;

    public NumberList() {
        this.readables = new ArrayList<>();
    }

    public void add(Readable readable) {
        this.readables.add(readable);
    }

    public int howManyReadables() {
        return this.readables.size();
    }

    public String read() {
        String read = "";
        for (Readable readable : this.readables) {
            read += readable.read() + "\n";
        }
        this.readables.clear();
        return read;
    }
}
