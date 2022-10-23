import java.util.Scanner;

public class PPJ {
    
    public static void main(String[] args) {

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


}
