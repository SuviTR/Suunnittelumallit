
package abstractfactory_reflection;

public interface AbstractFactory {
    public abstract AdidasFactory getALippis(); 
    public abstract AdidasFactory getATPaita();
    public abstract AdidasFactory getAFarkut();
    public abstract AdidasFactory getAKengat();
    public abstract BossFactory getBLippis();  
    public abstract BossFactory getBTPaita();
    public abstract BossFactory getBFarkut();
    public abstract BossFactory getBKengat();
}

/*
public abstract class AbstractFactory {
    
    public abstract Vaate getLippis();
    public abstract Vaate getTPaita();
    public abstract Vaate getFarkut();
    public abstract Vaate getKengat();
 
}*/
