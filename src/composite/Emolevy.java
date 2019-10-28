
package composite;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {

    List<Laiteosa> osaList = new ArrayList<Laiteosa>();
    
    @Override
    public void addLaiteosa(Laiteosa osaLisataanNykyiseenOsaan) {
        osaList.add(osaLisataanNykyiseenOsaan);
    }

    @Override
    public int getHinta() {
        int hinta = 110;
        for (Laiteosa osa: osaList) {
            hinta = hinta + osa.getHinta();
        }
        return hinta;
    }
    
}
