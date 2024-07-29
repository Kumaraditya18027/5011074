import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> productMap;

    public Inventory() {
        productMap = new HashMap<>();
    }

    public void addProduct(Product product) {
        productMap.put(product.getProductId(), product);
    }

    public void updateProduct(Product product) {
        if (productMap.containsKey(product.getProductId())) {
            productMap.put(product.getProductId(), product);
        } else {
            System.out.println("Product not found!");
        }
    }

    public void deleteProduct(String productId) {
        productMap.remove(productId);
    }

    public Product getProduct(String productId) {
        return productMap.get(productId);
    }

    public void displayAllProducts() {
        for (Product product : productMap.values()) {
            System.out.println(product);
        }
    }
}
