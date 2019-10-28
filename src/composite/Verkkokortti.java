
package composite;

public class Verkkokortti implements Laiteosa{

    @Override
    public int getHinta() {
        return 40;
    }
    
    @Override
    public void addLaiteosa(Laiteosa osa) {
        throw new RuntimeException ("Ei voi lisätä osaa."); 
    }
    
}
