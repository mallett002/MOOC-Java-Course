package week8.EBook;

import week8.Readable.Readable;
import java.util.ArrayList;

public class EBook implements Readable {
    private String name;
    private ArrayList<String> pages;
    private int pageNumber;

    public EBook(String name, ArrayList<String> pages) {
        this.name = name;
        this.pages = pages;
        this.pageNumber = 0;
    }

    public String getName() {return this.name;}
    public int howManyPages() {return this.pages.size();}

    public String read() {
        String page = this.pages.get(this.pageNumber);
        nextPage();
        return page;
    }

    // increments page number
    private void nextPage() {
        this.pageNumber++;

        // If reach end, go back to 0
        if (this.pageNumber % this.pages.size() == 0) {
            this.pageNumber = 0;
        }
    }
}
