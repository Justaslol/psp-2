package lt.vu.mif;

// cia visitor- are you sure??
public class Motel extends Accommodation {

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

    @Override
    public void acceptVisitor(FeedingVisitor feedingVisitor) {
        feedingVisitor.visit(this);
    }

}
