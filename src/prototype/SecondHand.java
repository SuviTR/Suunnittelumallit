package prototype;

public class SecondHand implements Cloneable {

    private int seconds = 0;

    public int getSeconds() {
        return seconds;
    }

    public void addSecond() {

        if (seconds == 59) {
            seconds = 0;
        } else {
            seconds += 1;
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
