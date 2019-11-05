
package decorator;

public class AnanasDecorator extends PizzaDecorator {
    
    public AnanasDecorator(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }
    
    @Override
    public void pizzaPohja() {
        super.pizzaPohja();
        addAnanasTayte();
    }
    
    private String addAnanasTayte() {
        return ", ananasta";
    }
    
    private int getHinta() {
        return 3;
    }
    
    @Override
    public int getKokonaisHinta() {
        return super.getKokonaisHinta() + getHinta();
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + addAnanasTayte() + " " + getHinta() + "€";
    }

}
