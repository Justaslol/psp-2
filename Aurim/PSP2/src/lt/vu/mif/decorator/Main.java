package lt.vu.mif.decorator;

public class Main {

    /*
    Naktynes nuoma

    lt.vu.mif.decorator.SleepingPlace

    lt.vu.mif.decorator.Hotel

    lt.vu.mif.decorator.Motel
    lt.vu.mif.decorator.CouchSurfing
     */

    public static void main(String[] args) {
        // Poliformizmas yra - adresas (interface) rodo i konkrecias (skirtingas) klases
        SleepingPlaceDecorator sleepingWithFeeding = new AllIncludedFeeding(new OnceInDayFeeding(new Hotel(10, RoomType.ONE_BED), "once"), "all");

        sleepingWithFeeding = sleepingWithFeeding.removeRole("all");

        SleepingPlaceDecorator a = sleepingWithFeeding.getRole("once");
        if (a != null && a instanceof Feeding)
            System.out.println(((Feeding) a).priceWithfeed(1));
    }
}
