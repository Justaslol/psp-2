package lt.vu.mif;

public class Main {

    // manau bloghai padaryta

    // Klausimas, koks pointas tureti acceptvisitor, jei nenaudojam accommodationo visitoriuij????
    public static void main(String[] args) {
        Accommodation accommodation = new Hotel(1, RoomType.DOUBLE_BED);
        AllIncludedFeedingVisitor visitor = new AllIncludedFeedingVisitor();
        visitor.setParam(1);
        accommodation.acceptVisitor(visitor);
        System.out.println(visitor.getPrice());
    }
}
