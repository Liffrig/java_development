package etstudio;
import java.util.Scanner;


public class Utilities {


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
        scanner.close();
        System.out.println("Suma = " + totalSum);
        System.out.println("Ilość elementów = " + totalIterations);


    }

    public static void EuclideanAlgorithm(int n, int p){
        
        if (n == p) {
            System.out.println(n);
            return;
        }
        else if (p > n) {
            int[] swapped = SwapVars(n, p);
            n = swapped[0];
            p = swapped[1];
        }

        n = n-p;

        EuclideanAlgorithm(n, p);

    }


    public static int[] SwapVars(int n, int p){
        int temp = p;
        p = n;
        n = temp;
        int[] swapped = {n,p};
        return swapped;

    }

    public static long Zadanie2(int x, int y){
        

        int z = y / 2;
        
        int subtotal = x*x;
        int result = 1;

        for (int i = 0; i < z; i++) {
            result *= subtotal;
        }
        
      
        return result;
    }


    public static long Zadanie1(){

        // read input from user and print a number

        boolean isNumber = true;
        long result = 0L;

        while (isNumber) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadź wartość");
            String input = scanner.nextLine();

            isNumber = isNumeric(input);
            if (isNumber) {
                result = result*10 + Integer.parseInt(input);
            }
            else{
                scanner.close();
                return result;
               
            }
            scanner.close();
        }

        
 
        return result;
    }
    

    public static void leap_year_check(int input) {

        boolean checkOne = (input%4 == 0 && input%100 > 0);
        boolean checkTwo = input%400 == 0;

        if (checkOne || checkTwo) {
            System.out.println("Rok " + input + " jest przestępny.");   
        }
        else{
            System.out.println("Rok " + input + " nie jest przestępny."); 
        }

    }

    public static boolean isPrime(int x) {
        boolean result = true;
        int value = (int) Math.sqrt(x);
        

        for (int i = value; i > 1 ; i--) {
            if (x%i == 0) {
                result = false;
                break;
            } 
        }
        return result;

    }

    

    public static void weatherCheck(boolean rain, boolean sun) {

        if (sun == rain) {
          System.out.println( sun ? "rainbow" : "cloudy") ;
        }
        if (sun == true && rain == false) {
            System.out.println("sunny");
        }
        else{
            System.out.println("slob");
        }
    
        
    }



    public static void lastlab(){
               // zadanie 1
               boolean [] values = {true, false};
               System.out.println("Iloczyn logiczny");
               for (boolean a : values) {
                   for (boolean b : values) {
                       
                       //String alt = String.valueOf(b||c);
                       String con = String.valueOf(a&&b);
                       System.out.println(String.valueOf(a) +  " " + String.valueOf(b) + ">>>" + con);
       
                   }
               }
               System.out.println();
               System.out.println("Suma logiczna");
               for (boolean b : values) {
                   for (boolean c : values) {
                       
                       String alt = String.valueOf(b||c);
                       System.out.println(String.valueOf(b) +  " " + String.valueOf(c) + ">>>" + alt);
                   }
               }
       
               // zadanie 2
               int [] numbers = {13,15,17};
               for (int i : numbers) {
                   System.out.println("Is " + i + " prime");
                   System.out.println(isPrime(i));  
               }
       
               // zadanie 5
               for (boolean a : values) {
                   for (boolean b : values) {
       
                       System.out.println(String.valueOf(a) +  " " + String.valueOf(b) + ">>>");
                       weatherCheck(a, b);
                   }
               }
    }




    public static boolean isNumeric(String str) { 
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
      }
    
}
// class Recurs1 {
//     static int count(int[] arr, int from, int what) {
//         if (from < ) {
            
//         }
        
//     }