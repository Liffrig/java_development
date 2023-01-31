package Exercises;
import PPJLabs.Assistant;

public class ex08 {
    public static void main(String[] args) {
        Assistant assistant = new Assistant();
        assistant.printSeparator("Zadanie 1");

        int[][] dimArray = {
            assistant.GetSuperRandomArray(10, 10),
            assistant.GetSuperRandomArray(10, 10),
            assistant.GetSuperRandomArray(10, 10)

        };
        assistant.printArray2D(dimArray);

        assistant.printSeparator("Zadanie 2");

        float[][] float2dArr = new float[8][8];

        for (int i = 0; i < float2dArr.length; i++) {
            for (int j = 0; j < float2dArr[i].length; j++) {
                float2dArr[i][j] = assistant.getRandomFloat(2);
            }
        }

        assistant.printArray2D(float2dArr);

        float totalLeft = 0.0f;
        float totalRight = 0.0f;

        int lastIndex = (float2dArr.length - 1);
        for (int i = 0; i < float2dArr.length; i++) {
            totalLeft += float2dArr[i][i]; 
            totalRight += float2dArr[i][lastIndex];
            lastIndex--; 
        }
        // suma przekątnych
        System.out.println();
        System.out.println("Total left = " + totalLeft);
        System.out.println("Total right = " + totalRight);

        assistant.printSeparator("Zadanie 3");

        int[][] tab = {{1 ,  0 ,  0 ,  0 ,  0} 
        ,{0 ,  1 ,  0 ,  0} ,
        {0 ,  0 ,  1}};

        int lengthNeeded = 0;

        for (int i = 0; i < tab.length; i++) {
            lengthNeeded += tab[i].length;
        }

        int [] tab2 = new int[lengthNeeded];
        int helpIndex = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab2[helpIndex] = tab[i][j];
                helpIndex++;
            }
        }

        assistant.printArray2D(tab);
        System.out.println("Transposed >>>");
        assistant.printArray(tab2);

        assistant.printSeparator("Zadanie 4");
        int rawArray [][] = {
            { 1 , 2 , 3 , 4} ,
            { 5 , 6 , 7 , 8} ,
            { 9 ,10 ,11 ,12} ,
            {13 ,14 ,15 ,16}
        };

        assistant.printArray2D(rawArray);
        System.out.println("Spiral path >>>");

        int fieldsToJump =  rawArray.length-1;
        int row = -1;
        int column = -1;
        while (true) {
            row++; 
            column++;

            for (int i = column; i < fieldsToJump; i++) {
                System.out.print(rawArray[row][column]+" ");
                column++;
            }
            for (int i = row; i < fieldsToJump; i++) {
                System.out.print(rawArray[row][column]+" ");
                row++;
            }

            for (int i = column; i > 0; i--) {
                System.out.print(rawArray[row][column]+" ");
                column--;
            }

            fieldsToJump--;

            if (fieldsToJump == 1) {
                break;
            }
          
            for (int i = row; i > 0; i--) {
                System.out.print(rawArray[row][column]+" ");
                row--;
            }

      
        }
        System.out.println();

        assistant.printSeparator("Zadanie 5");
        show(1);

        assistant.printSeparator("Zadanie 6");

        // wtf, lokalna, nieodnośnikowa zmienna nie zmieni się
        int wrt = 5;
        show(wrt);
        modifyValue(wrt);
        show(wrt);

        assistant.printSeparator("Zadanie 7");

        int r = assistant.findMax(1, 2, 3);

        System.out.println("1,2,3 -> max is " + r + " zero if...");
    }

    public static void show(int inpt){
        System.out.println(">>> " + inpt);   
    }

    public static void modifyValue(int inpt){
       show(inpt);
       inpt *= 5;
       show(inpt); 
    }
}
