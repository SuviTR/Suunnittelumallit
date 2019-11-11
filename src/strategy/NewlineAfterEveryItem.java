
package strategy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NewlineAfterEveryItem implements ListConverterStrategy {

    @Override
    public void listToString(List<String> list) {
        
        List newList = new ArrayList();
        
        Iterator iterator = list.iterator();
      
        while(iterator.hasNext()) {
           Object element = iterator.next();
           element = element+"\n";
           newList.add(element);
        }
    }
}
