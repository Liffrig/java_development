package course_material;

public class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 0; i <= 18; i++) {
          String result = Fizz(i) + Buzz(i);

          if (result.length() > 2) {
            System.out.println(i +" >>> "+ result);
          }


        }

        
    
    }

    public static String Fizz(int x){
        if (x%3 == 0) {
            return "Fizz"; 
        }
        else return "";
    }
    public static String Buzz(int x){
        if (x%5 == 0) {
            return "Buzz"; 
        }
        else return "";
    }
    
}
