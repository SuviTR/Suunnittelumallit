
package visitor;

public class ScoringVisitor implements PelihahmoVisitor {

    private int points = 0;
    //konstruktori?
    
    public double getPoints() {
        return points;
    }
    
    @Override
    public void visit(CharmanderState charmander) {
        points = charmander.getPoints();
    }

    @Override
    public void visit(CharmeleonState charmeleon) {
        points = charmeleon.getPoints();
    }

    @Override
    public void visit(CharizardState charizard) {
        points = charizard.getPoints();
    }
    
    
}
