package factorymethod;

public class Opintoohjaaja extends AterioivaOtus{
    
    public Juoma createJuoma(){
        return new Kahvi();
    };
    
}
