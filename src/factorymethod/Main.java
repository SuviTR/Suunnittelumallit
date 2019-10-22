package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus opiskelija = new Opiskelija();
        AterioivaOtus opo = new Opintoohjaaja();
        opettaja.aterioi();
        opiskelija.aterioi();
        opo.aterioi();
    }
}
