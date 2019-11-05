
package decorator;

public class Main {
    
    public static void main(String[] args) {
        Pizza decoratedAnanasHerkkusieniPizza = new AnanasDecorator(new HerkkusieniDecorator(new SimplePizza()));
        System.out.println(decoratedAnanasHerkkusieniPizza.getDescription());
        System.out.println("Yhteensä: " + decoratedAnanasHerkkusieniPizza.getKokonaisHinta() + "€\n");
        
        Pizza decoratedAnanasAurajuustoPizza = new AnanasDecorator(new AurajuustoDecorator(new SimplePizza()));
        System.out.println(decoratedAnanasAurajuustoPizza.getDescription());
        System.out.println("Yhteensä: " + decoratedAnanasAurajuustoPizza.getKokonaisHinta() + "€\n");
        
        Pizza decoratedMozzarellaHerkkusieniPizza = new MozzarellaDecorator(new HerkkusieniDecorator(new SimplePizza()));
        System.out.println(decoratedMozzarellaHerkkusieniPizza.getDescription());
        System.out.println("Yhteensä: " + decoratedMozzarellaHerkkusieniPizza.getKokonaisHinta() + "€\n");
        
        
    }
}
