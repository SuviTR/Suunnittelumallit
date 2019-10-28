
package composite;

public class Naytonohjain implements Laiteosa{

    @Override
    public int getHinta() {
        return 500;
    }
    
    @Override
    public void addLaiteosa(Laiteosa osa) {
        throw new RuntimeException ("Ei voi lisätä osaa."); 
    }
    
}
