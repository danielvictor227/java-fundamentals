package broexercises;

import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors {
    public static void main(String[] args) {
            //DECLARE VARIABLES
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            
            String[] choices = {"rock", "paper", "scissors"};
            String playerChoice;
            String computerChoice;
            String playAgain = "yes";
            // GET A CHOICE FROM THE USER
           do{
            System.out.print("Enter your move(rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && 
            !playerChoice.equals("paper") && 
            !playerChoice.equals("scissors"))
            {
                System.out.println("Invalid Choice!");
                continue;
            }

            computerChoice = choices[random.nextInt(3)].toLowerCase();
            System.out.println("Computer Choice: " + computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            }
            else if(playerChoice.equals("rock") && computerChoice.equals("scissors")
            || playerChoice.equals("paper") && computerChoice.equals("rock")
            || playerChoice.equals("scissors") && computerChoice.equals("paper"))
            {
                System.out.println("You Win!");
            }

            else{
                System.out.println("You Lose!");
            }
            // GET RANDOM CHOICE FROM THE COMPUTER
            // CHECK WIN CONDITIONS
            // ASK TO PLAY AGAIN?
            System.out.print("Play again? (yes/no)?: ");
            playAgain = scanner.nextLine().toLowerCase();
        } while(playAgain.equals("yes"));
        System.out.println("Thanks for playing!");
            // GOODBYE MESSAGE
            scanner.close();
        
    }
}
