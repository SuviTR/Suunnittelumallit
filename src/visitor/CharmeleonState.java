
package visitor;

public class CharmeleonState implements PelihahmoState {

    
    public void grab() {
        System.out.println("Tartun hännälläni.");
    }
    public void strike() {
        System.out.println("Isken sarvellani.");
    }
    public void wag() {
        System.out.println("Heilautan häntääni.");
    }
    
    @Override
     public String toString() {
        return "Charmeleon state";
    }

    @Override
    public void introduceYourself() {
        System.out.println("Heippa! Olen Charmeleon.");
    }
    
    @Override
    public void showWhatYouGot() {
        grab();
        strike();
        wag();
    }
    
    @Override
    public int getPoints() {
        return 5;
    }
    
    @Override
    public void accept(PelihahmoVisitor visitor) {
        visitor.visit(this);
    }
}
