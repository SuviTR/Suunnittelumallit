
package memento;

public class Main {
    
    public static void main(String[] args) {
        
        ArvuuttajaCaretaker caretaker = new ArvuuttajaCaretaker();
        ArvuuttajaOriginator arvuuttaja = new ArvuuttajaOriginator(); 
        
        
        ArvuuttajaCaretaker caretaker2 = new ArvuuttajaCaretaker();
        ArvuuttajaOriginator arvuuttaja2 = new ArvuuttajaOriginator(); 
        
        caretaker.liityPeliin(arvuuttaja,"Suvi");
        caretaker.arvaus(arvuuttaja, 59);
        
        caretaker2.liityPeliin(arvuuttaja2,"Suvi2");
        caretaker2.arvaus(arvuuttaja2, 381);
        
    }
}
