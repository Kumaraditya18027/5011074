public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product("P001", "Laptop", 10, 999.99);
        Product p2 = new Product("P002", "Smartphone", 20, 499.99);
        Product p3 = new Product("P003", "Tablet", 15, 299.99);
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);
        System.out.println("All products:");
        inventory.displayAllProducts();
        p2.setPrice(450.00);
        inventory.updateProduct(p2);
        System.out.println("After update:");
        inventory.displayAllProducts();
        inventory.deleteProduct("P003");
        System.out.println("After deletion:");
        inventory.displayAllProducts();
    }
}
