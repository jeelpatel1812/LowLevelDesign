import java.util.List;

public class MobileIterator implements Iterator {

    private List<Mobile> mobileList;
    private int index = 0;

    MobileIterator(List<Mobile> mobileList) {
        this.mobileList = mobileList;
    }

    // Mobile mobile1 = new Mobile(80000, "Ultra S23");

    public boolean hasNext() {
        return index < mobileList.size();
    }

    public Mobile next() {
        if (index < mobileList.size()) {
            final Mobile currentMobile = mobileList.get(index++);
            return currentMobile;
        }
        return null;
    }
}
