
package observer;

import java.util.Observable;
import javax.security.auth.Subject;

public interface Observer {
    
    public void update(Observable o, Object arg);
    
}
