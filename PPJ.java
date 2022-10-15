import java.text.BreakIterator;
import java.util.Scanner;

public class PPJ {
    
    public static void main(String[] args) {

        // int x = 2;
        // int y = 21;
        // System.out.println(Zadanie2(x,y));
        // System.out.println(Math.pow(x, y));

        int n = 800;
        int p = 160;

        EuklideanAlgo(n,p);


    


       
    }


    public static void EuklideanAlgo(int n, int p){
        
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

        EuklideanAlgo(n, p);

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
        }
 
        return result;
    }





    // --------------------------------

    public static boolean isNumeric(String str) { 
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
      }



}
