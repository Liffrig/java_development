import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import Drzewa.MojSkaner;
import PPJLabs.Assistant;

public class PPJ {
    
    public static void main(String[] args) {

        Assistant assistant = new Assistant();

        System.out.println(assistant.isPrime(26701));

        assistant.printSeparator("Zadanie 1");

        try {
            InputStream file = new FileInputStream("input.txt");
            MojSkaner ms = new MojSkaner(file);
            System.out.println(ms.odczytajLinie());
            System.out.println( ms.odczytajSlowo());
            System.out.println( ms.odczytajLiczbeCalkowita());

            file.close();
            


        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch(IOException e){

        }

        

        

        





        





    }
      
}









