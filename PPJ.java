import java.util.Scanner;

public class PPJ {
    
    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Podaj liczbę uzyskanych oraz maksymalną liczbę punktów.");
        
        // for (int i = 0; i < 2; i++) {
        //     int input = scanner.nextInt();
        // }
        // scanner.close();


        // IV, V
        int wrt = 2;
        for (int i = 1; i < 11; i++) {
            if (i == 10) {
                System.out.print(i*wrt);
            }
            else{
                System.out.print(i*wrt + ",");
            }
        }
        System.out.println();

        //VI while i do while
        int base_w = 1;
        int base_dw = 1;
        System.out.println("While");
        while (base_w < 1) {
            base_w ++;
            System.out.println(base_w);
            
        }
        System.out.println("Do While");
        do {
            base_dw ++;
            System.out.println(base_dw);
        } while (base_dw < 1);

        // zad VIII
        // 1 / pow(2,n)

        
        for (int i = 0; i < 10; i++) {
            

        }


        


        


    }

    // VII
    public static void Zad7() {

        Scanner scanner = new Scanner(System.in);
        
        boolean toContinue = true;
        int totalSum = 0;
        int totalIterations = 0;

        while (toContinue) {
            int input = scanner.nextInt();
            if (input == 0) {
                toContinue = false;
                break;
            }
            totalSum+= input;
            totalIterations ++;
        }
        System.out.println("Suma = " + totalSum);
        System.out.println("Ilość elementów = " + totalIterations);


    }


    // zadanie II
    public static void QuadraticEq() {
        System.out.println("Podaj argumenty równania kwadratowego:");

        Scanner scanner = new Scanner(System.in);
        int[] params = new int[3];

        for (int i = 0; i < 3; i++) {
            int input = scanner.nextInt();
            params[i] = input;

        }
        scanner.close();
       
        // :(
        double a = params[0] * 1.0;
        double b = params[1] * 1.0 ;
        double c = params[2] * 1.0;

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




    public static double[] ZeroPlaceValue(double a, double b, double delta){
        double[] result = new double[2];

        double plus = (-1 * b + Math.sqrt(delta)) / (2 * a);
        double minus = (-1 * b - Math.sqrt(delta)) / (2 * a);

        result[0] = plus;
        result[1] = minus;
      
        return result;
    }





    // zadanie I
    public static void TriangleCheck() {

        Scanner scanner = new Scanner(System.in);
        int [] angles = new int[3];

        System.out.println("Wprowadź miary 3 kątów w trójkącie.");
        for (int i = 0; i < 3; i++) {
            int input = scanner.nextInt();
            angles[i] = input;

        }
        //scanner.close();

        // sprawdzenie 
        int total_angles = 0;
        boolean is_acute = true;

        for (int i = 0; i < angles.length; i++) {
            total_angles += angles[i];

            if (angles[i] >= 90) {
                is_acute = false; 
            }

        }

        if (total_angles != 180) {

            System.out.println("To nie jest trójkąt");
            return;
        
        }

        if (is_acute) {
            System.out.println("Trójkąt ostrokątny");
        }
        
    }

}
