
import java.util.ArrayList;
import java.util.List;

public class IPadObservable implements StockObservable {

    public int stockCount = 0;
    public List<NotificationAlertObserver> observerList = new ArrayList<>();

    public void add(NotificationAlertObserver obj) {
        observerList.add(obj);
    }

    public void remove(NotificationAlertObserver obj) {
        observerList.remove(obj);
    }

    public void notifyObservers() {
        for (NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    public int getStockCount() {
        return this.stockCount;
    }
}