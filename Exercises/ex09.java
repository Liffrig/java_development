package Exercises;

import java.util.Calendar;

import PPJLabs.Assistant;

public class ex09 {

    public static void main(String[] args) {
        Assistant assistant = new Assistant();

        assistant.printSeparator("Zadanie 1");

        printMonth(2023,1);
        
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

        assistant.printSeparator("Zadanie 6");

        assistant.printArray2D(calculateSquares(4, 4, 1));

        assistant.printSeparator("Zadanie 7");
        assistant.printArray(ar0[0]);
        swapTabElements(ar0[0], 0, 2);
        assistant.printArray(ar0[0]);

        assistant.printSeparator("Zadanie 8");

        String potPalindrome = "Zakopane na pokaz.";
        String potPalindrome2 = "A Toyota! Race fast... safe car: a Toyota.";
        System.out.println(potPalindrome + " palindrom -> " + isPalindrome(potPalindrome));
        System.out.println(potPalindrome2 + " palindrom -> " + isPalindrome(potPalindrome2));

    }

    public static boolean isPalindrome(String input){
        input = removeSpacesAndPunctuation(input).toLowerCase();

        if (input.charAt(0) != input.charAt(input.length()-1)) {
            return false;
        }
        if (input.length() >= 3) {
           return isPalindrome(input.subSequence(1, input.length()-1).toString());
        }
        else{
            return true;
        }
    }


    public static String removeSpacesAndPunctuation(String input) {
        return input.replaceAll("[\\s\\p{Punct}]", "");
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

    public static void printMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1,1); // 0 == January ???

        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 2; // make Monday 0

        firstDayOfWeek = firstDayOfWeek == -1 ? 6 : firstDayOfWeek; // make Sunday 6

        int[][] calendarArray = new int[6][7];
        int currentDay = 1;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 && j < firstDayOfWeek) {
                    calendarArray[i][j] = -1;
                } else {
                    if (currentDay <= daysInMonth) {
                        calendarArray[i][j] = currentDay;
                        currentDay++;
                    } else {
                        calendarArray[i][j] = -1;
                    }
                }
            }
        }

        int weekOfTheMonth = 1;

        for (int i = 0; i < calendarArray.length; i++) {
            System.out.print(weekOfTheMonth + "\t");
            for (int j = 0; j < calendarArray[i].length; j++) {
                if (calendarArray[i][j] != -1) {
                    System.out.print(calendarArray[i][j] + "\t");
                }
                else System.out.print("\t");

            }
            System.out.println();
            weekOfTheMonth++;
        }
    }

    public static int [ ] [ ] calculateSquares ( int screenWidth , int screenHeight , int side){
        
        if (side > screenHeight || side > screenHeight) {
            return new int[0][0]; 
        }
        if (side == screenHeight && side == screenHeight) {
            return new int[][] {{0},{0}}; 
        }

        int possibleSquares = (screenWidth/side) * (screenHeight/side);

        int [][] result = new int[possibleSquares][2];


        int curX = 0;
        int curY = 0;

        for (int i = 0; i < result.length; i++) {
            result[i][0] = curX;
            result[i][1] = curY;

            curY += side;

            if (curY+side > screenWidth) {
                curX += side;
                curY = 0;
            }
        }
        
        return result;

    }

    public static void swapTabElements ( int [ ] tab , int source , int destination ){
        int temp = tab[destination];

        tab[destination] = tab[source];
        tab[source] = temp;
    }




    
}
