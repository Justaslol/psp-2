package lt.vu.mif.decorator;

public class CouchSurfing implements SleepingPlace {

    @Override
    public double price(int nights) {
        System.out.println("Couchsurfing is free!");
        return 0;
    }
}
