package lt.vu.mif;

public class OnceADayFeedingVisitor implements FeedingVisitor {

    private final double ONE_DAY_FEED_PRICE = 5;
    private int days;
    private double price;

    @Override
    public void visit(Hotel hotel) {
        price = FeedingVisitorUtils.getAccomodationPrice(hotel, days);
        switch (hotel.getRoom()) {
            case DOUBLE_BED:
                price += ONE_DAY_FEED_PRICE * days * 0.98;
            default:
                price += ONE_DAY_FEED_PRICE * days * 0.79;
        }
    }

    @Override
    public void visit(Motel motel) {
        price = FeedingVisitorUtils.getAccomodationPrice(motel, days);
        switch (motel.getRoom()) {
            case DOUBLE_BED:
                price += ONE_DAY_FEED_PRICE * days * 1.1;
            default:
                price += ONE_DAY_FEED_PRICE * days * 1.2;
        }
    }

    @Override
    public void visit(CouchSurfing couchSurfing) {
        price = FeedingVisitorUtils.getAccomodationPrice(couchSurfing, days);
        switch (couchSurfing.getRoom()) {
            case DOUBLE_BED:
                price += ONE_DAY_FEED_PRICE * days;
            default:
                price += ONE_DAY_FEED_PRICE * days * 0.9;
        }
    }

    public void setParam(int days) {
        this.days = days;
    }

    public double getPrice() {
        return price;
    }
}
