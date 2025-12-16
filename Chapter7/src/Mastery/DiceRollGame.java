package Mastery;

import java.util.Scanner;

public class DiceRollGame 
{

    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);
        exercise4 player = new exercise4();

        System.out.println("Welcome to Dice Roll!");
        System.out.println("You start with 1000 points.");

        while (true) 
        {

            System.out.print("\nEnter points to risk (-1 to exit): ");
            int risk = input.nextInt();
            input.nextLine(); 

            if (risk == -1) {
                System.out.println("\nExiting game...");
                break;
            }

            // Prevent negative or too-large risk
            if (risk < 0 || risk > player.getScore()) {
                System.out.println("Invalid risk value. Try again.");
                continue;
            }

            System.out.print("Choose high or low: ");
            String call = input.nextLine().toLowerCase();

            if (!call.equals("high") && !call.equals("low")) {
                System.out.println("Invalid choice. Enter 'high' or 'low'.");
                continue;
            }

            int total = player.rollDice();

            System.out.println("\nYou rolled a total of: " + total);

            boolean correct = false;

            if (total >= 2 && total <= 6) 
            {
                System.out.println("Result: LOW");
                if (call.equals("low")) correct = true;

            } else if (total >= 8 && total <= 12) 
            {
                System.out.println("Result: HIGH");
                if (call.equals("high")) correct = true;

            } else {
                System.out.println("Result: NEITHER (7)");
                correct = false;
            }

            if (correct) 
            {
                int winnings = risk;
                player.win(winnings);
                System.out.println("Correct! You win " + winnings + " points.");
            } else 
            {
                player.lose(risk);
                System.out.println("Wrong guess. You lose " + risk + " points.");
            }

            System.out.println("Your current score: " + player.getScore());
        }

        System.out.println("Final score: " + player.getScore());
        System.out.println("Thanks for playing!");
        input.close();
    }
}

/* screen dump

Welcome to Dice Roll!
You start with 1000 points.

Enter points to risk (-1 to exit): 1000
Choose high or low: high

You rolled a total of: 3
Result: LOW
Wrong guess. You lose 1000 points.
Your current score: 0

Enter points to risk (-1 to exit): -1
Exiting game...
Final score: 0
Thanks for playing!
*/