package Exercises;
import java.io.FileInputStream;
import java.io.FileWriter;

import PPJLabs.Assistant;

public class ex13 {

    static int fileCount = 50;

    public static void main(String[] args) {

        Assistant assistant = new Assistant();

        assistant.printSeparator("Zadanie 1");

        int number = assistant.getRandomInt(33000);
        System.out.println("Number is: " + number);

        for (int i = 1; i <= 4; i++) {
            System.out.println(AllBaseIntRepresentation(number, (int) Math.pow(2, i)));
        }

        assistant.printSeparator("Zadanie 2");
        CountValuesAndOccurences("input.txt");
        //"henry-iv-part-1_TXT_FolgerShakespeare.txt"

        assistant.printSeparator("Zadanie 3");

        try {
            FileInputStream fi = new FileInputStream("zad3.txt");

            int tmp;
            int totalSum=0;
            int finValue=0;

            while ((tmp = fi.read()) >= -1) {
                if (tmp == ' ' ) {
                    totalSum += finValue;
                    finValue = 0;
                    continue;
                }
                if (tmp == -1) {
                    totalSum += finValue;
                    finValue = 0;
                    break;
                }

                finValue *= 10;
                tmp = (tmp - '0');
                finValue += tmp;
            }

            System.out.println(totalSum);
    
            fi.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assistant.printSeparator("Zadanie 4");



        for (int i = 0; i < fileCount; i++) {
            int[] arr = assistant.GetRandomFixedSizeArray(10, 10000);
            assistant.quickSort(arr, 0, arr.length-1);
            assistant.printArray(arr);
            try {
                FileWriter fw = new FileWriter("files/inputData" + i +".txt");
    
                for (int j = 0; j < arr.length; j++) {
                    fw.append(arr[j] + " ");
                }
                fw.close();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }

        assistant.printSeparator("Zadanie 5");
        try {

            int[] resultTab = new int[0];

            for (int i = 0; i < fileCount; i++) {
                FileInputStream fi = new FileInputStream("files/inputData" + i +".txt");

                int tmp;
                int finValue=0;
                while ((tmp = fi.read()) != -1) {
                    if (tmp == ' ' ) {
                        resultTab = assistant.addItemTotheArray(resultTab, finValue);
                        finValue = 0;
                        continue;
                    }
    
                    finValue *= 10;
                    tmp = (tmp - '0');
                    finValue += tmp;
                }
                fi.close();


            }

            assistant.quickSort(resultTab, 0, resultTab.length-1);
            assistant.printArray(resultTab);
            SaveArrToAFile(resultTab, "consolidated_zad5");

            
        } catch (Exception e) {
            e.printStackTrace();
        }

        

     




        





        
       

        








    }

    public static void SaveArrToAFile(int[] arr, String fileName){

    
        try {
            FileWriter fw = new FileWriter("files/" + fileName + ".txt");

            for (int j = 0; j < arr.length; j++) {
                fw.append(arr[j] + "\n");
            }
            fw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    
    public static void CountValuesAndOccurences(String path) {

        try {
            FileInputStream fi = new FileInputStream(path);

            int size = fi.available();
            int[] values = new int[size];
            int[] occurences = new int[size];

            for (int i = 0; i < occurences.length; i++) {
                values[i] = -1;
                occurences[i] = -1;
            }

            int tmp;
            while ((tmp = fi.read()) != -1) {
                
                int firstCheck = GetIndexOfTheData(values, tmp);

                if (firstCheck == -1) {
                    int savedIndex = SaveAndReturnIndex(values, tmp);
                    occurences[savedIndex] = 1;
                }
                else{
                    occurences[firstCheck] ++;
                }

                
            }
            fi.close();

            for (int i = 0; i < values.length; i++) {
                if (values[i] != -1) {
                    System.out.print(((char) values[i]) + " : " + occurences[i] + "\n");
                    
                }
            }



            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }


    public static StringBuilder AllBaseIntRepresentation(int number, int base) {

        StringBuilder sb = new StringBuilder();

        int[] possibleBaseValues = { 2, 4, 8, 16 };
        boolean proceed = false;

        for (int v : possibleBaseValues) {
            proceed = (v == base);
            if (proceed) {
                break;
            }
        }

        if (proceed) {
            int shift = (int) (Math.log(base * 1.0) / Math.log(2.0));
            int iniShift = 32 % shift == 0 ? shift : shift - 1;
            for (int i = (32 - iniShift); i >= 0; i -= shift) {

                int tempNumber = number >>> i;
                int result = tempNumber & (base - 1);
                sb.append(Integer.toHexString(result));

            }
            return sb;

        } else {
            return sb.append("Incorrect base: " + base);
        }

    }

    public static int GetIndexOfTheData(int[] arr, int val){
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                result = i;
            }
        }

        return result;
    }

    public static int SaveAndReturnIndex(int[] arr, int val){

        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                arr[i] = val;
                result = i;
                break;
            }
        }
        
        return result;


    }
}
