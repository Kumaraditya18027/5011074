
public class LinearSearch {
    public static Product linearSearch(Product[] products, String searchKey) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(searchKey) ||
                product.getCategory().equalsIgnoreCase(searchKey)) {
                return product;
            }
        }
        return null;
    }
}

