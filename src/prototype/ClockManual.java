
package prototype;

public class ClockManual implements Cloneable {
    
    private SecondHand sec;
    private MinuteHand min;
    private HourHand hr;
    private int seconds = 0, minutes = 0, hours = 0;

    public ClockManual() {
        sec = new SecondHand();
        min = new MinuteHand();
        hr = new HourHand();
    }

    public String getTime() {

        calculateTime();
        
        String h = Integer.toString(hours);
        String m = Integer.toString(minutes);
        String s = Integer.toString(seconds);

        String time = h + ":" + m + ":" + s;
        return time;

    }
    
    private void calculateTime() {
        getHours();
        getSeconds();
        getMinutes();
    }

    private int getSeconds() {
        
        seconds += 1;
        return seconds;

    }

    private int getMinutes() {

        if (seconds == 0) {
            minutes += 1;
        }
        return minutes;

    }

    private int getHours() {

        if (minutes == 59) {
            hours += 1;
        }
        return hours;

    }
    
    public void setTime(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }
    
    public String getSetTime() {
        return hours + ":" + minutes + ":" + seconds;
    }

    public ClockManual clone() {
        ClockManual c = null; 
        
        try { 
            c = (ClockManual)super.clone(); 
            c.sec = (SecondHand)sec.clone();
            c.min = (MinuteHand)min.clone();
            c.hr = (HourHand)hr.clone();

        } 
        catch (CloneNotSupportedException e) {}
        return c;

    }

}
