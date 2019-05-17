package week5.Apartments;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        return this.squareMeters > otherApartment.squareMeters;
    }

    private int getFullPrice(Integer pricePerSquareMeter, Integer squareMeters) {
        return pricePerSquareMeter * squareMeters;
    }

    public int priceDifference(Apartment otherApartment) {
        int priceOfThisApartment = getFullPrice(this.pricePerSquareMeter, this.squareMeters);
        int priceOfOtherApartment = getFullPrice(otherApartment.pricePerSquareMeter, otherApartment.squareMeters);

        return Math.abs(priceOfThisApartment - priceOfOtherApartment);
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        int priceOfThisApartment = getFullPrice(this.pricePerSquareMeter, this.squareMeters);
        int priceOfOtherApartment = getFullPrice(otherApartment.pricePerSquareMeter, otherApartment.squareMeters);
        return priceOfThisApartment > priceOfOtherApartment;
    }
}
