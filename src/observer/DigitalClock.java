
package observer;

import java.util.*;

public class DigitalClock implements Observer {

    private ClockTimer timer;
    
    public DigitalClock(ClockTimer ct)  {
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
