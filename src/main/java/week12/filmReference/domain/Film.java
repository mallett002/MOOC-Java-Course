package week12.filmReference.domain;

import java.util.Random;

public class Film {
    private String name;

    public Film(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        // if obj is null or not same class
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        // Cast to be able to use .getName()
        final Film other = (Film) obj;

        // if no name or not same name
        if (this.name == null || !this.name.equals(other.getName())) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
