package lt.vu.mif;

public abstract class Accommodation {

    private RoomType room;

    public Accommodation(RoomType room) {
        this.room = room;
    }

    public RoomType getRoom() {
        return room;
    }

    public void setRoom(RoomType room) {
        this.room = room;
    }

    public abstract double price(int nights);

    public abstract void acceptVisitor(FeedingVisitor feedingVisitor);
}
