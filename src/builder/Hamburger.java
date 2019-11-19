
package builder;

public class Hamburger {
    
    private String bun = ""; 
    private String beef = ""; 
    private String seasoning = "";
    
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
    
}
