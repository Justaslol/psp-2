package lt.vu.mif;

public class Hotel extends Accommodation {

    private final double NIGHT_PRICE = 50;
    private int stars;

    public Hotel(int stars, RoomType room) {
        super(room);
        this.stars = stars;
    }

    @Override
    public double price(int nights) {
        if (stars < 4) {
            switch (getRoom()) {
                case ONE_BED:
                    return NIGHT_PRICE * nights * 0.8;
                case DOUBLE_BED:
                    return NIGHT_PRICE * nights * 1.2;
            }
        } else {
            switch (getRoom()) {
                case ONE_BED:
                    return NIGHT_PRICE * nights * 1.2;
                case DOUBLE_BED:
                    return NIGHT_PRICE * nights * 1.5;
            }
        }
        throw new IllegalStateException("This room type doesn't exist!");
    }

    @Override
    public void acceptVisitor(FeedingVisitor feedingVisitor) {
        feedingVisitor.visit(this);
    }
}
