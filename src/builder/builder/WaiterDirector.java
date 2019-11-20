
package builder;

public class WaiterDirector {
    
    private HamburgerBuilder burgerBuilder;
    
    public void setHamburgerBuilder(HamburgerBuilder hb) { 
        burgerBuilder = hb; 
    } 
    
    public Hamburger getHamburger() { 
        return burgerBuilder.getHamburger(); 
    }
    
    public void constructHamburger() { 
        burgerBuilder.createNewHamburgerProduct(); 
        burgerBuilder.buildBun(); 
        burgerBuilder.buildBeef(); 
        burgerBuilder.buildSeasoning(); 
        burgerBuilder.buildBurger();
    }

}
