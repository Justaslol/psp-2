package lt.vu.mif.decorator;

public class OnceInDayFeeding extends SleepingPlaceDecorator implements Feeding {

    private final double INCLUDED_FOOD_PRICE_A_DAY = 20;

    public OnceInDayFeeding(SleepingPlace sleepingPlace, String roleName) {
        super(sleepingPlace, roleName);
    }

    @Override
    public double priceWithfeed(int days) {
        return getSleepingPlace().price(days) + INCLUDED_FOOD_PRICE_A_DAY * days;
    }
}
