
package visitor;

public class CharizardState implements PelihahmoState {

    public void fly() {
        System.out.println("Lennän nopeasti.");
    }
    public void roar() {
        System.out.println("Karjun lujaa.");
    }
    public void blow() {
        System.out.println("Henkäisen tulta.");
    }
    
    @Override
     public String toString() {
        return "Charizard state";
    }
    
    @Override
    public void introduceYourself() {
        System.out.println("Moi! Olen Charizard.");
    }
    
    @Override
    public void showWhatYouGot() {
        fly();
        roar();
        blow();
    }
    
    @Override
    public int getPoints() {
        return 8;
    }
    
    @Override
    public void accept(PelihahmoVisitor visitor) {
        visitor.visit(this);
    }
}
