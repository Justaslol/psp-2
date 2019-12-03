package lt.vu.mif;

import java.util.HashMap;
import java.util.Map;

public abstract class Accommodation {

    private RoomType room;
    private Map<String, FeedingExtension> extensions = new HashMap<>();

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

    public FeedingExtension getExtension(String extensionType) {
        return extensions.get(extensionType);
    }

    public void addExtension(String extensionType, FeedingExtension feedingExtension) {
        extensions.put(extensionType, feedingExtension);
    }

    public FeedingExtension removeExtension(String extensionType) {
        return extensions.remove(extensionType);
    }

    public Map<String, FeedingExtension> getExtensions() {
        return extensions;
    }
}
