package Exercises;


import java.util.ArrayList;
import java.util.List;

import PPJLabs.*;
import ex_classes.Prostokat;
import ex_classes.Prostopadloscian;

public class ex11 {

    public static void main(String[] args) {
        PPJLabs.Assistant assistant = new Assistant();

        assistant.printSeparator(" Zadanie 1");

        PhraseA phrase = new PhraseA();
        phrase.addWordAtEnd("The");
        phrase.addWordAtEnd("quick");
        phrase.addWordAtEnd("brown");
        phrase.addWordAtEnd("fox");
        phrase.show();

        PhraseB phrase2 = new PhraseB();
        phrase2.addWordAtEnd("jumps");
        phrase2.addWordAtEnd("over");
        phrase2.addWordAtEnd("the");
        phrase2.addWordAtEnd("lazy");
        phrase2.addWordAtEnd("dog");
        phrase2.show();

        assistant.printSeparator("Zadanie 2");

        Prostokat prostkt = new Prostokat(3.0,4.0);

        Prostopadloscian[] rodzinaProstokątów = {
            new Prostopadloscian(3,5),
            new Prostopadloscian(prostkt),
            new Prostopadloscian(new Prostokat(7)) };

        for (Prostopadloscian fig : rodzinaProstokątów) {
            fig.obliczPp();
            fig.obliczV();
    
        }

        System.out.println("--- itd. ");

        assistant.printSeparator("Zadanie 3");

        
        
        

        



        






      





    }
    

}

class PhraseA{
    private String[] sentence;

    public PhraseA(){
        this.sentence = new String [0];
    }

    public void addWordAtEnd(String word){
        String[] newArr = new String[this.sentence.length + 1];

        for (int i = 0; i < sentence.length; i++) {
            newArr[i] = this.sentence[i];
        }

        newArr[newArr.length-1] = word;

        this.sentence = newArr;
    }

    public void show(){
        for (int i = 0; i < this.sentence.length; i++) {
            System.out.print(sentence[i] + " ");
        }
        System.out.println();
    }
}

class PhraseB{

    private List<String> sentence;

    public PhraseB(){
        this.sentence = new ArrayList<String>();
    }

    public void addWordAtEnd(String word){
        this.sentence.add(word);
        
    }

    public void show(){
        for (String string : sentence) {
            System.out.print(string + " ");
        }
        System.out.println();
    }

}