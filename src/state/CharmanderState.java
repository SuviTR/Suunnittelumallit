
package state;

public class CharmanderState implements PelihahmoState {

    public void bite() {
        System.out.println("Puren kovaa.");
    }
    public void run() {
        System.out.println("Juoksen ketterästi.");
    }
    public void tire() {
        System.out.println("Uuvun nopeasti.");
    }
    
    @Override
    public String toString() {
        return "Charmander state";
    }
    
    @Override
    public void introduceYourself() {
        System.out.println("Hei! Olen Charmander.");
    }
    
    @Override
    public void showWhatYouGot() {
        bite();
        run();
        tire();
    }
}
