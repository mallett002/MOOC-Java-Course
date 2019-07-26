package week8.Factory;

public class CD implements ToBeStored, Item {
    private String artist;
    private String title;
    private int publishingYear;
    private double weight;

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
        this.weight = 0.1;
    }

    public String getArtist() { return this.artist; }
    public double weight() { return this.weight; }
    public String getTitle() { return this.title; }
    public int getPublishingYear() { return this.publishingYear; }

    public String toString() {
        return this.getArtist() + ": " + this.getTitle() + " (" + this.getPublishingYear() + ")";
    }
}
