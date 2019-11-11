
package strategy;

public class Main {
    public static void main(String[] args) {
        
        Converter con = new Converter(new NewlineAfterEveryItem());
        
        con.addToList("A");
        con.addToList("B");
        con.addToList("C");
        con.addToList("D");
        con.addToList("E");
        
        con.printList();
        
        con.setStrategy(new NewlineAfterEverySecondItem());
        con.printList();
        
        Converter con2 = new Converter(new NewlineAfterEveryThirdItem());

        con2.addToList("A");
        con2.addToList("B");
        con2.addToList("C");
        con2.addToList("D");
        con2.addToList("E");
        
        con2.printList();
    }

}
