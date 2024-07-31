public class ProxyImage implements Image {
    private RealImage realImage;
    private String imagePath;
    private boolean isLoaded = false;

    public ProxyImage(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void display() {
        if (!isLoaded) {
            realImage = new RealImage(imagePath);
            isLoaded = true;
        }
        realImage.display();
    }
}
