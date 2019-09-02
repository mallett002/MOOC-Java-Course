package week10.basicInheritance;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Component {
    private String id;
    private String producer;
    private String description;

    Component(String id, String producer, String description) {
        this.id = id;
        this.producer = producer;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    String getProducer() {
        return producer;
    }

    public String toString() {
        return "ID: " + this.getId() + " PRODUCER: " + this.getProducer() + "\nDESCRIPTION: " + this.getDescription();
    }
}
