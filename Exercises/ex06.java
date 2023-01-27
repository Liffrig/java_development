package Exercises;

import PPJLabs.Assistant;

public class ex06 {

    public static void main(String[] args) {

        
        Assistant assistant = new Assistant();

        assistant.printSeparator("Zadanie 1");

        for (int i = 75; i <= 150; i++) {

            
            System.out.println((char) i + " - " + i);

            
            


        }

        assistant.printSeparator("Zadanie 2");
        double input = 17.36;
        CoinAutomat((int) (input*100));

        assistant.printSeparator("Zadanie 3");

        byte b = 15;
        char[] hexes = {'A','B','C','D','E','F'};
        

        char info = b >= 10 ? hexes[b-10] : ((char) (57-(9-b))) ;

        System.out.println(b + " in hex = "+ info);


        assistant.printSeparator("Zadanie 4");

        int n = 7;

        for (int i = 1; i <= n; i++) {
            for (int j = 2; j <= 4; j++) {
                System.out.print(((int) Math.pow(i, j)) + "\t" + " | ");

            }
            System.out.println();
        }

        assistant.printSeparator("Zadanie 5");

        int size = 16;


        int mainSize = size;
        int starCount = 1;

        

        for (int i = 0; i < mainSize; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" . ");
            }
            for (int k = 0; k < starCount; k++) {
                System.out.print(" * ");
                
            }
            for (int j = 0; j < size; j++) {
                System.out.print(" . ");
            }
            starCount +=2;
            size --;
            System.out.println();
        }


        for (int i = 0; i < starCount; i++) {
            System.out.print(" * ");
        }
        starCount -=2;
        size ++;
        System.out.println();

        for (int i = 0; i < mainSize; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" . ");
            }
            for (int k = 0; k < starCount; k++) {
                System.out.print(" * ");
                
            }
            for (int j = 0; j < size; j++) {
                System.out.print(" . ");
            }
            starCount -=2;
            size ++;
            System.out.println();
        }


       




    }


    public static void CoinAutomat(int value) {

        double[] coins  = {500,200,100,50,20,10,5,2,1};

        if (value == 0) {
            System.out.println("--End--");
            return;
        }
        else{

            for (int i = 0; i < coins.length; i++) {

                if ( value >= coins[i]) {
                    value -= coins[i];
                    System.out.println("1 * " + coins[i]/100);
                    break;       
                }
    
                
          
            }
            
        }
        CoinAutomat(value);
    }


    
}
