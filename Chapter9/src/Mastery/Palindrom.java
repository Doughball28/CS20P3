package Mastery;
import java.util.Scanner;
public class Palindrom 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

        // Prompt user for a string
        System.out.print("Enter a word or phrase: ");
        String userInput = input.nextLine();

        // Remove non-letter characters and convert to lowercase
        String cleanedInput = "";
        for (int i = 0; i < userInput.length(); i++) {
            char ch = userInput.charAt(i);

            if (Character.isLetter(ch)) {
                cleanedInput += Character.toLowerCase(ch);
            }
        }

        // Check if palindrome
        boolean isPalindrome = true;
        int left = 0;
        int right = cleanedInput.length() - 1;

        while (left < right) {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string IS a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        input.close();
    
}
			
	}
/* Enter a word or phrase: kayak
The string IS a palindrome.

Enter a word or phrase: points
The string is NOT a palindrome.
*/
