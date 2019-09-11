package week10.groups;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Group implements Movable {
    private ArrayList<Movable> movables;

    public Group() {
        this.movables = new ArrayList<>();
    }

    public void addToGroup(Movable movable) {
        this.movables.add(movable);
    }

    public void move(int dx, int dy) {
        this.movables.forEach(movable -> {
            movable.move(dx, dy);
        });
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        this.movables.forEach(movable -> {
            builder.append(movable);
            builder.append("\n");
        });

        return builder.toString();
    }
}
