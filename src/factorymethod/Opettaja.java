package factorymethod;

public class Opettaja extends AterioivaOtus {      //Opettaja juo vettä

    public Juoma createJuoma(){
        return new Vesi();
    };

}
