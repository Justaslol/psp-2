package lt.vu.mif;

//https://klevas.mif.vu.lt/~plukas/resources/Extension%20Objects/ExtensionObjectsPattern%20Gamma96.pdf
public class Main {

    public static void main(String[] args) {
        Accommodation accommodation = new Motel( RoomType.DOUBLE_BED);
        accommodation.addExtension("once", new OnceInDayFeeding(accommodation));

        FeedingExtension feeding = accommodation.getExtension("once");

        System.out.println(feeding.priceWithfeed(5));
    }
}
