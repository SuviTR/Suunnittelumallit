
package builder;

public class Sampyla {
    
    private static Sampyla INSTANCE = null;
    
    public synchronized static Sampyla getInstance(){ 
        if (INSTANCE == null) {
            INSTANCE = new Sampyla();
        }
        return INSTANCE;
    }
    
    public String addHeseBun() {
        return "Homemade Hamburger Bun";
    }
    
    public String addMacBun() {
        return "Light Brioche Hamburger Bun";
    }
    
}
