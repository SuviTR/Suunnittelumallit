
package singleton;

public class Main {
    
    public static void main(String[] args) {
        
        Singleton chocolateIceCream = Singleton.getInstance();
        Singleton strawberryIceCream = Singleton.getInstance();
        
        chocolateIceCream.create("Chocolate");
        strawberryIceCream.create("Strawberry");
        
        chocolateIceCream.showMessage();
        strawberryIceCream.showMessage();
        
        
    }
}
