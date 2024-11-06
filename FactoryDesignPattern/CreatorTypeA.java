public class CreatorTypeA extends Creator {
    public Product createProduct() {
        System.out.println("Product-A is created by A.");
        return new ProductTypeA();
    }
}
