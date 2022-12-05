package PPJLabs;

public class Assistant {

    
    public Assistant() {
        
    }

    public void printSeparator(String title){
        System.out.println("================================== [ "+title+" ] ==================================");
    }


    // array printing metods for 1D
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

    // array printing metods for 2D
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

    // varoius numerical methods

    public boolean isPrime(int number){
        int limit = (int) Math.sqrt(number);
        boolean isPrime = true; 
        if (number<=3) isPrime = (number > 1);

        if (number % 2 == 0 || number % 3 == 0) {
            isPrime = false;
        };

        for (int i = 5; i < limit+1; i+=6) {
            if (number % i == 0 || number % (i+2) == 0) isPrime = false; 
        }

        return isPrime;
    }





}