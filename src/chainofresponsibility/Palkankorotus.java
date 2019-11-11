
package chainofresponsibility;

public abstract class Palkankorotus {
    
    protected static final double BASE = 2; 
    protected Palkankorotus successor;
    
    public void setSuccessor(Palkankorotus successor) { 
        this.successor = successor; 
    }

    abstract public void processRequest(PalkankorotusRequest request);

}
