
package strategy;

import java.util.ArrayList;
import java.util.List;

public class NewlineAfterEverySecondItem implements ListConverterStrategy {

    @Override
    public void listToString(List<String> list) {
        
        String[] newlist = new String[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            newlist[i] = list.get(i); 
            
            if (i%2 == 0) {
                newlist[i] = newlist[i]+"\n";
            }
        }
    }
}
