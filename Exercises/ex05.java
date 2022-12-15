package Exercises;
import java.util.Scanner;

import PPJLabs.Assistant;

public class ex05 {
    public static void main(String[] args) {

        //ex05.zad1();
        ex05.QuadraticEq();

    }
        


    public static void zad1() {
        
        Assistant assistant = new Assistant();

        assistant.printSeparator("Zadanie 1");

        // Wprowadź z klawiatury wartości trzech kątów hipotetycznego trójkąta. Następnie
        // sprawdź czy taki trójkąt może istnieć na płaszczyźnie euklidesowej, a jeżeli tak to czy
        // jest ostrokątny.

        int[] angles = new int[3];

        Scanner scanner = new Scanner(System.in);
        int totalAngles = 0;

        for (int i = 0; i < angles.length; i++) {
            System.out.println("Wprowadź miarę kąta " + (i+1) );
            angles[i] = scanner.nextInt();
            totalAngles += angles[i];

        }
        scanner.close();

        assistant.printArray(angles);
        if (totalAngles == 180) {
            boolean isAcute = true;

            for (int i = 0; i < angles.length; i++) {
                isAcute = angles[i] >= 90 ? false : true;
                if (!isAcute) {
                    break;
                }
            }

            System.out.println("Euklidean: true | Acute: " + isAcute);
        }
        else{
            System.out.println("Not Euklidean");
        }


    
    }

        // zadanie II
        public static void QuadraticEq() {
            System.out.println("Podaj argumenty równania kwadratowego:");
    
            Scanner scanner = new Scanner(System.in);
            double[] params = new double[3];
    
            for (int i = 0; i < 3; i++) {
                double input = scanner.nextDouble();
                params[i] = input;
    
            }
            scanner.close();
           
            
            double a = params[0];
            double b = params[1];
            double c = params[2];
    
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

    private static double[] ZeroPlaceValue(double a, double b, double delta){
        double[] result = new double[2];

        double plus = (-1 * b + Math.sqrt(delta)) / (2 * a);
        double minus = (-1 * b - Math.sqrt(delta)) / (2 * a);

        result[0] = plus;
        result[1] = minus;
      
        return result;
    }
}
