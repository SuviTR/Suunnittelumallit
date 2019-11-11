
package abstractfactory_reflection;

public class VaateFactory implements AbstractFactory{
    public AdidasFactory getALippis(){
        return new Lippis();     
    }
    public AdidasFactory getATPaita(){
	return new TPaita();     
    } 
    public AdidasFactory getAFarkut(){ 
	return new Farkut();     
    } 
    public AdidasFactory getAKengat(){
	return new Kengat();     
    } 
    public BossFactory getBLippis(){         
	return new Lippis();
    }
    public BossFactory getBTPaita(){
	return new TPaita();     
    } 
    public BossFactory getBFarkut(){ 
	return new Farkut();     
    } 
    public BossFactory getBKengat(){
	return new Kengat();     
    } 
}
