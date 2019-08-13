package week9.moving.domain;

import week9.moving.logic.Packer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String... args) {
        Thing item = new Item("toothbrush", 2);

        // *** Comparable Item ***
//        ArrayList<Item> items = new ArrayList<>();
//        items.add(new Item("passport", 2));
//        items.add(new Item("toothbrush", 1));
//        items.add(new Item("circular saw", 100));

//        Collections.sort(items);
//        System.out.println(items);

        // *** Packing Things ***
        // the things we want to pack
        List<Thing> things = new ArrayList<>();
        things.add(new Item("passport", 2));
        things.add(new Item("toothbrush", 1));
        things.add(new Item("book", 4));
        things.add(new Item("circular saw", 8));

        // Create a packer which uses boxes whose volume is 10
        Packer packer = new Packer(10);

        // Ask packer to pack things into boxes
        List<Box> boxes = packer.packThings(things);

        System.out.println("number of boxes: " + boxes.size());

        for (Box box : boxes) {
            System.out.println("  things in the box: " + box.getVolume()+" dm^3");
        }
    }
}
