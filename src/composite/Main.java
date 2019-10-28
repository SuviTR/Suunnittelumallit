
package composite;

public class Main {
    
    public static void main(String[] args) { 
        
        Laiteosa kaikkiKotelonOsat = new Kotelo();
        Laiteosa prosessori = new Prosessori();
        kaikkiKotelonOsat.addLaiteosa(prosessori);
        
        Laiteosa kaikkiEmolevynOsat = new Emolevy();
        Laiteosa naytonohjain = new Naytonohjain();
        Laiteosa verkkokortti = new Verkkokortti();
        Laiteosa muistipiiri = new Muistipiiri();
        kaikkiEmolevynOsat.addLaiteosa(naytonohjain);
        kaikkiEmolevynOsat.addLaiteosa(verkkokortti);
        kaikkiEmolevynOsat.addLaiteosa(muistipiiri);
        
        int kokonaisHinta = kaikkiKotelonOsat.getHinta() + kaikkiEmolevynOsat.getHinta();
        System.out.println("Tietokoneen kokoonpanon hinta on " + kokonaisHinta + " euroa.");
    }

}
