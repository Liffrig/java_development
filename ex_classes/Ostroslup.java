package ex_classes;

public class Ostroslup extends TrojkatRB{
    // ostrosłup o podstawie kwadratu
    private double H;

    public Ostroslup(double a, double c) {
        super(a,c);
        this.H = Math.sqrt((Math.pow(super.geth(),2) - Math.pow(c/2, 2)));   

    }

    public Ostroslup(TrojkatRB t) {
        super(t.getBokA(), t.getBokC());
        this.H = Math.sqrt((Math.pow(t.geth(),2) - Math.pow(t.getBokC()/2, 2)));
    }

    @Override
    public void obliczPp(){

        double pp = 4*((super.getBokC() * super.geth()) / 2) + Math.pow(super.getBokC(), 2);
        System.out.println("Pole powierzchni ostrosłupa wynosi: " + pp + " j^2");
        

    }

    public void obliczV(){
        double V = (Math.pow(super.getBokC(), 2) / 3) * this.H;
        System.out.println("Objętość ostrosłupa wynosi: " + V + " j^3");
    }
}
