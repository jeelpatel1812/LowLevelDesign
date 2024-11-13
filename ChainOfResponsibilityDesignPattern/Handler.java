interface Handler {
    void setNextHandler(Handler nextHandler);

    void handleRequest(int totalAmount);
}

class TwoKProcessor implements Handler {

    private Handler nextProcessor;
    private int processValue = 2000;

    public void setNextHandler(Handler nextHandler) {
        this.nextProcessor = nextHandler;
    }

    public void handleRequest(int totalAmount) {
        if (totalAmount < processValue) {
            this.nextProcessor.handleRequest(totalAmount);
        } else {
            System.out.println(processValue + " Rs count : " + (int) totalAmount / processValue);
            totalAmount -= ((int) totalAmount / processValue) * processValue;
            this.nextProcessor.handleRequest(totalAmount);
        }
    }
}

class OneKProcessor implements Handler {

    private Handler nextProcessor;
    private int processValue = 1000;

    public void setNextHandler(Handler nextHandler) {
        this.nextProcessor = nextHandler;
    }

    public void handleRequest(int totalAmount) {
        if (totalAmount < processValue) {
            this.nextProcessor.handleRequest(totalAmount);
        } else {
            System.out.println(processValue + " Rs count : " + (int) totalAmount / processValue);
            totalAmount -= ((int) totalAmount / processValue) * processValue;
            this.nextProcessor.handleRequest(totalAmount);
        }
    }
}

class HundredProcessor implements Handler {

    private Handler nextProcessor;
    private int processValue = 100;

    public void setNextHandler(Handler nextHandler) {
        this.nextProcessor = nextHandler;
    }

    public void handleRequest(int totalAmount) {
        if (totalAmount < processValue) {
            this.nextProcessor.handleRequest(totalAmount);
        } else {
            System.out.println(processValue + " Rs count : " + (int) totalAmount / processValue);
            totalAmount -= ((int) totalAmount / processValue) * processValue;
            if (this.nextProcessor != null)
                this.nextProcessor.handleRequest(totalAmount);
        }
    }
}
