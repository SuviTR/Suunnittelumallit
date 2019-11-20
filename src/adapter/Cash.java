
package adapter;

public class Cash implements PaymentTransaction {

    @Override
    public void payCard(int amount) {     	
    }

    @Override
    public void payCash(int amount) {
        System.out.println("Paying with cash, amount: " + amount);
    }
    
    
    
}
