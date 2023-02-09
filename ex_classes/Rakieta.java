package ex_classes;

import PPJLabs.Assistant;

public class Rakieta{
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