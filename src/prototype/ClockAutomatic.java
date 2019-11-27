package prototype;

public class ClockAutomatic implements Cloneable {

    private SecondHand sec;
    private MinuteHand min;
    private HourHand hr;
    private int seconds = 0, minutes = 0, hours = 0;

    public ClockAutomatic() {
        sec = new SecondHand();
        min = new MinuteHand();
        hr = new HourHand();
    }

    public String getTime() {
        
        String h = Integer.toString(getHours());
        String s = Integer.toString(getSeconds());
        String m = Integer.toString(getMinutes());

        String time = h + ":" + m + ":" + s;
        return time;

    }

    private int getSeconds() {

        sec.addSecond();
        seconds = sec.getSeconds();
        return seconds;

    }

    private int getMinutes() {

        if (seconds == 0) {
            min.addMinute();
        }
        minutes = min.getMinutes();
        return minutes;

    }

    private int getHours() {

        if (minutes == 59) {
            hr.addHour();
        }
        hours = hr.getHours();
        return hours;

    }

    public ClockAutomatic clone() {
        ClockAutomatic c = null; 
        
        try { 
            c = (ClockAutomatic)super.clone(); 
            c.sec = (SecondHand)sec.clone();
            c.min = (MinuteHand)min.clone();
            c.hr = (HourHand)hr.clone();

        } 
        catch (CloneNotSupportedException e) {}
        return c;

    }

}
