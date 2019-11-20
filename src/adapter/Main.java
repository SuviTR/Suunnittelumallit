
package adapter;

public class Main {
    
    public static void main(String[] args) {
        
        Payer payer = new Payer();

        payer.pay("cash", 10);
        payer.pay("check", 120);
        payer.pay("card", 58);
        payer.pay("mobilePay", 32);
  
    }
      
}
