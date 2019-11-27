
package prototype;

public class HourHand implements Cloneable {
    
    private int hours = 0;
    
    public int getHours() {
        return hours;
    }
    
    public void addHour() {
        
        if (hours == 23) {
            hours = 0;
        }
        else {
            hours += 1;
        }
        
    }
    
    public Object clone() {
        
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
}
