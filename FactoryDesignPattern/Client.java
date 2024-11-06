public class Client {
    private static Creator creator;

    public static void main(String args[]) {
        configure("product1");
        buildCommand();
    }

    private static void configure(String type) {
        if (type == "product1") {
            creator = new CreatorTypeA();
        } else {
            creator = new CreatorTypeB();
        }
    }

    private static void buildCommand() {
        creator.createProduct();
    }
}
