
package abstractfactory_reflection;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PukeutuvaOtus {
    
    private AdidasFactory alippis = null;
    private AdidasFactory atpaita = null;
    private AdidasFactory afarkut = null;
    private AdidasFactory akengat = null;
    private BossFactory blippis = null;
    private BossFactory btpaita = null;
    private BossFactory bfarkut = null;
    private BossFactory bkengat = null;
    
    public void pukeutuu(){
        try {
            pue();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PukeutuvaOtus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void pue() throws ClassNotFoundException {
        Class c = null;
        AbstractFactory tehdas = null;
        Properties props = new Properties();
        InputStream stream = null;

        try {
            stream = this.getClass().getClassLoader().getResourceAsStream("abstractfactory_reflection/factory.properties");
            if (stream == null){ throw new IOException("File not found");}
            props.load(stream);
            //props.load(new FileInputStream("factory.properties"));
        } catch (IOException e) { e.printStackTrace(); }
        finally {
            try {
                if(stream != null) {
                    stream.close();
                }
            }catch (IOException e ){ e.printStackTrace();}
        }
        
        System.out.println(props.getProperty("tehdas"));
        
        c = Class.forName(props.getProperty("tehdas"));
        
        System.out.println("C " + c);
      
       
        try {
            tehdas = (AbstractFactory) c.newInstance(); 
            System.out.println("tehdas " + tehdas);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Nyt puetaan lempparikuteet päälle.");

        if (tehdas.equals("abstractfactory_reflection.AdidasFactory")) {
            alippis = tehdas.getALippis();
            atpaita = tehdas.getATPaita();
            afarkut = tehdas.getAFarkut();
            akengat = tehdas.getAKengat();

            System.out.println("Kyllä Adidaksen " + alippis.toString() + ", " + atpaita.toString() + ", " + afarkut.toString() 
            + " ja " + akengat.toString() + " on ihan ihkut!");
        }
        else if (tehdas.equals("abstractfactory_reflection.BossFactory")) {
            blippis = tehdas.getBLippis();
            btpaita = tehdas.getBTPaita();
            bfarkut = tehdas.getBFarkut();
            bkengat = tehdas.getBKengat();

            System.out.println("Kyllä Bossin " + blippis.toString() + ", " + btpaita.toString() + ", " + bfarkut.toString() 
            + " ja " + bkengat.toString() + " on ihan ihkut!");
        }
    }
}

