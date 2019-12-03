package lt.vu.mif;

public class AllIncludedFeeding implements FeedingExtension {

    private Accommodation accommodation;
    private final double ONE_DAY_FEED_PRICE = 5;

    public AllIncludedFeeding(Accommodation accommodation) {
        this.accommodation = accommodation;
    }

    @Override
    public double priceWithfeed(int days) {
        return accommodation.price(days) + ONE_DAY_FEED_PRICE * days;
    }
}
