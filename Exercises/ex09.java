package Exercises;

import PPJLabs.Assistant;

public class ex09 {

    public static void main(String[] args) {
        Assistant assistant = new Assistant();
        
        assistant.printSeparator("Zadanie 1");
        System.out.println("???");

        assistant.printSeparator("Zadanie 2");
        char[] arr = "Ala ma kota".toLowerCase().toCharArray();
        String lt = "ako";
        System.out.println("Ala ma kota");
        CountChars(arr, lt);

        assistant.printSeparator("Zadanie 3");
        int [][] ar0 = {{1,2,3},{1,2,3},{1,2,3}};
        int [][] ar1 = {{1,2,3},{1,2,3},{1,2,3}};
        int [][] ar2 = {{6,2,9},{3,2,1},{5,6,7}};
        int [][] ar3 = {{6,9},{3,2,1},{5,7}};

        System.out.println("Array 0: ");
        assistant.printArray2D(ar0);
        System.out.println("Array 1: ");
        assistant.printArray2D(ar1);
        System.out.println("Array 2: ");
        assistant.printArray2D(ar2);
        System.out.println("Array 3: ");
        assistant.printArray2D(ar3);

        System.out.println("Array 0 == Array 1 " + Compare2D(ar0, ar1));
        System.out.println("Array 0 == Array 2 " + Compare2D(ar0, ar2));
        System.out.println("Array 2 == Array 3 " + Compare2D(ar2, ar3));

        assistant.printSeparator("Zadanie 4");

        assistant.printArray(assistant.splitToDigits(26701));

        assistant.printSeparator("Zadanie 5");

        for (int i = 11; i < 10000; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i + " " + "jest liczbą narcystyczną");
            }
        }

        // 153 is Armstrong's number 1
        // 370 is Armstrong's number 2
        // 371 is Armstrong's number 3
        // 407 is Armstrong's number 4
        // 1634 is Armstrong's number 5
        // 8208 is Armstrong's number 6
        // 9474 is Armstrong's number 7
        // 54748 is Armstrong's number 8
        // 92727 is Armstrong's number 9
        // 93084 is Armstrong's number 10
        // 548834 is Armstrong's number 11
        // 1741725 is Armstrong's number 12
        // 4210818 is Armstrong's number 13
        // 9800817 is Armstrong's number 14
        // 9926315 is Armstrong's number 15
        // 24678050 is Armstrong's number 16
        // 24678051 is Armstrong's number 17
        // 88593477 is Armstrong's number 18
        // 146511208 is Armstrong's number 19
        // 472335975 is Armstrong's number 20
        // 534494836 is Armstrong's number 21
        // 912985153 is Armstrong's number 22


    }

    public static boolean isArmstrongNumber(int numberToCheck) {
        Assistant assistant = new Assistant();
        int total = 0;
        int [] digits = assistant.splitToDigits(numberToCheck);
        double power = digits.length;
        
        for (int i = 0; i < digits.length; i++) {
           total += (int) (Math.pow((double) digits[i], power));
        }

        return total == numberToCheck;
        
    }



    public static void CountChars(char[] arr, String lt) {
        lt = lt.toLowerCase();
        for (int i = 0; i < lt.length(); i++) {
            int count = 0;
            char lookup = lt.charAt(i);
            for (int j = 0; j < arr.length; j++) {
                if (lookup == arr[j]) {
                    count++;
                }
            }
            System.out.println(lookup + " " + count);
    
           }
    

    }

    public static boolean Compare2D(int[][] x, int[][] y) {
        boolean result = false;

        if (x.length != y.length) {
            return false;
        }

        for (int i = 0; i < x.length; i++) {

            result = CompareArrs(x[i], y[i]);
        }

        return result;

    }

    public static boolean CompareArrs(int[] arr1, int[] arr2) {
        
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    
}
