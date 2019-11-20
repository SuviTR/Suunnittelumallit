
package builder;

public abstract class HamburgerBuilder {
    
    protected Hamburger burger;
    
    public Hamburger getHamburger() {
        
        String cl = burger.getHamburger().getClass().toString();
        
        if (cl.equals("class java.util.ArrayList")) {
            System.out.println("\nYour Hesburger order");
        }
        else {
            System.out.println("\nYour McDonalds order");
        }
        System.out.println(cl);
        System.out.println(burger.getBun() + " + " + burger.getBeef() + " + " + burger.getSeasoning());   
        return burger; 
    } 

    public void createNewHamburgerProduct() { 
        burger = new Hamburger(); 
    }
    
    public abstract void buildBun(); 
    public abstract void buildBeef(); 
    public abstract void buildSeasoning();
    public abstract void buildBurger();
    
}
