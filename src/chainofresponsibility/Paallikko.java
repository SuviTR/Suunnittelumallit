
package chainofresponsibility;

public class Paallikko extends Palkankorotus {
    
    private final double ALLOWABLE = 3 + BASE;
    
    public void processRequest(PalkankorotusRequest request) { 
        if (request.getProcent() < ALLOWABLE) { 
            System.out.println("Yksikkösi päällikkö hyväksyy " + request.getProcent() + " % palkankorotuksesi."); 
        } 
        else if (successor != null) { 
            successor.processRequest(request); 
        } 
    }
}
