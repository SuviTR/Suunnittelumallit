
package decorator;

public class SimplePizza implements Pizza {

    public void pizzaPohja() {
    }
    
    public int getKokonaisHinta() {
        return 4;
    }

    public String getDescription() {
        return "pizza - pohja " + getKokonaisHinta() + "€ - sisältää";
    }
      
}
