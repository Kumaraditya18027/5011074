public class test {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Image is not loaded until display() is called
        image1.display(); // Loading and displaying image1
        image1.display(); // Directly displaying cached image1

        image2.display(); // Loading and displaying image2
    }
}
