package Exercises;

import PPJLabs.Assistant;

public class ex13 {

    public static void main(String[] args) {

        Assistant assistant = new Assistant();

        assistant.printSeparator("Zadanie 1");

        int number = assistant.getRandomInt(33000);
        System.out.println("Number is: " + number);

        for (int i = 1; i <= 4; i++) {
            System.out.println(AllBaseIntRepresentation(number, (int) Math.pow(2, i)));
        }

        assistant.printSeparator("Zadanie 2");
        

        

    }

    public static StringBuilder AllBaseIntRepresentation(int number, int base){

        StringBuilder sb = new StringBuilder();

        int[] possibleBaseValues = {2,4,8,16};
        boolean proceed = false;

        for (int v : possibleBaseValues) {
            proceed = (v == base);
            if (proceed) {
                break;
            } 
        }

        if (proceed) {
            int shift = (int) (Math.log(base*1.0) / Math.log(2.0));
            int iniShift = 32 % shift == 0 ? shift : shift - 1;
            for (int i = (32 - iniShift); i >= 0; i-= shift) {

                int tempNumber = number >>> i;
                int result = tempNumber & (base-1);
                sb.append(Integer.toHexString(result));

            }
            return sb;
            
        }
        else{
            return sb.append("Incorrect base: " + base);
        }


      



    } 
    
}
