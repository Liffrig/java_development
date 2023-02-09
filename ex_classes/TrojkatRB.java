package ex_classes;



public class TrojkatRB {
    private double bokA;
    private double bokC;
    private double h;


    public TrojkatRB(double a, double c){
       if (c > 2*a) {
          System.out.println("Nie ma takiego trójkąta");
       }
       else{
        this.bokA = a;
        this.bokC = c;
        this.h = Math.sqrt((a*a) + (c*c/4));
       }

    }

    public void obliczPp(){
        double pp = (this.bokC * this.h) / 2;
        
        System.out.println("Pole trójkąta wynosi: " + pp + " j^2");
    }

    public double getBokA() {
        return bokA;
    }

    public double getBokC() {
        return bokC;
    }

    public double geth() {
        return h;
    }


}
