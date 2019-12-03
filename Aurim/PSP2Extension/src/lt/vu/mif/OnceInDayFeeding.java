package lt.vu.mif;

public class OnceInDayFeeding implements FeedingExtension {

    private Accommodation accommodation;
    private final double INCLUDED_FOOD_PRICE_A_DAY = 20;

    public OnceInDayFeeding(Accommodation accommodation) {
        this.accommodation = accommodation;
    }

    @Override
    public double priceWithfeed(int days) {
        return accommodation.price(days) + INCLUDED_FOOD_PRICE_A_DAY * days;
    }
}
