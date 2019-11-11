
package chainofresponsibility;

public class PalkankorotusRequest {
    
    private double palkka; 
    private double korotus;
    
    public PalkankorotusRequest(double palkka, double korotus) { 
        this.palkka = palkka; 
        this.korotus = korotus; 
    }
    public double getAmount() { 
        return palkka; 
    } 
    public double getProcent() {
        System.out.println("Prosentti: " + (100 * korotus) / palkka);
        return (100 * korotus) / palkka;
    }
    public void setAmount(double amt)  { 
        palkka = amt; 
    }
    public double getKorotus() { 
        return korotus; 
    } 
    public void setKorotus(double korotusSumma) { 
        korotus = korotusSumma; 
    }
}


