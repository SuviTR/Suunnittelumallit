
package proxy;

public class ProxyImage implements Image {
    
    private final String filename;
    private RealImage image;
    private int value;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void displayImage(int value) {
        if (image == null && value == 2) {
           image = new RealImage(filename, value);
        }
        else {
            image = new RealImage(filename, value);
        }
    }
    
    public void showData() {
        image.showData();
    }
}
