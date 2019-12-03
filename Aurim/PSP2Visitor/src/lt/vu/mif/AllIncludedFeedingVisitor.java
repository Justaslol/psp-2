package lt.vu.mif;

public class AllIncludedFeedingVisitor implements FeedingVisitor {

    private final double INCLUDED_FOOD_PRICE_A_DAY = 20;
    private int days;
    private double price;

    @Override
    public void visit(Hotel hotel) {
        price = FeedingVisitorUtils.getAccomodationPrice(hotel, days);
        switch (hotel.getRoom()) {
            case DOUBLE_BED:
                price += INCLUDED_FOOD_PRICE_A_DAY * days * 0.9;
            default:
                price += INCLUDED_FOOD_PRICE_A_DAY * days * 0.7;
        }
    }

    @Override
    public void visit(Motel motel) {
        switch (motel.getRoom()) {
            case DOUBLE_BED:
                price += INCLUDED_FOOD_PRICE_A_DAY * days * 0.7;
            default:
                price += INCLUDED_FOOD_PRICE_A_DAY * days * 0.7;
        }
    }

    @Override
    public void visit(CouchSurfing couchSurfing) {
        switch (couchSurfing.getRoom()) {
            case DOUBLE_BED:
                price += INCLUDED_FOOD_PRICE_A_DAY * days;
            default:
                price += INCLUDED_FOOD_PRICE_A_DAY * days * 0.8;
        }
    }

    public void setParam(int days) {
        this.days = days;
    }

    public double getPrice() {
        return price;
    }
}
