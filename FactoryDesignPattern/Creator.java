public class Creator {
    public void someOperations() {
        System.out.println("Hello from LLD");
    }

    public Product createProduct() {
        System.out.println("Product is created by creator.");
        return new ProductTypeA();
    }
}
