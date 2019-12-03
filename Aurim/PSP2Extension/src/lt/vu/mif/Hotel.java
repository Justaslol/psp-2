package lt.vu.mif;

public class Hotel extends Accommodation {

    private final double NIGHT_PRICE = 50;
    private int stars;

    public Hotel(int stars, RoomType room) {
        super(room);
        this.stars = stars;
    }

    @Override
    public double price(int nights) {
        double price = 0;
        for (FeedingExtension extension : getExtensions().values()) {
            price += extension.priceWithfeed(nights);
        }
        return price;
    }
}
