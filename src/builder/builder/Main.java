
package builder;

public class Main {
    
    public static void main(String[] args) { 
        WaiterDirector waiter = new WaiterDirector(); 
        
        HamburgerBuilder heseBuilder = new HesburgerBuilder(); 
        HamburgerBuilder macBuilder = new McDonaldsBuilder();
        
        waiter.setHamburgerBuilder(heseBuilder); 
        waiter.constructHamburger();
        Hamburger heseBurger = waiter.getHamburger();
        
        waiter.setHamburgerBuilder(macBuilder);
        waiter.constructHamburger();
        Hamburger macBurger = waiter.getHamburger();
    }

}
