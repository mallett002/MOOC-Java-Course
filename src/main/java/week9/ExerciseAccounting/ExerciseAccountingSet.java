package week9.ExerciseAccounting;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class ExerciseAccountingSet {
    private Set<Integer> doneExercises;

    public ExerciseAccountingSet() {
        this.doneExercises = new HashSet<>(); // HashSet implements Set
    }

    public void add(int exercise) {
        this.doneExercises.add(exercise);
    }

    public void print() {
        Stream.of(this.doneExercises)
            .forEach(System.out::print);
    }
}
