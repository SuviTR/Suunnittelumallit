
package prototype;

public class Main {
    
    public static void main(String[] args) {
        
        //Automatic Clock
        System.out.println("Actual Clock");
        ClockAutomatic clockA = new ClockAutomatic();
        System.out.println(clockA.getTime());
        
        System.out.println("\nClone Clock");
        ClockAutomatic newClockA = (ClockAutomatic) clockA.clone();
        System.out.println("New clockA " + newClockA.getTime());
        System.out.println("");
        
        //Manual Clock
        System.out.println("Actual Clock");
        ClockManual clockM = new ClockManual();
        System.out.println(clockM.getTime());
        clockM.setTime(23, 19, 58);
        System.out.println("Set time " + clockM.getSetTime());
        System.out.println(clockM.getTime());
        
        System.out.println("\nClone Clock");
        ClockManual newClockM = (ClockManual) clockM.clone();
        System.out.println(newClockM.getTime());
        newClockM.setTime(23, 19, 58);
        System.out.println("Set time " + newClockM.getSetTime());
        System.out.println(newClockM.getTime());
        
    }
    
}
