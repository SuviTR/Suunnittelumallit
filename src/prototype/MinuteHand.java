
package prototype;

public class MinuteHand implements Cloneable {
    
    private int minutes = 0;
    
    public int getMinutes() {
        return minutes;
    }
    
    public void addMinute() {
        
        if (minutes == 59) {
            minutes = 0;
        }
        else {
            minutes += 1;
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
