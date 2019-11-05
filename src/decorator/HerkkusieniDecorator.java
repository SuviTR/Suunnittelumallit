
package decorator;

public class HerkkusieniDecorator extends PizzaDecorator {
    
    public HerkkusieniDecorator(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }
    
    @Override
    public void pizzaPohja() {
        super.pizzaPohja();
        addHerkkusieniTayte();
    }
    
    private String addHerkkusieniTayte() {
        return ", herkkusientä";
    }
    
    private int getHinta() {
        return 2;
    }
    
    @Override
    public int getKokonaisHinta() {
        return super.getKokonaisHinta() + getHinta();
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + addHerkkusieniTayte() + " " + getHinta() + "€";
    }

}
