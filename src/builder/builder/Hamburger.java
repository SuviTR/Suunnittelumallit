
package builder;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {
    
    private String bun = ""; 
    private String beef = ""; 
    private String seasoning = "";
    private Object hamburger = new Object();
    private List heseHamburger = new ArrayList();
    private StringBuilder macHamburger = new StringBuilder();
    
    public void setBun(String bun) { 
        this.bun = bun; 
    } 

    public String getBun() {
        return bun;
    }    
    
    public void setBeef(String beef) {
        this.beef = beef; 
    } 
    
    public String getBeef() {
        return beef;
    }
    
    public void setSeasoning(String seasoning) { 
        this.seasoning = seasoning; 
    }
    
    public String getSeasoning() {
        return seasoning;
    }
    
    public void setHamburger(Object obj) {
        this.hamburger = obj;
    }
    
    public Object getHamburger() {

        if (hamburger instanceof List) {
            heseHamburger = (List) hamburger;
            return heseHamburger;
        }
        else {
            macHamburger.append(hamburger);
            return macHamburger;
        }
        
    }

}
