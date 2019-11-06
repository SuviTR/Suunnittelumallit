
package state;

public class Pelihahmo {
    
    private PelihahmoState state;
    
    public Pelihahmo() {
        state = null;
    }
    
    public void setPelihahmoState(PelihahmoState state) {
        this.state = state;
    }
    
    public PelihahmoState getState() {
        return state;
    }
  
    public void introduceYourself() {
        state.introduceYourself();
    }
    
    public void showWhatYouGot() {
        state.showWhatYouGot();
    }
}
