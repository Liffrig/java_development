
public class LearingJava {
    public static long points = 0L;
    public static void main(String[] args) {
      
        double pcnt = 0.33333333;

        int secondValue = 101;



        System.out.println(pcnt * secondValue);

        

    }


    public static void Print(long input){
        System.out.println(input);
    }

    public static void UpdatePoints(long amount){
        points += amount;
        Print(points);
    }




}

