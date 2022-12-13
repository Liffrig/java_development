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


    // zadanie II
    public static void QuadraticEq() {
        System.out.println("Podaj argumenty równania kwadratowego:");

        Scanner scanner = new Scanner(System.in);
        int[] params = new int[3];

        for (int i = 0; i < 3; i++) {
            int input = scanner.nextInt();
            params[i] = input;

        }
        scanner.close();
       
        // :(
        double a = params[0] * 1.0;
        double b = params[1] * 1.0 ;
        double c = params[2] * 1.0;

        if (a == 0.0) {
            System.out.println("To nie jest równanie kwadratowe");
            return;
        }

        double delta = Math.pow(b, 2) - (4*a*c);

        if (delta < 0.0) {
            System.out.println("Miejsca zerowe nie istnieją.");
            return;
        }

        if (delta == 0.0) {
            double onlySolution = -1 * b/2*a;
            System.out.println("Tylko jedno rozwiazanie: " + onlySolution);
            return;
        }


        double[] results = ZeroPlaceValue(a, b, delta);

        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }
    }




    public static double[] ZeroPlaceValue(double a, double b, double delta){
        double[] result = new double[2];

        double plus = (-1 * b + Math.sqrt(delta)) / (2 * a);
        double minus = (-1 * b - Math.sqrt(delta)) / (2 * a);

        result[0] = plus;
        result[1] = minus;
      
        return result;
    }





    // zadanie I
    public static void TriangleCheck() {

        Scanner scanner = new Scanner(System.in);
        int [] angles = new int[3];

        System.out.println("Wprowadź miary 3 kątów w trójkącie.");
        for (int i = 0; i < 3; i++) {
            int input = scanner.nextInt();
            angles[i] = input;

        }
        //scanner.close();

        // sprawdzenie 
        int total_angles = 0;
        boolean is_acute = true;

        for (int i = 0; i < angles.length; i++) {
            total_angles += angles[i];

            if (angles[i] >= 90) {
                is_acute = false; 
            }

        }

        if (total_angles != 180) {

            System.out.println("To nie jest trójkąt");
            return;
        
        }

        if (is_acute) {
            System.out.println("Trójkąt ostrokątny");
        }
        
    }

}
