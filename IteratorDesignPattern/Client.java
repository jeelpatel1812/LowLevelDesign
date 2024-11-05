import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String args[]) {
        List<Mobile> mobileList = new ArrayList<>();
        mobileList.add(new Mobile(100000, "Samsung"));
        mobileList.add(new Mobile(20000, "Apple"));
        mobileList.add(new Mobile(30000, "Ultra"));

        Store store = new Store(mobileList);
        Iterator it = store.createIterator();

        while (it.hasNext()) {
            Mobile mb = (Mobile) it.next();
            System.out.println(mb.getPrice());
        }
    }

}
