package ex_classes;
import java.io.IOException;
import java.io.InputStream;

public class MojSkaner {

    private InputStream input;

    public MojSkaner(InputStream input) {
        this.input = input;
    }

    public String odczytajSlowo(){

        StringBuilder result = new StringBuilder();

        int tmp;
        char sp = ' ';

        try {
            while( (tmp = this.input.read()) != ((int) sp)
            && (char) tmp != '\r' && (char) tmp != '\n' ){
                result.append((char) tmp);
            }
            return result.toString();
            
        } catch (IOException e) {
            return e.getMessage();
        }
        
    }

    public String odczytajLinie(){

        StringBuilder result = new StringBuilder();

        int tmp;
        try {

            while(true){
                tmp = this.input.read();
                if (tmp == -1) {
        
                    return result.toString();
                }
                if ((char) tmp != '\r' && (char) tmp != '\n') {
                    result.append((char) tmp);
                }
                if (tmp == '\n') {
                    return result.toString();
                }
                
            }
             
            
        } catch (IOException e) {
            return e.getMessage();
        }
        
    }

    public int odczytajLiczbeCalkowita(){

        String nextWord = odczytajSlowo();
        String regex = "[0-9]*";
        StringBuilder sb = new StringBuilder();
        StringBuilder test_sb = new StringBuilder();


        for (int i = 0; i < nextWord.length(); i++) {
            test_sb.append(nextWord.charAt(i));
            if (test_sb.toString().matches(regex)) {
                sb.append(nextWord.charAt(i));
            }
        }

        return Integer.parseInt(sb.toString());


    }




    
}
