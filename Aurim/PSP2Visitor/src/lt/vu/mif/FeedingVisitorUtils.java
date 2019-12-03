package lt.vu.mif;

public class FeedingVisitorUtils {

    public static double getAccomodationPrice(Accommodation accommodation, int days) {
        return accommodation.price(days);
    }
}
