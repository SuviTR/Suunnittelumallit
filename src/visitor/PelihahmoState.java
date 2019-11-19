
package visitor;

public interface PelihahmoState {
    
    void introduceYourself();
    void showWhatYouGot();
    int getPoints();
    void accept(PelihahmoVisitor visitor);
}
