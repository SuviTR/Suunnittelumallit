
package observer;

import java.util.*;

public class AnalogClock implements Observer {
    
    private ClockTimer timer;
    
    public AnalogClock(ClockTimer ct) {
        timer = ct;
    }

    public void update(Observable o, Object arg) {
        draw();
    }
    
    private void draw() {
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
