
package abstractfactory;

public class BossFactory extends AbstractFactory {
    
    public Vaate create(String vaateType) {
        if ("Lippis".equalsIgnoreCase(vaateType)) {
            return new Lippis();
        }
        else if ("T-paita".equalsIgnoreCase(vaateType)) {
            return new TPaita();
        } 
        else if ("Farkut".equalsIgnoreCase(vaateType)) {
            return new Farkut();
        }
        else if ("Kengät".equalsIgnoreCase(vaateType)) {
            return new Kengat();
        }
        return null;
    }
    
}
