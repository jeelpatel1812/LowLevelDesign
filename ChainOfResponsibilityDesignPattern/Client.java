public class Client {
    public static void main(String args[]) {

        // Considered two thousand Rs, thousand Rs, hundred Rs.
        int totalAmount = 5400;
        Handler process1 = new TwoKProcessor();
        Handler process2 = new OneKProcessor();
        Handler process3 = new HundredProcessor();

        process1.setNextHandler(process2);
        process2.setNextHandler(process3);

        process1.handleRequest(totalAmount);

    }
}
