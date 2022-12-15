package Exercises;
import PPJLabs.Assistant;

public class ex04 {

    public static void main(String[] args) {
        
        Assistant assistant = new Assistant();

        assistant.printSeparator("Zadanie 1");

        // Zadanie 1 
        // przedstaw program, który pokaże tabelę przejść logicznych wyliczając ich rezultaty

        boolean [] boolValues = {true, false};

        // &&
        for (int i = 0; i < boolValues.length; i++) {
            for (int j = 0; j < boolValues.length; j++) {
                System.out.println(boolValues[i] + " && " + boolValues[j] +" -> "+ (boolValues[i] && boolValues[j]) );
            }
        }

        System.out.println();

        // ||
        for (int i = 0; i < boolValues.length; i++) {
            for (int j = 0; j < boolValues.length; j++) {
                System.out.println(boolValues[i] + " || " + boolValues[j] +" -> "+ (boolValues[i] || boolValues[j]) );
            }
        }

        assistant.printSeparator("Zadanie 2");

        System.out.println("Is 13 prime: " + assistant.isPrime(13));
        System.out.println("Is 15 prime: " + assistant.isPrime(15));
        System.out.println("Is 17 prime: " + assistant.isPrime(17));

        assistant.printSeparator("Zadanie 5");

        boolean czyPada = assistant.getRandomInt(10) > 5 ? true : false;
        boolean czySwieciSlonce = assistant.getRandomInt(10) > 5 ? true : false;

        System.out.println("Deszcz -> " + czyPada);
        System.out.println("Słońce -> " + czySwieciSlonce);

        if (czySwieciSlonce == czyPada) {
            String msg = czyPada ? "Tęcza" : "Pochmurno";
            System.out.println(msg);
        } 
        if (czyPada ^ czySwieciSlonce) {
            String msg = czyPada ? "Plucha" : "Słonecznie";
            System.out.println(msg);
        }
     
        




     



    }
    
}
