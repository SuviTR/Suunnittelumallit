
package proxy;

public class RealImage implements Image {
    
    private final String filename;

    public RealImage(String filename, int value) {
        this.filename = filename;
        if (value == 2) {
            loadImageFromDisk();
        }
        else {
            displayImage(2);
        }
    }

    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    public void displayImage(int value) {
        System.out.println("Displaying " + filename);
    }
    
    public void showData() {
        String[] parts = filename.split("_");
        String name = parts[2];
        System.out.println(" Picture name: " + name);
    }
}
    
