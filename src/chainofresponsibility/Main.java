
package chainofresponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) { 
 
        Lahiesimies lahimies = new Lahiesimies(); 
        Paallikko paallikko = new Paallikko(); 
        Toimitusjohtaja johtaja = new Toimitusjohtaja(); 
        lahimies.setSuccessor(paallikko); 
        paallikko.setSuccessor(johtaja); 

        try { 
            while (true) { 
                System.out.println("Syötä palkkasi euroissa."); 
                System.out.print(">"); 
                double palkka = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine()); 
                
                System.out.println("Syötä palkankorotuksesi euroissa"); 
                System.out.print(">"); 
                double korotus = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine()); 
                lahimies.processRequest(new PalkankorotusRequest(palkka, korotus)); 
            } 
        } catch(Exception e) { 
            System.exit(1); 
        }
    }

}
