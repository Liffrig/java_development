package Exercises;
import java.math.BigDecimal;
import java.math.RoundingMode;

import PPJLabs.Assistant;

public class ex10 {

    public static void main(String[] args) {
        PPJLabs.Assistant assistant = new Assistant();

        assistant.printSeparator(" Zadanie 1"); 

        Person person = new Person();
        person.name = "Andrzej";
        person.surname = "Szpak";
        person.birthyear = 2022;
        System.out.println(person.name + " " + person.surname + " " + person.birthyear);

        assistant.printSeparator(" Zadanie 2");

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

        System.out.println(kulaW_szescianie.getR() + " -> promień kuli");
        System.out.println("kulaW_szescianie V: " + kulaW_szescianie.calculateV());

        System.out.println(kulaW_walcu.getR() + " -> promień kuli");
        System.out.println("kulaW_walcu V: "+ kulaW_walcu.calculateV());

        assistant.printSeparator("Zadanie 6");

        KulaNa kulaNaWalcu = new KulaNa(walec);
        KulaNa kulaNaSzescianie = new KulaNa(kwadrat);

        kulaNaWalcu.show();
        kulaNaSzescianie.show();

        assistant.printSeparator("Zadanie 7 & 8");

        Donkey donkey = new Donkey(262);

        // assumption
        int initialBallons = (int) ((donkey.getMass() * 1000) / 6);
        
        for (int i = 1; i < initialBallons; i++) {
            Balloon b = new Balloon();
            donkey.addBalloon(b); 
        }

        while (!donkey.isFlying()){

            Balloon b = new Balloon();
            donkey.addBalloon(b);

        }

        System.out.println("Przyczepione balony -> " + donkey.getBalloonsCount());
        System.out.println("Ja latam!!!");
        
    }

    public static double roundf(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
    
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
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
    private double polePowierzchni;

    public Kwadrat(double bok) {
        this.bok = bok;
        this.polePowierzchni = Math.pow(bok, 2);
    }

    public void show(){
        double vSzescianu = this.polePowierzchni * bok;

        System.out.println("Pole powierzchni kwadratu: " + this.polePowierzchni);
        System.out.println("Objętość sześcianu o podstawie kwadratu: " + vSzescianu);

    }

    public double getBok(){
        return this.bok;
    }

    public double getPole(){
        return polePowierzchni;
    }
}

class Walec{
    private double r;
    private double h;
    private double polePodstawy;
    private double V;

    public Walec(double r, double h) {
        this.r = r;
        this.h = h;
        this.polePodstawy = Math.PI * Math.pow(r, 2);
        this.V = this.polePodstawy * this.h;
    }

    public void show(){

        System.out.println("Pole podstawy walca: " + this.polePodstawy);
        System.out.println("Objętość walca: " + this.V);

    }

    public double getPolePodstawy() {
        return polePodstawy;
    }
    public double getH() {
        return h;
    }
    public double getR() {
        return r;
    }
    public double getV() {
        return V;
    }



}

class KulaW{
    private double r;

    public KulaW(Walec walec) {

        this.r = walec.getH() / 2; 
        
       
    }

    public KulaW(Kwadrat kwadrat) {

        this.r = kwadrat.getBok() / 2;

      
    }

    public double calculateV(){

        double v = (4* Math.PI * Math.pow(this.r, 3)) / 3;
        return v;
    }

    public double getR() {
        return this.r;
    }



}

class KulaNa{

    private double r;

    public KulaNa(Walec walec) {
        
        double csquared = (Math.pow((2 * walec.getR()),2) + Math.pow(walec.getH(),2));
        this.r = Math.sqrt(csquared);
    }

    public KulaNa(Kwadrat kwadrat){
        this.r = (kwadrat.getBok() * Math.sqrt(2.0)) / 2;

    }

    public void show(){

        System.out.println("Promień kuli wynosi " + r);
    }
    

}

class Balloon{
    double helium;

    public Balloon(){
        Assistant assistant = new Assistant();
        this.helium = ex10.roundf( (0.005 + assistant.getRandomDouble(0.004)),3);
    }

    public double getLoad(){
        return  ex10.roundf((this.helium / 0.007),4) * 6; // 0,007 -> 6g
    }

    public double getHelium() {
        return helium;
    }
}

class Donkey{
    private double mass;
    private Balloon[] baloons;

    public Donkey(double mass){
        this.mass = mass;
        this.baloons = new Balloon[0];
    }

    public void addBalloon(Balloon balloon){
        
        Balloon[] newBalloonArr = new Balloon[this.baloons.length + 1];

        for (int i = 0; i < this.baloons.length; i++) {
            newBalloonArr[i] = this.baloons[i];
        }
        newBalloonArr[newBalloonArr.length -1] = balloon;
        this.baloons = newBalloonArr;

    }

    public boolean isFlying(){
        double massInGrams = this.mass * 1000;
        double totalLoad = 0d;

        for (int i = 0; i < this.baloons.length; i++) {
            totalLoad += baloons[i].getLoad();

        }

        return totalLoad > massInGrams;

    }

    public int getBalloonsCount(){
        return this.baloons.length;
    }
    
    public double getMass() {
        return mass;
    }






}

  
