
package observer;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ClockTimer timer = new ClockTimer();
        
        AnalogClock analogClockObserver = new AnalogClock(timer);
        DigitalClock digitalClockObserver = new DigitalClock(timer);
        
        timer.addObserver(analogClockObserver);
        timer.addObserver(digitalClockObserver);
        
        timer.tick();
        
        analogClockObserver.update(timer, args);
        digitalClockObserver.update(timer, args);
        
    }
}
