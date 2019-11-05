
package decorator;

public class AurajuustoDecorator extends PizzaDecorator {
    
    public AurajuustoDecorator(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }
    
    @Override
    public void pizzaPohja() {
        super.pizzaPohja();
        addAurajuustoTayte();
    }
    
    private String addAurajuustoTayte() {
        return ", Aurajuustoa";
    }
    
    private int getHinta() {
        return 5;
    }
    
    @Override
    public int getKokonaisHinta() {
        return super.getKokonaisHinta() + getHinta();
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + addAurajuustoTayte() + " " + getHinta() + "€";
    }

}
