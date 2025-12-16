package Mastery;
import java.util.Scanner;
public class Game21app 
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Game21 game = new Game21();
        String playAgain = "y";

        while (playAgain.equalsIgnoreCase("y")) {
            hand player = game.dealInitialHand();
            hand computer = game.dealInitialHand();

            System.out.println("Your hand: " + player);
            System.out.print("Do you want a third card? (y/n): ");
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("y")) {
                game.dealCardToHand(player);
                System.out.println("Your new hand: " + player);
            }

            // Computer strategy: hit if less than 16
            while (computer.getBestValue() < 16) {
                game.dealCardToHand(computer);
            }

            System.out.println("\nComputer's hand: " + computer);
            System.out.println(game.determineWinner(player, computer));

            System.out.print("\nPlay again? (y/n): ");
            playAgain = input.nextLine();
        }

        System.out.println("Thanks for playing!");
    }
}
/*
Your hand: [2, 4] (Total: 6)
Do you want a third card? (y/n): y
Your new hand: [2, 4, Queen] (Total: 16)

Computer's hand: [9, 6, 4] (Total: 19)
Computer wins!

Play again? (y/n): y
Your hand: [4, Jack] (Total: 14)
Do you want a third card? (y/n): y
Your new hand: [4, Jack, 6] (Total: 20)

Computer's hand: [10, King] (Total: 20)
It's a tie!

Play again? (y/n): y
Your hand: [9, Jack] (Total: 19)
Do you want a third card? (y/n): n

Computer's hand: [2, 10, 4] (Total: 16)
You win!

Play again? (y/n): y
Your hand: [Queen, Ace] (Total: 21)
Do you want a third card? (y/n): n

Computer's hand: [Jack, 4, King] (Total: 24)
Computer busted! You win.

Play again? (y/n): n
Thanks for playing!

*/