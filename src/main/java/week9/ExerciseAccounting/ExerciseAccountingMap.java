package week9.ExerciseAccounting;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ExerciseAccountingMap {
    private Map<String, Set<Integer>> doneExercises;

    public ExerciseAccountingMap() {
        this.doneExercises = new HashMap<>();
    }

    public void add(String user, int exercise) {
        // if user doesn't exist yet, add it
        if (!this.doneExercises.containsKey(user)) {
            this.doneExercises.put(user, new HashSet<>());
        }

        // add the given exercise to list for that user
        Set<Integer> exercises = this.doneExercises.get(user);
        exercises.add(exercise);
    }

    public void print() {
        this.doneExercises.keySet().stream()
            .sorted()
            .forEach(user -> {
                Set<Integer> exercises = this.doneExercises.get(user); // get set of exercises
                System.out.println(user + ": " + exercises);
            });
    }
}
