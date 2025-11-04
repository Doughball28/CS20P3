package SkillBuilders;
import java.util.Scanner;
public class OddSum {

	public static void main(String[] args) 
	{
		 Scanner input = new Scanner(System.in); // allows user input

	        System.out.print("Enter a number: ");
	        int number = input.nextInt(); // get user input

	        int sum = 0; // variable to hold the total sum

	        System.out.println("Odd numbers from 1 to " + number + ":");

	        // loop from 1 to the entered number
	        for (int i = 1; i <= number; i++) {
	            if (i % 2 != 0) { // check if number is odd
	                System.out.println(i); // display odd number
	                sum += i; // add to the sum
	            }
	        }

	        System.out.println("Sum: " + sum); // display the final sum

	}

}
