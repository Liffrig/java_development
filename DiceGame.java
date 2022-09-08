import java.util.Scanner;

public class DiceGame {

    public static int croupierScore = 0;
    public static int playerScore = 0;

    public static void main(String[] args) {

        startGame();
        


    }

    public static int rollDice(){
        int roll = (int) (Math.random()*6);
        if (roll == 0) {
            return roll+1;
        }
        else{
            return roll;
        }
    }

    public static void updatePlayerScore(){
        playerScore += rollDice();

    }

    public static void updateCroupierScore(){
        croupierScore += rollDice();
    }


    public static void printScore(char who){
        switch (who) {
            case 'p':
                System.out.println("Current player score -> " + playerScore);
                break;
            default:
                System.out.println("Current croupier score -> " + croupierScore);
                break;
        }
    }

    public static void checkWinCondition(){
        if (croupierScore == 21) {
            System.out.println("Croupier got 21! You loose :( \n");
            startGame();
        } 
        else if (playerScore == 21) {
            System.out.println("You got 21, congratulations! \n");
            startGame();
            
        }
        else if (croupierScore > 21){
            System.out.println("You win!");
            startGame();

        }
        else if (playerScore > 21){
            System.out.println("You loose :( \n");
            startGame();

        }


    }

    public static void hitOrStay(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to hit? [y]/[n]");
        String decision = scanner.nextLine();


        switch (decision) {
            case "y":
                updatePlayerScore();
                printScore('p');
                checkWinCondition();
                break;
        
            default:
                break;
        }
        
    }

    

 
    public static void startGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Want to play a game? [y]/[n]");
        String decision = scanner.nextLine();

        switch (decision) {
            case "y":
                croupierScore = 0;
                playerScore = 0;
                System.out.println("### GAME STARTS NOW ###\n");

                for (int i = 0; i < 2; i++) {
                    updateCroupierScore();
                    updatePlayerScore();
                }

                printScore('p');
                printScore('c');
                while (true){
                    hitOrStay();

                }
                


                
        
            default:
                System.exit(0);
        }


        scanner.close();

    }









}
