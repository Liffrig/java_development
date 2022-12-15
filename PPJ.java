import java.util.Scanner;
import PPJLabs.*;

public class PPJ {
    
    public static void main(String[] args) {

        // int superCount = 0;
        // for (long i = 10l; i < 10000000000l; i++) {
        //     if (isArmstrongNumber(i)) {
        //         superCount++;
        //         System.out.println(i + " " + "is Armstrong's number " + superCount );
        //     }
        // };

        PPJLabs.Assistant marek = new Assistant();

        int[][] tab = {{1,2,6,7,8,9,0},{1,2,6,7,8,9,0},{1,2,6},{1,6,7,8,9,0} };

        marek.printSeparator("test");

        marek.printArray(marek.splitToDigits(137213));

        
        
    }

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






    // VII
    public static void Zad7() {

        Scanner scanner = new Scanner(System.in);
        
        boolean toContinue = true;
        int totalSum = 0;
        int totalIterations = 0;

        while (toContinue) {
            int input = scanner.nextInt();
            if (input == 0) {
                toContinue = false;
                break;
            }
            totalSum+= input;
            totalIterations ++;
        }
        System.out.println("Suma = " + totalSum);
        System.out.println("Ilość elementów = " + totalIterations);


    }














