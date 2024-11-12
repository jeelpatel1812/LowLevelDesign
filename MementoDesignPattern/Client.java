public class Client {
    public static void main(String args[]) {
        Originator document = new Originator("Start doc.");
        CareTaker ct = new CareTaker();

        document.append("Second step");
        ct.addMemento(document.createMemento());

        document.append("Third part");
        ct.addMemento(document.createMemento());

        // Get to prev state
        document.restoreFromMemento(ct.getMemento());
        System.out.println("Second Last checkpoint was : " + document.getState());
    }
}
