package Exercises;

import java.util.Scanner;

import PPJLabs.*;

public class ex01 {

    public static void main(String[] args) {

        Assistant assistant = new Assistant();

        // Zadanie 1
        // Napisz program, który wczytuje trzy liczby, a,b i c, a następnie znajduje i
        // drukuje środkową (co do wartości) z nich.
        // Zmienne a, b i c nie powinny być modyfikowane.
        assistant.printSeparator("Zadanie 1");
        int a = assistant.getRandomInt(10);
        int b = assistant.getRandomInt(10);
        int c = assistant.getRandomInt(10);

        System.out.println(a + " " + b + " " + c);

        if ((b >= a && a >= c) || (b <= a && a <= c)) {
            System.out.println(a);
        }

        if ((a >= b && b >= c) || (a <= b && b <= c)) {
            System.out.println(b);
        }

        if ((a >= c && c >= b) || (a <= c && c <= b)) {
            System.out.println(c);
        }

        // Zadanie 2
        // Napisz program wczytujący cztery liczby całkowite i wypisujący różnicę między
        // największą i najmniejszą z nich.
        // Nie używaj tablic, napisów ani innych kolekcji.
        assistant.printSeparator("Zadanie 2");

        a = assistant.getRandomInt(10);
        b = assistant.getRandomInt(10);
        c = assistant.getRandomInt(10);
        int d = assistant.getRandomInt(10);
        System.out.println(a + " " + b + " " + c + " " + d);

        // max(a,b) = (a+b + mod(a-b)) / 2

        int max = Math.max(Math.max(a, b), Math.max(c, d));
        int min = Math.min(Math.min(a, b), Math.min(c, d));

        System.out.println("Result: " + (max - min));

        // Zadanie 3
        // Napisz program wczytujący trzy liczby całkowite.
        // Następnie zmienia wartości tych trzech zmiennych tak, aby w a znalazła się
        // najmniejsza z wczytanych liczb, w b środkowa, a w c największa.
        // Wydrukuj i powinny to być te same trzy liczby, ale we wzrastającym porządku.
        // Dowolne dwie (lub wszystkie trzy) liczby mogą być równe.

        assistant.printSeparator("Zadanie 3");

        a = assistant.getRandomInt(10);
        b = assistant.getRandomInt(10);
        c = assistant.getRandomInt(10);
        System.out.println(a + " " + b + " " + c);

        if (b > c) {
            int[] swapped = assistant.swapVariables(b, c);
            b = swapped[0];
            c = swapped[1];
        }
        if (a > b) {
            int[] swapped = assistant.swapVariables(a, b);
            a = swapped[0];
            b = swapped[1];
        }
        if (b > c) {
            int[] swapped = assistant.swapVariables(b, c);
            b = swapped[0];
            c = swapped[1];
        }

        System.out.println(a + " " + b + " " + c);

        // Zadanie 4
        assistant.printSeparator("Zadanie 4");

        Scanner sca = new Scanner(System.in);
        System.out.print("Enter three boolean " +
                "values (true or false) ");
        boolean x = sca.nextBoolean();
        boolean y = sca.nextBoolean();
        boolean z = sca.nextBoolean();
        sca.close();

        boolean allThree = x && y && z;
        boolean exactlyOne = (x && (!y) && (!z)) || (y && (!x) && (!z)) || (z && (!y) && (!x)); // atLeastOne &&
                                                                                                // !atLeastTwo
        boolean exactlyTwo = (x && y || y && z || x && z) && (!allThree);
        boolean atLeastOne = (x || y || z);
        boolean atLeastTwo = exactlyTwo || allThree;

        System.out.println("x, y, z = " + x + ", " + y +
                ", " + z + "\nallThree:   " + allThree +
                "\nexactlyOne: " + exactlyOne +
                "\nexactlyTwo: " + exactlyTwo +
                "\natLeastOne: " + atLeastOne +
                "\natLeastTwo: " + atLeastTwo);

    }

}
