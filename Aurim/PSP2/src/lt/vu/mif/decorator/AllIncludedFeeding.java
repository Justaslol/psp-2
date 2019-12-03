package lt.vu.mif.decorator;

public class AllIncludedFeeding extends SleepingPlaceDecorator implements Feeding {

    private final double ONE_DAY_FEED_PRICE = 5;

    public AllIncludedFeeding(SleepingPlace sleepingPlace, String roleName) {
        super(sleepingPlace, roleName);
    }

    @Override
    public double priceWithfeed(int days) {
        return getSleepingPlace().price(days) + ONE_DAY_FEED_PRICE * days;
    }
}
