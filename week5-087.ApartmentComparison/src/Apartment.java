
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
        return (this.squareMeters>otherApartment.squareMeters);
    }
    public int priceDifference(Apartment otherApartment) {
        int priceDifference = price(this) - price(otherApartment);
        return Math.abs(priceDifference);
    }
     public int price (Apartment a) {
        return a.squareMeters * a.pricePerSquareMeter;
     }

     public boolean moreExpensiveThan(Apartment otherApartment) {
        return this.price(this) > otherApartment.price(otherApartment);
    }
}
