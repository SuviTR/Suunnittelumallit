
package builder;

public class Pihvi {
    
    private static Pihvi INSTANCE = null;
    
    public synchronized static Pihvi getInstance(){ 
        if (INSTANCE == null) {
            INSTANCE = new Pihvi();
        }
        return INSTANCE;
    }
    
    public String addBeef() {
        return "100% Beef Patty";
    }
    
}
