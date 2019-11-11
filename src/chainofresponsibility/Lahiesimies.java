
package chainofresponsibility;

public class Lahiesimies extends Palkankorotus {
    
    private final double ALLOWABLE = BASE;
    
    public void processRequest(PalkankorotusRequest request) { 
        if (request.getProcent() < ALLOWABLE) { 
            System.out.println("Lähiesimiehesi hyväksyy " + request.getProcent() + " % palkankorotuksesi."); 
        } 
        else if (successor != null) { 
            successor.processRequest(request); 
        } 
    }
}
