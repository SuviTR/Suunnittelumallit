
package visitor;

public class Main {
    
    public static void main(String[] args) {
        Pelihahmo hahmo = new Pelihahmo();
        
        CharmanderState charmander = new CharmanderState();
        hahmo.setPelihahmoState(charmander);
        System.out.println(hahmo.getState().toString());
        charmander.introduceYourself();
        charmander.showWhatYouGot();
        
        System.out.println("\n");
        
        CharmeleonState charmeleon = new CharmeleonState();
        hahmo.setPelihahmoState(charmeleon);
        System.out.println(hahmo.getState().toString());
        charmeleon.introduceYourself();
        charmeleon.showWhatYouGot();
        System.out.println("\n");
        
        CharizardState charizard = new CharizardState();
        hahmo.setPelihahmoState(charizard);
        System.out.println(hahmo.getState().toString());
        charizard.introduceYourself();
        charizard.showWhatYouGot();
        
        
        ScoringVisitor visitor = new ScoringVisitor();
        double total = 0;
        
        charmander.accept(visitor);
        double charmanderScore = visitor.getPoints();
        total += charmanderScore;
        
        System.out.println("\nCharmander's points: " + charmanderScore);
        System.out.println("Total score after Charmander: " + total);
        
        charmeleon.accept(visitor);
        double charmeleonScore = visitor.getPoints();
        total += charmeleonScore;
        
        System.out.println("\nCharmeleon's points: " + charmeleonScore);
        System.out.println("Total score after Charmeleon: " + total);
        
        charizard.accept(visitor);
        double charizardScore = visitor.getPoints();
        total += charizardScore;
        
        System.out.println("\nCharizard's points: " + charizardScore);
        System.out.println("Total score after Charizard: " + total);
        
    }
    
}
