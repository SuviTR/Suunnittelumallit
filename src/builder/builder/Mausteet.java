
package builder;

public class Mausteet {
    
    private static Mausteet INSTANCE = null;
    
    public synchronized static Mausteet getInstance(){ 
        if (INSTANCE == null) {
            INSTANCE = new Mausteet();
        }
        return INSTANCE;
    }
    
    public String addHeseSeasoning() {
        return "Ketchup, Mustard, Pickle Slices, Onions";
    }
    
    public String addMacSeasoning() {
        return "Ketchup, Mustard, Shredded Lettuce, Pasteurized Process American Cheese, Pickle Slices, Onions";
    }
}
