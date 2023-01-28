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

        PrintPyramid(5);

        assistant.printSeparator("Zadanie 6");

        double[] randArray = new double[10];
        
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = assistant.getRandomDouble(10);
        }
        System.out.println(" Cała tablica: ");
        assistant.printArray(randArray);

        System.out.println(" Tylko parzysty index: ");
        for (int i = 0; i < randArray.length; i++) {
            if (i%2 == 0) {
                System.out.print(randArray[i] + " ");
            }
        }
        System.out.println("\n Nieparzyste wartości: ");

        for (int i = 0; i < randArray.length; i++) {
            if (((int) randArray[i]) %2 != 0 ) {
                System.out.print(randArray[i] + " ");
            }
        }
        System.out.println();

        assistant.printSeparator("Zadanie 7");

        char[] charArr = new char[3];
        
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] =(char)(((int) 'a') +  Math.random() * ((int) 'z'));
        }
        assistant.printArray(charArr);

        int minValue = charArr[0];
        System.out.println(charArr[0] + " -> " + minValue);
        for (int i = 1; i < charArr.length; i++) {
            System.out.println(charArr[i] + " -> " + (int) charArr[i] );
            if((int) charArr[i] < minValue)
            minValue = charArr[i]; 
        }
        System.out.println("Minimum = " + minValue);
    }

    // Zadanie 5
    public static void PrintPyramid(int size){

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

    // Zadanie 1
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
