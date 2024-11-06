public class CreatorTypeB extends Creator {
    public Product createProduct() {
        System.out.println("Product-B is created by B.");
        return new ProductTypeB();
    }
}
