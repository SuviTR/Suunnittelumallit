
package chainofresponsibility;

public class Toimitusjohtaja extends Palkankorotus {
    
    private final double ALLOWABLE = 3 + BASE;
    
    public void processRequest(PalkankorotusRequest request) { 
        if (request.getProcent() > ALLOWABLE) { 
            System.out.println("Toimitusjohtaja hyväksyy " + request.getProcent() + " % palkankorotuksesi."); 
        } 
        else if (successor != null) { 
            successor.processRequest(request); 
        } 
    }
}
