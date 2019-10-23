
package abstractfactory;

public class AdidasFactory extends AbstractFactory {
    
    public Vaate create(String vaateType) {
        if (vaateType.equalsIgnoreCase("Lippis")) {
            return new Lippis();
        }
        else if (vaateType.equalsIgnoreCase("T-paita")) {
            return new TPaita();
        } 
        else if (vaateType.equalsIgnoreCase("Farkut")) {
            return new Farkut();
        }
        else if (vaateType.equalsIgnoreCase("Kengät")) {
            return new Kengat();
        }
        return null;
    }
    
}
