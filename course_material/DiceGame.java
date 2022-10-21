package course_material;

import java.util.Scanner;

public class DiceGame {

    public static int croupierScore = 0;
    public static int playerScore = 0;

    public static void main(String[] args) {

        startGame();
    
    }

    public static int rollDice(){
        int roll = (int) (Math.random()*6);
        return roll + 1;

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

            case "n":
                while (croupierScore < playerScore) {
                    updateCroupierScore();
                    printScore('c');
                    checkWinCondition();

                    if (croupierScore == playerScore) {
                        System.out.println("It's a draw!");
                        startGame();
                    }
                }
                if (croupierScore == playerScore) {
                    System.out.println("It's a draw!");
                    startGame();
                }
                else if (croupierScore > playerScore){
                    System.out.println("Casino always wins :)");
                    startGame();

                }

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
                    updatePlayerScore();
                }
                updateCroupierScore();

                printScore('p');
                printScore('c');
                
                while (true){
                    hitOrStay();

                }
                
                
            default:
                scanner.close();
                System.out.println("Bye!");
                System.exit(0);
        }


        

    }









}
