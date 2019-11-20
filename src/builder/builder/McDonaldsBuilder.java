
package builder;

public class McDonaldsBuilder extends HamburgerBuilder { 
    
    private StringBuilder hamburger = new StringBuilder();
    
    public void buildBun() { 
        Sampyla bun = Sampyla.getInstance();
        String addBun = bun.addMacBun();
        hamburger.append(addBun);
        burger.setBun(addBun);
        
        //burger.setBun("Light Brioche Hamburger Bun"); 
    } 
    
    public void buildBeef() { 
        Pihvi beef = Pihvi.getInstance();
        String addBeef = beef.addBeef();
        hamburger.append(addBeef);
        burger.setBeef(addBeef);
        
        //burger.setBeef("100% Beef Patty"); 
    } 
    
    public void buildSeasoning() { 
        Mausteet seasoning = Mausteet.getInstance();
        String addSeasoning = seasoning.addMacSeasoning();
        hamburger.append(addSeasoning);
        burger.setSeasoning(addSeasoning);
        
        //burger.setSeasoning("Ketchup + Mustard + Shredded Lettuce + Pasteurized Process American Cheese + Pickle Slices + Onions"); 
    } 
    
    public void buildBurger() {
        burger.setHamburger(hamburger);
    }
    
}
