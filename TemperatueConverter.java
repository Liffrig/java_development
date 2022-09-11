public class TemperatueConverter {
    public static void main(String[] args) {

        double noon = 93;          //temperature at noon in fahrenheit.
        double evening = 70;       //temperature during the evening in fahrenheit
        double midnight = 45; //temperature at midnight in fahrenheit
        char f = 'f'   ;  
        
        double pol1 = -31;
        double pol2 = -27;
        double pol3 = -5;
        char c = 'c';


        System.out.println("Temperatures in USA:");
        PrintTemperature(noon,f);
        PrintTemperature(evening,f);
        PrintTemperature(midnight,f);

        System.out.println("\nTemperatures in Poland");
        PrintTemperature(pol1,c);
        PrintTemperature(pol2,c);
        PrintTemperature(pol3,c);

    }

    /**
     * Prints temperature in given units and in the opposite units C->F // F->C
     * @param temperature (double)
     * @param uom (char)
     * 
     */
    public static void PrintTemperature(double temperature, char uom){
        System.out.println("Temperature is " +  String.format("%1.2f", temperature) + " " + GetTempSign(uom));
        System.out.println("And this is "  + String.format("%1.2f", ConvertTemperatue( temperature, uom)) + " " + GetTempSign(InverseTemp(uom)));

    }

    /**
     * 
     * @param temperature (double)
     * @param uom (char)
     * @return (double)
     * 
     *  Inside the function:
     *  1. return the celsius temperature.    C = (F - 32) * 5/9
     *  2. return the farenheight temperature.    F = c * 9/5 + 32
     */
    public static double ConvertTemperatue(double temperature, char uom){
        
        switch (uom) {
            case 'c':
                double f = (temperature * (9.0/5.0)) + 32;
                return f;
            case 'f':
               double c = (temperature - 32) * 5/9;
               return c;

            default:
                System.out.println("couldn't convert");
                return temperature;
        }

    }

    public static char InverseTemp(char uom){
        if (uom == 'c') {
            return 'f';
        } else {
            return 'c';
        }
    }

    /**
     * Function name:  GetTempSign
     * 
     * @param uom (char)
     * @return (String)
     * 
     * Stupid way of uppercasing XD.
     * 
     */
    public static String GetTempSign(char uom){
        switch (uom) {
            case 'c':
                return "C"; 
            case 'f':
                return "F";
            default:
                return "not found";
        }
    }


    
}


