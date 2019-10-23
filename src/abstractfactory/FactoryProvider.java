
package abstractfactory;

public class FactoryProvider {
    
    public static AbstractFactory getFactory(String choice){
         
        if("Adidas".equalsIgnoreCase(choice)){
            return new AdidasFactory();
        }
        else if("Boss".equalsIgnoreCase(choice)){
            return new BossFactory();
        }
        return null;
    }
    
}