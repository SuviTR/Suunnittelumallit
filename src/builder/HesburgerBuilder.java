
package builder;

public class HesburgerBuilder extends HamburgerBuilder { 

    private StringBuilder hamburger = new StringBuilder();
    
    public void buildBun() {
        burger.setBun("Homemade Hamburger Bun"); 
    } 
    
    public void buildBeef() { 
        burger.setBeef("+ 100% Beef Patty"); 
    } 
    
    public void buildSeasoning() { 
        burger.setSeasoning("+ Ketchup, Mustard, Pickle Slices, Onions"); 
    } 
    
    public StringBuilder getBurger() {
        return hamburger;
    }

}
