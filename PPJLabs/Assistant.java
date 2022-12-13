package PPJLabs;

public class Assistant {

    
    public Assistant() {
        
    }

    public void printSeparator(String title){
        System.out.println("================================== [ "+title+" ] ==================================");
    }


    // array printing metods for 1D ==============================================================
    public void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            String separator = (i == (array.length-1)) ? "]\n" : ", ";
            System.out.print(array[i] + separator);
        }
    }

    public void printArray(char[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            String separator = (i == (array.length-1)) ? "]\n" : ", ";
            System.out.print(array[i] + separator);
        }
    }

    public void printArray(double[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            String separator = (i == (array.length-1)) ? "]\n" : ", ";
            System.out.print(array[i] + separator);
        }
    }

    public void printArray(float[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            String separator = (i == (array.length-1)) ? "]\n" : ", ";
            System.out.print(array[i] + separator);
        }
    }

    // array printing metods for 2D ==============================================================
    public void printArray2D(int[][] array){
        for (int i = 0; i < array.length; i++) {
            printArray(array[i]);
        }
    }

    public void printArray2D(char[][] array){
        for (int i = 0; i < array.length; i++) {
            printArray(array[i]);
        }
    }

    public void printArray2D(double[][] array){
        for (int i = 0; i < array.length; i++) {
            printArray(array[i]);
        }
    }

    // Swap variables ==============================================================
    public int[] swapVariables(int n, int p){
        int temp = p;
        p = n;
        n = temp;
        int[] swapped = {n,p};
        return swapped;

    }

    public double[] swapVariables(double n, double p){
        double temp = p;
        p = n;
        n = temp;
        double[] swapped = {n,p};
        return swapped;

    }

    public char[] swapVariables(char n, char p){
        char temp = p;
        p = n;
        n = temp;
        char[] swapped = {n,p};
        return swapped;

    }

    public String[] swapVariables(String n, String p){
        String temp = p;
        p = n;
        n = temp;
        String[] swapped = {n,p};
        return swapped;

    }

    // return random values ===================================================

    public int getRandomInt(int range){

        int randomInt =  ((int) (Math.random() * (range+1)));
        return randomInt;

    }

    public double getRandomDouble(int range){

        double randomDouble = ((double) (Math.random() * (range)));
        return randomDouble;

    }



    // varoius numerical methods ==============================================================
    public boolean isPrime(int number){
        int limit = (int) Math.sqrt(number);
        boolean isPrime = true; 
        if (number <= 3) isPrime = (number > 1);

        if (number % 2 == 0 || number % 3 == 0) {
            isPrime = false;
        };

        for (int i = 5; i < limit+1; i+=6) {
            if (number % i == 0 || number % (i+2) == 0) isPrime = false; 
        }

        return isPrime;
    }

    // =================================================
    public int countDigits(int number){
        return ((int) Math.log10(number)+1);
    }

    public int countDigits(long number){
        return ((int) Math.log10(number)+1);
    }
    // =================================================

    public int[] splitToDigits(int number) {
        int arrayLength = countDigits(number);
        double power = (double) (arrayLength - 1);
   
        int [] result = new int[arrayLength]; 

        for (int i = 0; i < result.length; i++) {
             int divisor = (int) Math.pow(10.0, power);
             result[i] = number / divisor;
             number = number - (divisor * result[i]);
             power --;
        }
        return result;
    }








}