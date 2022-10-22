import java.util.Scanner;

public class PPJ {
    
    public static void main(String[] args) {

        // zad II

        double x = (((1+ 2 * 3+ 4) / (5-6)) + 78) / (9- (10/11.0));
               System.out.println(x);


        // Zad III
        Scanner scanner = new Scanner(System.in);

       while (true) {

        System.out.println("Podaj rok: ");
        int input = scanner.nextInt();
        if (input <= 0) {
            System.out.println("Podano błędny rok.");
            break;
        }
        leap_year_check(input);
       }
       scanner.close();

       

    }

    public static void leap_year_check(int input) {

        boolean checkOne = (input%4 == 0 && input%100 > 0);
        boolean checkTwo = input%400 == 0;

        if (checkOne || checkTwo) {
            System.out.println("Rok " + input + " jest przestępny.");   
        }

        else{
            System.out.println("Rok " + input + " nie jest przestępny."); 

        }

        
    }



    public void zad1_3() {

               // I
               int y = 5;
               //  nawias i przypisanie, mnożenie potem print line
               System.out.println((y=4)* y);
       
               // II 
               // 1 . (6+1+4 / -1) + 78
               // 2. 9 - (10/11)
               double x = (((1+ 2 * 3 + 4) / 5-6) + 78)*1.0 / (9.0- (10.0/11.0));
               System.out.println(x);
               // III
               byte b = -128; 
               b = 127; // 8 bitów -> -128 do 127
               short s = -32768; // -32’768 do 32’767
               s = 32767; // -32’768 do 32’767, 
               int i = 0b01111111;
               i = 0x7F; // -2,147M do +2,147M
               long l = 1l;
               char c = 'a';
               boolean bl = false;
        
    }
}
