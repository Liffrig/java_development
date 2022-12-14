package Exercises;
import java.util.Scanner;

import PPJLabs.Assistant;

public class ex02 {
    public static void main(String[] args) {

        Assistant assistant = new Assistant();
        
        //Zadanie 1
        // Napisz program, który wczytuje trzy liczby naturalne, a, b i c, i wypisuje "OK" jeśli
        // dla każdych dwóch z tych liczb ich suma jest większa niż trzecia z nich (czyli czy
        // istnieje trójkąt o długościach boków równych tym liczbom). Jeśli tak nie jest, program
        // powinien wypisać "NOT OK"

        assistant.printSeparator("Zadanie 1");
        
        int a = assistant.getRandomInt(180);
        int b = assistant.getRandomInt(180);
        int c = assistant.getRandomInt(180);
        System.out.println(a +" "+ b+" "+ c);

        boolean isTriangleA  = (a+b)>c ? true : false;
        boolean isTriangleB  = (a+c)>b ? true : false;
        boolean isTriangleC  = (c+b)>a ? true : false;

        if (isTriangleA && isTriangleB && isTriangleC) {
            System.out.println("OK");
        } else {
            System.out.println("NOT OK");
        }

        // Zadanie 2 ===================================================
        assistant.printSeparator("Zadanie 2");

        int a1 = assistant.getRandomInt(10);
        int a2 = a1 + assistant.getRandomInt(5);

        int b1 = assistant.getRandomInt(10);
        int b2 = b1 + assistant.getRandomInt(5);

        int x = assistant.getRandomInt(15);

        System.out.println("Interval A = ["+a1+", "+a2+"]" );
        System.out.println("Interval B = ["+b1+", "+b2+"]" );
        System.out.println("X = "+ x);

        // x in A:
        boolean isInA = (x>= a1) && (x<=a2);
        System.out.println("x in A:"+"\t"+isInA);

        // x in B:
        boolean isInB = (x>= b1) && (x<=b2);
        System.out.println("x in B:"+"\t"+isInB);

        // x in A\B:
        System.out.println("x in A\\B:" +"\t"+ ((isInA) && (!isInB)));

        // x in B\A:
        System.out.println("x in B\\A:" +"\t"+ ((isInB) && (!isInA)));

        // x in intersection of A and B: 
        System.out.println("x in intersection of A and B:" + "\t"+ ((isInB) && (isInA)));

        // x in union of A and B:
        System.out.println("x in union of A and B: "+"\t"+ (isInA || isInB) );

        // x in symm. diff. of A and B:
        System.out.println("x in symm. diff. of A and B:" + "\t"+ ((isInA || isInB) && !((isInB) && (isInA))));


        assistant.printSeparator("Zadanie 3");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a -> ");
        a = scan.nextInt();
        System.out.print("Enter b -> ");
        b = scan.nextInt();
        scan.close();

          // s1 should be " = " or " != "
        String s1 = a == b ? " = " : " != ";

          // s2 should be " = " or " < " or " > "
        String s2 = a == b ? " = " : a > b ? " > " : " < ";

        System.out.println(a + s1 + b);
        System.out.println(a + s2 + b);








        














    }
}
