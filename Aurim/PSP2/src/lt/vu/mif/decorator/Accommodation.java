package lt.vu.mif.decorator;

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
}
