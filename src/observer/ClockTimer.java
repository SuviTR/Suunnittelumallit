
package observer;

import java.util.Observable;

public class ClockTimer extends Observable {
    
    private int time;
    private int hour = 0;
    private int minute = 0;
    private int second = 0;
    
    public void setTime(int time) {
        this.time = time;
        setChanged();
        notifyObservers(time);
    }
    
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    
    public void tick() {
        setTime(hour = hour + 1);
        setTime(minute = minute + 1);
        setTime(second = second + 1);
    }

}
