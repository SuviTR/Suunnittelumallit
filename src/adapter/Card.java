
package adapter;

public class Card implements PaymentTransaction {
    
    @Override
    public void payCard(int amount) {
        System.out.println("Paying with a card, amount: " + amount);	
    }

    @Override
    public void payCash(int amount) {
    }
    
}
