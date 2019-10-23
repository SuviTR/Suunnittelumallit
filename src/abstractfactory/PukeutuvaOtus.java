
package abstractfactory;

public class PukeutuvaOtus {
    
    private Vaate lippis = null;
    private Vaate tpaita = null;
    private Vaate farkut = null;
    private Vaate kengat = null;
    private String tehdas = "Adidas";
    
    AbstractFactory vaate = FactoryProvider.getFactory(tehdas);
    
    public void pukeutuu(){
        pue();
    }

    public void pue(){
        
        System.out.println("Nyt puetaan lempparikuteet päälle.");

        if (tehdas.equals("Adidas")) {
            lippis = vaate.create("Lippis");
            tpaita = vaate.create("T-paita");
            farkut = vaate.create("Farkut");
            kengat = vaate.create("Kengät");

            System.out.println("Kyllä Adidaksen " + lippis.toString() + ", " + tpaita.toString() + ", " + farkut.toString() 
                + " ja " + kengat.toString() + " on ihan ihkut!");
        }
        
        else if (tehdas.equals("Boss")) {
            lippis = vaate.create("Lippis");
            tpaita = vaate.create("T-paita");
            farkut = vaate.create("Farkut");
            kengat = vaate.create("Kengät");

            System.out.println("Kyllä Bossin " + lippis.toString() + ", " + tpaita.toString() + ", " + farkut.toString() 
                + " ja " + kengat.toString() + " on ihan ihkut!");
        }
        else {
            System.out.println("Ei löytynyt lempparikuteita :(");
        }
    }
}

