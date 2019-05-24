package week5.Person;

import java.util.ArrayList;
import java.util.Calendar;

public class Program {
    public static void main(String... args) {
//        Person pekka = new Person("Pekka", 24);
//
//        System.out.println( pekka );
//
//        Person person = pekka;
//        person.becomeOlder(25);
//
//        System.out.println( pekka );
//
//        pekka = new Person("Pekka Mikkola", 24);
//        System.out.println( pekka );
//
//        // Using WeightWatchersAssociation
//        Person matti = new Person("Matti");
//        matti.setWeight(86);
//        matti.setHeight(180);
//
//        Person juhana = new Person("Juhana");
//        juhana.setWeight(65);
//        juhana.setHeight(172);
//
//        WeightWatchersAssociation weightWatchers = new WeightWatchersAssociation(25);
//
//        if ( weightWatchers.isAcceptedAsMember(matti) ) {
//            System.out.println( matti.getName() + " is accepted as a member");
//        } else {
//            System.out.println( matti.getName() + " is not accepted as a member");
//        }
//
//        if ( weightWatchers.isAcceptedAsMember(juhana) ) {
//            System.out.println( juhana.getName() + " is accepted as a member");
//        } else {
//            System.out.println( juhana.getName() + " is not accepted as a member");
//        }

        // Reformatory Class challenge----------------------------------------------------------------------------------
//        Reformatory reform = new Reformatory();
//
//        Person brian = new Person("Brian", 1, 110, 7);
//        Person pekka = new Person("Pekka", 33, 176, 85);
//
//        System.out.println(brian.getName() + " weight: " + reform.weight(brian) + " kilos");
//        System.out.println(pekka.getName() + " weight: " + reform.weight(pekka) + " kilos");
//
//        reform.feed(brian);
//        reform.feed(brian);
//        reform.feed(brian);
//
//        System.out.println(" ");
//
//        System.out.println(brian.getName() + " weight: " + reform.weight(brian) + " kilos");
//        System.out.println(pekka.getName() + " weight: " + reform.weight(pekka) + " kilos");
//        System.out.println("total weights measured: " + reform.totalWeightsMeasured());

        // Working with ArrayLists--------------------------------------------------------------------------------------
//        ArrayList<Person> teachers = new ArrayList<>();
//        // We can take a person into a variable and add it to the list
//        Person teacher = new Person("Juhana");
//        teachers.add(teacher);
//
//        // Or can create it and add it at same time
//        teachers.add(new Person("Matti"));
//        teachers.add(new Person("Martin"));
//
//        System.out.println("teachers as newborns: ");
//        for (Person prs : teachers) {
//            System.out.println(prs);
//        }
//
//        for (Person prs : teachers) {
//            prs.becomeOlder(30);
//        }
//
//        System.out.println("in 30 years: ");
//        for (Person prs : teachers) {
//            System.out.println(prs);
//        }

        // Working with Object within object----------------------------------------------------------------------------
//        Person martin = new Person("Martin", 24, 4, 1983);
//        Person juhana = new Person("Juhana", 17, 9, 1985);
//        System.out.println(martin);
//        System.out.println(juhana);
//
//        // Working with dates in java---------------------------------------------------------------------------------
//        int day = Calendar.getInstance().get(Calendar.DATE);
//        int month = Calendar.getInstance().get(Calendar.MONTH);
//        int year = Calendar.getInstance().get(Calendar.YEAR);
//        System.out.println("Today is " + day + "." + month + "." + year);

        // Working with new WeightWatchersAssociation-------------------------------------------------------------------
        WeightWatchersAssociation weightWatcher = new WeightWatchersAssociation("Kumpulan Paino", 25);

        Person matti = new Person("Matti");
        matti.setWeight(86);
        matti.setHeight(180);
        weightWatcher.addAsMember(matti);

        Person juhana = new Person("Juhana");
        juhana.setWeight(64);
        juhana.setHeight(172);
        weightWatcher.addAsMember(juhana);

        System.out.println(weightWatcher);

        Person heaviest = weightWatcher.personWithHighestWeightIndex();
        System.out.println("member with the greatest weight index: " + heaviest.getName());
        System.out.println("weight index " + String.format("%.2f", heaviest.weightIndex()));
    }
}
