import PPJLabs.*;
import Drzewa.*;


public class PPJ {
    
    public static void main(String[] args) {
        Assistant assistant = new Assistant();
        // PPJ 2023-01-14
        assistant.printSeparator("Zadanie 1");
        DetektorDymu det = new DetektorDymu();
        try {
            det.monitor(false);
            det.monitor(true);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        assistant.printSeparator("Zadanie 2");

        Rakieta rakieta = new Rakieta("Zenit-11");
        System.out.println(rakieta.toString());
        rakieta.zatankuj(assistant, 100000);

        try {
            rakieta.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        assistant.printSeparator("Zadanie 3");

        DrzewoIglaste sosna = new DrzewoIglaste(true, 51, "wąskie", 3 , 1.7);
        DrzewoIglaste modrzew = new DrzewoIglaste(true, 41, "wąskie", 2, 0);
        DrzewoLisciaste dab = new DrzewoLisciaste(false, 69, "szerokie", 1);
        DrzewoOwocowe morela = new DrzewoOwocowe(false, 21, "małe", 3, "morela");
        DrzewoOwocowe sliwa = new DrzewoOwocowe(false, 44, "małe", 2, "śliwka");

        Drzewo[] las = {sosna,modrzew,dab,morela,sliwa};

        for (Drzewo drzewo : las) {
            System.out.println(drzewo.toString());
        }


        

        
        




        
    
    }
}

class Rakieta{
    private String nazwa;
    private int wagaPaliwa;

    public Rakieta(String nazwa){
        this.nazwa = nazwa;
        this.wagaPaliwa = 0;
    }

    public String toString(){
        return "Rakieta: " + this.nazwa;
    }



    public void zatankuj(Assistant assistant, int maxAmount){

        this.wagaPaliwa = assistant.getRandomInt(maxAmount);

    }

    public void start() throws Exception{

        if (this.wagaPaliwa > 1000) {
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
            }
            System.out.println("Start rakiety...");
        }
        else{
            throw new Exception("start anulowany - za mało paliwa: " + this.wagaPaliwa);
        }


    }



}

class Alarm
extends Exception{
    boolean raiseAlarm;

    public Alarm(String message){
        super(message);
    }

}

class DetektorDymu {

    private Alarm sprawdz() throws Alarm{

      throw new Alarm("eoeoe"); 
        
    }

    public void monitor(boolean dym) throws Alarm{
        if (dym) {
            this.sprawdz();
        }
        else{
            System.out.println("ok");
        }
    }



}









