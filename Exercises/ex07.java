package Exercises;
import java.util.Scanner;
import PPJLabs.Assistant;

public class ex07 {
    public static void main(String[] args) {

        Assistant assistant = new Assistant();
        // zad 1 i 2 to ex06 -1 i -2
        assistant.printSeparator("Zadanie 3");
        System.out.println("commented out code");
        // Zad3();

        assistant.printSeparator("Zadanie 4");
        int [ ] arr = { 153,333,370,515,407,80};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Is " + arr[i] + " Armstrongs' number? >>>" + isArmstrongNumber(arr[i]));
        }

        assistant.printSeparator("Zadanie 5");

        int arrSize = 10 + assistant.getRandomInt(5);
        int[] crazyArr = new int[arrSize];
        int[] properArr = new int[arrSize];
        System.out.println("Initial array:");
        assistant.printArray(crazyArr);

        for (int i=1; i<crazyArr.length; i++) crazyArr[i] = i;
        
        System.out.println("Filled array:");
        assistant.printArray(crazyArr);
        System.out.println("Mixed array:");
        int currentIndex = properArr.length - 1;
        for (int i = 0; i < properArr.length; i++) {
            int randomIndex = assistant.getRandomInt(currentIndex);
            int temp = crazyArr[currentIndex];

            // swap arr positions
            crazyArr[currentIndex] = crazyArr[randomIndex];
            crazyArr[randomIndex] = temp;
            properArr[i] = crazyArr[currentIndex];

            crazyArr[currentIndex] = -1;
            currentIndex--;
        }
        assistant.printArray(properArr);

        System.out.println("Permutation Table:");
        for (int i = 0; i < properArr.length; i++) {
            for (int j = 0; j < properArr.length; j++) {
                String toPrint = i == properArr[j] ? " * " : " . ";
                System.out.print(toPrint); 
            }
         System.out.println();
        }
        System.out.println();

        assistant.printSeparator("Zadanie 6");

        int [] randArray1 = GetSuperRandomArray(1 + assistant.getRandomInt(10));
        int [] randArray2 = GetSuperRandomArray(1 + assistant.getRandomInt(10));
        System.out.println("Arrays:");
        assistant.printArray(randArray1);
        assistant.printArray(randArray2);

        System.out.println("Combined Array");
        int [] combinedArray = new int[randArray1.length + randArray2.length];
        System.arraycopy(randArray1,0,combinedArray,0,randArray1.length);
        System.arraycopy(randArray2,0,combinedArray,randArray1.length,randArray2.length);
        assistant.printArray(combinedArray);

        System.out.println("Common Items");
        int[] commonItemArray = new int[0];
        for (int i = 0; i < randArray1.length; i++) {
            for (int j = 0; j < randArray2.length; j++) {
                if (randArray1[i] == randArray2[j] && randArray1[i] != -1) {
                    commonItemArray = assistant.addItemTotheArray(commonItemArray,randArray2[j]);
                    randArray1[i] = -1;
                    randArray2[j] = -1;
                }
            }
            
        }

        assistant.printArray(commonItemArray);

        System.out.println("Between min and max, but not in arrays:");
        
        int[] finalArray = new int[0];
        int max = assistant.findMaxElement(combinedArray);
        int min = assistant.findMinElement(combinedArray);

        for (int i = min+1; i < max; i++) {
            int indic = 0;
            for (int j = 0; j < commonItemArray.length; j++) {
                if (commonItemArray[j] == i) {
                    indic++;
                    break;
                }
                
            }
            if (indic == 0) {
                finalArray = assistant.addItemTotheArray(finalArray, i);
            }
        }

        assistant.printArray(finalArray);

        assistant.printSeparator("KONIEC");

    }

    // <zad 6>
    public static int[] GetSuperRandomArray(int size){
        Assistant assistant = new Assistant();
        int arrSize = size + assistant.getRandomInt(size);
        int [] randArray = new int[arrSize];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = assistant.getRandomInt(randArray.length + size + 100);
        }
        return randArray;
    }
    // </zad 6>





    // <zad 3>
    public static boolean OnlyZeros(char[] arr){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
            return false;
        }
        }
        return true;
    }

    public static void ReplaceCharWith0(char c, char[] arr) {
        int found = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                arr[i] = 0;
                found++;
            }
        }
        System.out.println(c + " found: " + found);
    }
    
    public static void Zad3(){
        Assistant assistant = new Assistant();
        char[] charArr = new char[5];
        int range = 'z' - 'a';
      
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = (char) ('a' + assistant.getRandomInt(range));
        }
        assistant.printArray(charArr);
        Scanner scanner = new Scanner(System.in);

        while(!OnlyZeros(charArr)){
            char c = scanner.next().charAt(0);
            ReplaceCharWith0(c, charArr);
        }
        scanner.close();
    }
    //</zad 3>

    // <zad 4>
    public static boolean isArmstrongNumber(long numberToCheck) {

        long total = 0l;
        long [] digits = splitToDigits(numberToCheck);
        double power = digits.length;
        
        for (int i = 0; i < digits.length; i++) {
           total += (long) (Math.pow((double) digits[i], power));
        }

        return total == numberToCheck;
    }

    public static long[] splitToDigits(long number) {
        int arrayLength = ((int) Math.log10((double) number)) + 1;
        double power = (double) (arrayLength - 1);
   
        long[] result = new long[arrayLength]; 

        for (int i = 0; i < result.length; i++) {
             int divisor = (int) Math.pow(10.0, power);
             result[i] = number / divisor;
             number = number - (divisor * result[i]);
             power --;
            
        }
        return result;
    }
    // </zad 4>





}

