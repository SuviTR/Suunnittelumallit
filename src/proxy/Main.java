
package proxy;

import java.util.ArrayList;

public class Main {
    
    public static void main(final String[] arguments) {
        
        //Displaying image information
        Image img1 = new ProxyImage("HiRes_10MB_Image1");
        Image img2 = new ProxyImage("HiRes_10MB_Image2");
        Image img3 = new ProxyImage("HiRes_10MB_Image3");
        
        ArrayList<Image> imgs = new ArrayList();
        imgs.add(img1);
        imgs.add(img2);
        imgs.add(img3);
        
        System.out.println("\nTiedot valokuvakansion sisällöstä\n");
        
        for (Image img : imgs) {
            img.displayImage(1);
            img.showData();
        }
        
        //Loading images
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        Image image3 = new ProxyImage("HiRes_10MB_Photo3");
        
        ArrayList<Image> images = new ArrayList();
        images.add(image1);
        images.add(image2);
        images.add(image3);
        
        System.out.println("\nSelaa valokuvakansiota\n");
        
        for (Image img : images) {
            img.displayImage(2);
        }
    }
}
