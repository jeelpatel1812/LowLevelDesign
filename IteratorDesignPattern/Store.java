
// import java.util.ArrayList;
import java.util.List;

public class Store implements Aggregate {
    private List<Mobile> mobileList;

    Store(List<Mobile> mobileList) {
        this.mobileList = mobileList;
    }

    public Iterator createIterator() {
        final Iterator it = new MobileIterator(mobileList);
        return it;
    }
}
