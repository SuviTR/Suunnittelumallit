
package builder;

import java.util.ArrayList;
import java.util.List;

public class HesburgerBuilder extends HamburgerBuilder { 

    private List hamburger = new ArrayList();
    
    public void buildBun() {
        Sampyla bun = Sampyla.getInstance();
        hamburger.add(bun.addHeseBun());
        burger.setBun((String) hamburger.get(0));
    } 
    
    public void buildBeef() { 
        Pihvi beef = Pihvi.getInstance();
        hamburger.add(beef.addBeef());
        burger.setBeef((String) hamburger.get(1));
        
        /*burger.setBeef("+ 100% Beef Patty"); */
    } 
    
    public void buildSeasoning() { 
        Mausteet salad = Mausteet.getInstance();
        hamburger.add(salad.addHeseSeasoning());
        burger.setSeasoning((String) hamburger.get(2));
        
        /*burger.setSeasoning("+ Ketchup, Mustard, Pickle Slices, Onions"); */
    } 
    
    public void buildBurger() {   
        burger.setHamburger(hamburger);   
    }

}
