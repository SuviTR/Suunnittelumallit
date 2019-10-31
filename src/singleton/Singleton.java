
package singleton;

public class Singleton extends AbstractFactory {
    
    private Singleton(){}
    private static Singleton INSTANCE = null;
    private static String iceCreamChoice = "";
    private IceCream chocolate = null;
    private IceCream strawberry = null;
    
    public synchronized static Singleton getInstance(){ 
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
    
    public void showMessage() {
        
        System.out.println("Icecream is yummy!!");
        
        /*
        if (iceCreamChoice.equalsIgnoreCase("Chocolate")) {
            System.out.println(chocolate.toString());
        }
        else if (iceCreamChoice.equalsIgnoreCase("Strawberry")) {
            System.out.println(strawberry.toString());
        }   */          
    }
    
    @Override
    public synchronized IceCream create(String iceCreamChoice) {
        
        this.iceCreamChoice = iceCreamChoice;
        
        if (iceCreamChoice.equalsIgnoreCase("Chocolate")) {
            chocolate = new ChocolateIceCream();
            return chocolate;
        }
        else if (iceCreamChoice.equalsIgnoreCase("Strawberry")) {
            strawberry = new StrawberryIceCream();
            return strawberry;
        } 
        return null;
    }
   
} 


