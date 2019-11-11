
package strategy;

import java.util.List;

public class NewlineAfterEveryThirdItem implements ListConverterStrategy {

    @Override
    public void listToString(List<String> list) {
        
        String[] newlist = new String[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            
            if (i%3 == 0) {
                 newlist[i] = list.get(i)+"\n";
            }
        }
    }
}
