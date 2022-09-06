import java.util.Scanner;

public class LearingJava {
    public static long points = 0L;
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value:");

        double x = scanner.nextDouble();

        System.out.println(x);

        scanner.close();
       
    }


    public static void Print(long input){
        System.out.println(input);
    }

    public static void UpdatePoints(long amount){
        points += amount;
        Print(points);
    }




}

