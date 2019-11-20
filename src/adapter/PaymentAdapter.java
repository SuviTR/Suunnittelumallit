
package adapter;

public class PaymentAdapter implements Payment {

    PaymentTransaction transaction;

    public PaymentAdapter(String paymentType){

        if(paymentType.equalsIgnoreCase("card") ){
            transaction = new Card();			
        }
        else if (paymentType.equalsIgnoreCase("cash")){
            transaction = new Cash();
        }	
    }

   
    @Override
    public void pay(String paymentType, int amount) {
        
        if(paymentType.equalsIgnoreCase("card")){
            transaction.payCard(amount);
        }
        else if(paymentType.equalsIgnoreCase("cash")){
            transaction.payCash(amount);
        }
        
    }
    
}
