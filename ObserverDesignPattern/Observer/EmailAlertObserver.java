public class EmailAlertObserver implements NotificationAlertObserver {

    String mailId;
    StockObservable observable;

    public EmailAlertObserver(String mailId, StockObservable observable) {
        this.mailId = mailId;
        this.observable = observable;
    }

    public void update() {
        sendCall(this.mailId, "update product");
    }

    public void sendCall(String mailId, String msg) {
        System.out.println("Mail to :" + mailId + " -> " + msg);
    }

}
