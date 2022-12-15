package Exercises;

import PPJLabs.Assistant;

public class ex03 {
    public static void main(String[] args) {

        Assistant assistant = new Assistant();

        // zadanie 4
        assistant.printSeparator("Zadanie 4 - Leap Year Calculator");
        // Program powinien wyświetlić informację o tym, czy ten rok jest przestępny.
        // Wykorzystaj fakt, że aby rok był przestępny, liczba reprezentująca rok musi:
        // być podzielna bez reszty przez 4 i nie być podzielna przez 100,
        // lub być podzielna bez reszty przez 400

        int[] years = {1700,1800,21,1,40,13,2020,2001};
        
        for (int i = 0; i < years.length; i++) {
            boolean con1 = years[i] % 4 == 0;
            boolean con2 = years[i] % 100 > 0;
            boolean con3 =  years[i] % 400 == 0;

            String message = ((con1 && con2) || con3) ? "Rok " +years[i]+ " jest przestępny." : "Rok " +years[i]+ " nie jest przestępny.";
            System.out.println(message);
        }

        
    }
}
