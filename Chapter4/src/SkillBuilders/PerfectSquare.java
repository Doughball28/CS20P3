package SkillBuilders;
import java.util.Scanner;
public class PerfectSquare {

	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner(System.in);

	        // Ask the user for an integer
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();

	        // Find the square root
	        double sr = Math.sqrt(number);

	        // Truncate by casting to int
	        int truncated = (int) sr;

	        // Square the truncated result
	        int squared = truncated * truncated;

	        // Check if it's a perfect square
	        if (squared == number) {
	            System.out.println(number + " is a perfect square.");
	        } else {
	            System.out.println(number + " is NOT a perfect square.");
	        }

	        scanner.close();

	}

}
