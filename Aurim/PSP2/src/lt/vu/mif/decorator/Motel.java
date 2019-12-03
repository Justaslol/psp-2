package lt.vu.mif.decorator;

public class Motel extends Accommodation implements SleepingPlace {

    private final double ONE_BED_NIGHT_PRICE = 30;
    private final double DOUBLE_BED_NIGHT_PRICE = 30;

    public Motel(RoomType room) {
        super(room);
    }

    @Override
    public double price(int nights) {
        switch (getRoom()) {
            case ONE_BED:
                return ONE_BED_NIGHT_PRICE;
            case DOUBLE_BED:
                return DOUBLE_BED_NIGHT_PRICE;
            default:
                throw new IllegalStateException("This room type doesn't exist!");
        }
    }
}
