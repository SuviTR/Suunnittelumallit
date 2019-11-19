
package builder;

public class McDonaldsBuilder extends HamburgerBuilder { 
    
    public void buildBun() { 
        burger.setBun("Light Brioche Hamburger Bun"); 
    } 
    
    public void buildBeef() { 
        burger.setBeef("100% Beef Patty"); 
    } 
    
    public void buildSeasoning() { 
        burger.setSeasoning("Ketchup + Mustard + Shredded Lettuce + Pasteurized Process American Cheese + Pickle Slices + Onions"); 
    } 
    
}
