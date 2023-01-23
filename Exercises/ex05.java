package Exercises;
import java.util.Scanner;
import PPJLabs.Assistant;

public class ex05 {
    public static void main(String[] args) {
        Assistant assistant = new Assistant();



        assistant.printSeparator("Zadanie 4");

        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        assistant.printSeparator("Zadanie 5");
        int wrt = 2;
        for (int i = 1; i < 11; i++) {
            System.out.print(i*wrt + " ");
        }
        System.out.println();

        assistant.printSeparator("Zadanie 6");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę mniejsza niż 10.");
        var input = scanner.nextInt();
        var rand_num = 1;

        var while_result = input;
        var dowhile_result = input;

        while (input>10) {
            while_result += rand_num;
        }

        do {
            dowhile_result += rand_num;
        } while (input > 10);

        System.out.println("while -> " + while_result);
        System.out.println("do while -> "+dowhile_result);    

        assistant.printSeparator("Zadanie 7");

        int inpt;
        int intCount=0; 
        int intSum = 0;

        do {
            System.out.println("Wprowadź dowolną liczbę całkowitą: ");
            inpt = scanner.nextInt();
            intCount ++;
            intSum += inpt;
            
        } while (inpt > 0);

        System.out.println("Liczba elementów = " + intCount);
        System.out.println("Suma = " + intSum);

        assistant.printSeparator("Zadanie 8");

        for (double i = 0; i < 10; i++) {
            double sigma = 1 / (Math.pow(2, i));
            System.out.println("wyraz " + i + " -> " + sigma);
        }


        assistant.printSeparator("Zadanie 9");

        int dzien = 6;
        int miesiac = 7;
        int year = 2023;
        int[] days_on_1st_month = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

        int leap_day = assistant.isLeapYear(year) && (miesiac > 2) ? 1:0;
        System.out.println(year + "-" + miesiac + "-" + dzien + " --> " + (days_on_1st_month[miesiac-1] + dzien + leap_day + " dzień roku."));


        assistant.printSeparator("Zadanie 10");
        int rows = 6;
        int columns = 9;
        int size = rows * columns;

        for (int i = 0; i < size; i++) {
            if (i % columns == 0) {
                System.out.println();
            }
            String sign = i % 2 == 0 ? "[*]":"[ ]";
            System.out.print(sign);

        }
        System.out.println();


    }
        
    // zad I
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


    // zad III
    public static void zad3(){

        Assistant assistant = new Assistant();
        assistant.printSeparator("Zadanie 3");

        double [] tresholds = {0.0, 50.0, 62.5, 74.9,81.24,87.4,87.5,100.0};
        double [] marks = {2.0,3.0,3.5,4.0,4.5,5.0,5.0};

       
            System.out.println("Wprowadź zdobyte punkty i maksymalną liczbę: ");
            Scanner scanner = new Scanner(System.in);
            double[] params = new double[2];
            for (int i = 0; i < params.length; i++) {
                double input = scanner.nextDouble();
                params[i] = input;
    
            }
            double result = params[0] / params[1] * 100.0;
    
            // find a mark to a result
    
            int treshold_indicator = 0;
            for (int i = 0; i < tresholds.length; i++) {
                if (result > tresholds[i+1]) {
                    treshold_indicator++;
                }
                else{break;}
            }
    
            System.out.println("wynik: " + result + " ocena: " + marks[treshold_indicator] );

    }

}
