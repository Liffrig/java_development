package Exercises;
import PPJLabs.Assistant;

public class ex10 {

    public static void main(String[] args) {
        PPJLabs.Assistant assistant = new Assistant();

        assistant.printSeparator(" Zadanie 1"); // =====================

        Person person = new Person();
        person.name = "Jasio";
        person.surname = "Kowalski";
        person.birthyear = 2022;
        System.out.println(person.name + " " + person.surname + " " + person.birthyear);

        assistant.printSeparator(" Zadanie 2"); // =====================

        Fruit granat = new Fruit("Granat"); 
        granat.show();

        assistant.printSeparator("Zadanie 3");
        
        Kwadrat kwadrat = new Kwadrat(7.0);
        kwadrat.show();

        assistant.printSeparator("Zadanie 4");

        Walec walec = new Walec(5, 7);
        walec.show();

        assistant.printSeparator("Zadanie 5");

        KulaW kulaW_szescianie = new KulaW(kwadrat);
        KulaW kulaW_walcu = new KulaW(walec);

        System.out.println("kulaW_szescianie V: " + kulaW_szescianie.calculateV());
        System.out.println("kulaW_walcu V: "+ kulaW_walcu.calculateV());

        assistant.printSeparator("Zadanie 6");








        
        
        
    }

}

class Person {

    public String name;
    public String surname;
    public int birthyear;

}

class Fruit{
    private String name;
    private double weight;

    public Fruit(String name) {
        this.name = name;
        this.weight = getRandomFruitWeight(0.3) + 0.5; 
    }

    public void show(){
        System.out.println("Nazwa owocu: " + this.name);
        System.out.println("Waga: " + this.weight);
    }

    private double getRandomFruitWeight(double range){

        double randomDouble = Math.random() * range;
        return randomDouble;

    }

    
}

class Kwadrat{
    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    public void show(){
        double polePowierzchni = Math.pow(bok, 2);
        double vSzescianu = polePowierzchni * bok;

        System.out.println("Pole powierzchni kwadratu: " + polePowierzchni );
        System.out.println("Objętość sześcianu o podstawie kwadratu: " + vSzescianu);

    }

    public double getBok(){
        return this.bok;
    }
}

class Walec{
    private double r;
    private double h;

    public Walec(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public void show(){
        double polePodstawy = Math.PI * Math.pow(r, 2);
        double objetosc = polePodstawy * this.h;

        System.out.println("Pole podstawy walca: " + polePodstawy);
        System.out.println("Objętość walca: " + objetosc);

    }

    public double calculateV() {
        double polePodstawy = Math.PI * Math.pow(r, 2);
        double objetosc = polePodstawy * this.h;
        return objetosc;
    }

}

class KulaW{
    private double r;



    public KulaW(Walec walec) {
        
        double R = Math.pow(
            (
                (3 * walec.calculateV()) / (4 * Math.PI)), 
            (1.0/3.0)
            ) ;

        this.r = R;
    }

    public KulaW(Kwadrat kwadrat) {

        double R = Math.pow(
            (
                (3 * Math.pow(kwadrat.getBok(), 3)) / (4 * Math.PI)), 
            (1.0/3.0)
            ) ;

        this.r = R;
    }

    public double calculateV(){

        double v = (4* Math.PI * Math.pow(this.r, 3)) / 3;
        return v;
    }



}

class KulaNa{
    

}

  
