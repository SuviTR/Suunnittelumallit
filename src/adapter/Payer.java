
package adapter;

public class Payer implements Payment {

    PaymentAdapter paymentAdapter; 
       
    @Override
    public void pay(String paymentType, int amount) {
        
        //inbuilt support to pay by check
        if(paymentType.equalsIgnoreCase("check")){
           System.out.println("Paying with a check, amount: " + amount);			
        } 

        //paymentAdapter is providing support to pay other way
        else if(paymentType.equalsIgnoreCase("card") || paymentType.equalsIgnoreCase("cash")){
           paymentAdapter = new PaymentAdapter(paymentType);
           paymentAdapter.pay(paymentType, amount);
        }

        else{
           System.out.println("Invalid payment type. " + paymentType + " not supported");
        }
      
    }
    
}
