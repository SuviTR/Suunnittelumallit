
package composite;

public class Prosessori implements Laiteosa{

    @Override
    public int getHinta() {
        return 900; 
    }
    
    @Override
    public void addLaiteosa(Laiteosa osa) {
        throw new RuntimeException ("Ei voi lisätä osaa."); 
    }
    
}
