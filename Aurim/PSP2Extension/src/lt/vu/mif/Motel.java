package lt.vu.mif;

public class Motel extends Accommodation {

    private final double ONE_BED_NIGHT_PRICE = 30;
    private final double DOUBLE_BED_NIGHT_PRICE = 30;

    public Motel(RoomType room) {
        super(room);
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
