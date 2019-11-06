
package state;

public class Main {
    
    public static void main(String[] args) {
        Pelihahmo hahmo = new Pelihahmo();
        
        CharmanderState charmander = new CharmanderState();
        hahmo.setPelihahmoState(charmander);
        System.out.println(hahmo.getState().toString());
        charmander.introduceYourself();
        charmander.bite();
        charmander.run();
        charmander.tire();
        System.out.println("\n");
        
        CharmeleonState charmeleon = new CharmeleonState();
        hahmo.setPelihahmoState(charmeleon);
        System.out.println(hahmo.getState().toString());
        charmeleon.introduceYourself();
        charmeleon.grab();
        charmeleon.strike();
        charmeleon.wag();
        System.out.println("\n");
        
        CharizardState charizard = new CharizardState();
        hahmo.setPelihahmoState(charizard);
        System.out.println(hahmo.getState().toString());
        charizard.introduceYourself();
        charizard.blow();
        charizard.fly();
        charizard.roar();
    }
    
}
