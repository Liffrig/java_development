package Exercises;
import java.util.Arrays;


import PPJLabs.Assistant;

public class ex15 {
    public static void main(String[] args) {

        Assistant assistant = new Assistant();
        assistant.printSeparator("Zadanie 1");
        for (int i = 0; i < 5; ++i) {
            /*
             * Define two integers using only Math.random():
             *   col is a random integer from range [1,  4]
             *   rnk is a random integer from range [2, 14]
             */
            int col = assistant.getRandomInt(3) + 1;
            int rnk = assistant.getRandomInt(12) + 2;

            String color="";

             switch(col) {
                case 1:
                    color = "Spades";
                    break;
                case 2:
                    color = "Clubs";
                    break;
                case 3:
                    color = "Diamonds";
                    break;
                case 4:
                    color = "Hearts";
                    break;
            };

            String rank = "";  
            switch(rnk) {    
                case 2:
                    rank = "Two";
                    break;
                case 3:
                    rank = "Three";
                    break;
                case 4:
                    rank = "Four";
                    break;
                case 5:
                    rank = "Five";
                    break;
                case 6:
                    rank = "Six";
                    break;
                case 7:
                    rank = "Seven";
                    break;
                case 8:
                rank = "Eight";
                break;
                case 9:
                rank = "Nine";
                break;
                case 10:
                rank = "Ten";
                break;
                case 11:
                rank = "Deuce";
                break;
                case 12:
                rank = "Queen";
                break;
                case 13:
                rank = "King";
                break;
                case 14:
                rank = "Ace";
                break;

            };

            System.out.println(rank + " of " + color);
        }

        assistant.printSeparator("Zadanie 2");

        int[] arr = {1,8,2};

        int[] brr = new int[0];

        for (int i = arr.length -1 ; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                brr = Arrays.copyOf(brr, brr.length+1);
                brr[brr.length-1] = arr[i];

            }
        }

        assistant.printArray(arr);
        assistant.printArray(brr);

        assistant.printSeparator("Zadanie 4");

        int[] a = {-1, 9, 3, 0, -3, 2, 4};
        System.out.print("array: ");
        printArr(a);
        System.out.println(" odd: " + numOdd(a));
        System.out.println("even: " + numEven(a));
    
        int[] indMinMax = getMinMaxInd(a);
        System.out.println("Index of min: " + indMinMax[0]);
        System.out.println("Index of max: " + indMinMax[1]);
    
        int[][] res = getOddEven(a);
        System.out.print(" odd elements: ");
        printArr(res[0]);
        System.out.print("even elements: ");
        printArr(res[1]);

        assistant.printSeparator("Zadanie 5");

        int[] xarr = {1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1};

        printHist(xarr);


    }

    public static void printArr(int[] inputArr){
        System.out.print("[");
        for (int i=0; i<inputArr.length;i++){
            String sep = (i == inputArr.length-1) ? "]\n" : " ";
            System.out.print(inputArr[i] + sep);
        }

    }

    public static int numOdd(int[] inputArr){
        int oddCounter = 0;

        for(int i:inputArr){
            int result = (i %2!=0) ? 1 : 0;
            oddCounter += result;
        }
        return oddCounter;
    }

    public static int numEven(int[] inputArr){
        int oddCounter = 0;

        for(int i:inputArr){
            int result = (i %2==0) ? 1 : 0;
            oddCounter += result;
        }
        return oddCounter;
    }

    public static int[][] getOddEven(int[] input){

        int [][] resArray = new int [2][0];

        for (int i = 0; i < input.length; i++) {
            if (input[i]%2 != 0) {
                resArray[0] = Arrays.copyOf(resArray[0], resArray[0].length+1);
                resArray[0][resArray[0].length-1] = input[i];

            }
            else{
                resArray[1] = Arrays.copyOf(resArray[1], resArray[1].length+1);
                resArray[1][resArray[1].length-1] = input[i];

            }
        }

        return resArray;


    }

    public static int[] getMinMaxInd(int[] input){
        

        int minI = 0;
        int maxI = 0;

        for (int i = 0; i < input.length; i++) {
            minI = input[i] < input[minI] ? i : minI;
            maxI = input[i] > input[maxI] ? i : maxI;
        }

        int [] result = {minI,maxI};

        

        

        return result;


    }

    public static void printHist(int[] input){

        int maxValue = -1;
        
        for (int i : input) {
            maxValue = i > maxValue ? i : maxValue;
        }

        for (int i = maxValue; i >= 0; i--) {
            for (int j : input) {
                if (j > i ) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }

    }



    
}
