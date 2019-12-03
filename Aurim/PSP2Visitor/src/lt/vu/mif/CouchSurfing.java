package lt.vu.mif;

public class CouchSurfing extends Accommodation {

    public CouchSurfing(RoomType room) {
        super(room);
    }

    @Override
    public double price(int nights) {
        System.out.println("Couchsurfing is free!");
        return 0;
    }

    @Override
    public void acceptVisitor(FeedingVisitor feedingVisitor) {
        feedingVisitor.visit(this);
    }
}
