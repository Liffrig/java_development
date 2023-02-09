package ex_classes;

public class Prostokat extends Object{
    private double bokA;
    private double bokB;


    public Prostokat(double a, double b) {
        this.bokA = a;
        this.bokB = b;
    }

    public Prostokat(double a) {
        this.bokA = a;
        this.bokB = a;
    }

    public void obliczPp(){

        double pp = this.bokA * this.bokB;
        System.out.println("Pole powierzchni wynosi: " + pp + " j^2");

    }

    public double getBokA() {
        return bokA;
    }

    public double getBokB() {
        return bokB;
    }

}
