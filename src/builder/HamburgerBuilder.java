
package builder;

public abstract class HamburgerBuilder {
    
    protected Hamburger burger;
    
    public Hamburger getHamburger() { 
        System.out.println(burger.getBun() + " " + burger.getBeef() + " " + burger.getSeasoning());
        return burger; 
    } 

    public void createNewHamburgerProduct() { 
        burger = new Hamburger(); 
    }
    
    public abstract void buildBun(); 
    public abstract void buildBeef(); 
    public abstract void buildSeasoning();
    
}
