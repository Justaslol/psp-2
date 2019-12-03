package lt.vu.mif;

public class CouchSurfing extends Accommodation {

    public CouchSurfing(RoomType room) {
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
