package week8.Factory;

import java.util.Random;

public class Factory {
    // Item is an interface defined somewhere...
    public ToBeStored produceNew() {
        Random random = new Random();
        int num = random.nextInt(4);

        // Produces books and disks at random:
        if ( num == 0 ) {
            return new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        } else if ( num==1 ) {
            return new CD("Wigwam", "Nuclear Nightclub", 1975);
        } else if ( num==2 ) {
            return new Book("Robert Martin", "Clean Code", 1 );
        } else {
            return new Book("Kent Beck", "Test Driven Development", 0.7);
        }
    }
}
