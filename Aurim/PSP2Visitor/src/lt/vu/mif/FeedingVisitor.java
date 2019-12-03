package lt.vu.mif;

public interface FeedingVisitor {

    void visit(Hotel hotel);
    void visit(Motel motel);
    void visit(CouchSurfing couchSurfing);



}
