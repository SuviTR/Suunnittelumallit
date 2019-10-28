
package composite;

public class Muistipiiri implements Laiteosa {

    @Override
    public int getHinta() {
        return 80;
    }

    @Override
    public void addLaiteosa(Laiteosa osa) {
        throw new RuntimeException ("Ei voi lisätä osaa."); 
    }
    
}
