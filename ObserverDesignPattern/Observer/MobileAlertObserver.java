public class MobileAlertObserver implements NotificationAlertObserver {

    String number;
    StockObservable observable;

    public MobileAlertObserver(String number, StockObservable observable) {
        this.number = number;
        this.observable = observable;
    }

    public void update() {
        sendCall(this.number, "update product");
    }

    public void sendCall(String number, String msg) {
        System.out.println("Call:" + number + " -> " + msg);
    }

}
