
package decorator;

public abstract class PizzaDecorator implements Pizza {
    
    protected Pizza pizzaToBeDecorated;
    
    public PizzaDecorator (Pizza pizzaToBeDecorated) {
        this.pizzaToBeDecorated = pizzaToBeDecorated;
    }
    
    public void pizzaPohja() {
        this.pizzaToBeDecorated.pizzaPohja();
    }
    
    public int getKokonaisHinta() {
        return pizzaToBeDecorated.getKokonaisHinta();
    }
    
    public String getDescription() {
        return pizzaToBeDecorated.getDescription();
    }
}
