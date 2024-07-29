import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "Tablet", "Electronics"),
            new Product("P004", "Headphones", "Accessories"),
            new Product("P005", "Charger", "Accessories")
        };
        Arrays.sort(products, (p1, p2) -> p1.getProductName().compareToIgnoreCase(p2.getProductName()));

        String searchKey = "Tablet";
        Product result = LinearSearch.linearSearch(products, searchKey);
        System.out.println("Linear Search Result: " + (result != null ? result : "Product not found"));
        result = BinarySearch.binarySearch(products, searchKey);
        System.out.println("Binary Search Result: " + (result != null ? result : "Product not found"));
    }
}
