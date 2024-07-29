
import java.util.Arrays;

public class BinarySearch {
    public static Product binarySearch(Product[] products, String searchKey) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = products[mid];

            if (midProduct.getProductName().equalsIgnoreCase(searchKey) ||
                midProduct.getCategory().equalsIgnoreCase(searchKey)) {
                return midProduct;
            }

            if (midProduct.getProductName().compareToIgnoreCase(searchKey) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
