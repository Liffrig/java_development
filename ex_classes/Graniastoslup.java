package ex_classes;

public class Graniastoslup extends TrojkatRB {
    private double H;

    public Graniastoslup(double a, double c, double H) {
        super(a,c);
        this.H = H;
    }

    public Graniastoslup(TrojkatRB t, double h) {
        super(t.getBokA(), t.getBokC());

        this.H = h;

    }

    @Override
    public void obliczPp() {
        double pp = (super.getBokC() * super.geth()) + 
        (super.getBokC() * this.H) +
        2 * (super.getBokA() * this.H);
        
        System.out.println("Całkowite pole powierzchni wynosi: " + pp + " j^2");
    }

    public void obliczV(){
        double V =  ((super.getBokC() * super.geth())/2) * this.H;
        System.out.println("Objętość graniastoslupa wynosi: " + V + " j^3");
    }

    
}
