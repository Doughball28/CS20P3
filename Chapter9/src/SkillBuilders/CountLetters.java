package SkillBuilders;
import java.util.Scanner;
public class CountLetters 
{

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt user for a phrase
        System.out.print("Enter a phrase: ");
        String phrase = input.nextLine();

        int letterCount = 0;

        // Count only alphabetic letters in the phrase
        for (int i = 0; i < phrase.length(); i++) {
            char currentChar = phrase.charAt(i);

            if (Character.isLetter(currentChar)) {
                letterCount++;
            }
        }

        // Display result
        System.out.println("Number of letters in the phrase: " + letterCount);

        input.close();
    }
}
