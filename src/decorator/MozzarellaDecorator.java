
package decorator;

public class MozzarellaDecorator extends PizzaDecorator {
    
    public MozzarellaDecorator(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }
    
    @Override
    public void pizzaPohja() {
        super.pizzaPohja();
        addMozzarellaTayte();
    }
    
    private String addMozzarellaTayte() {
        return ", Mozzarellaa";
    }
    
    private int getHinta() {
        return 4;
    }
    
    @Override
    public int getKokonaisHinta() {
        return super.getKokonaisHinta() + getHinta();
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + addMozzarellaTayte() + " " + getHinta() + "€";
    }

}
