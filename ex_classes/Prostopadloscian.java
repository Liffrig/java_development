package ex_classes;

public class Prostopadloscian
extends Prostokat {
    
    public Prostopadloscian(double a, double b) {
        super(a,b);
    }

    public Prostopadloscian(Prostokat prostokat) {
        super(prostokat.getBokA(),prostokat.getBokB());
    }

    @Override
    public void obliczPp(){

        double pp = 4 * this.getBokA() * this.getBokB();
        System.out.println("Pole powierzchni wynosi: " + pp + " j^2");
        

    }

    public void obliczV(){
        double v = this.getBokA() * this.getBokB() * this.getBokB();
        System.out.println("Objętość wynosi: " + v + " j^3");
        
    }
}
