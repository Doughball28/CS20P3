package SkillBuilders;
import java.util.Scanner;
public class NumberSum {

	public static void main(String[] args) 
	{
		 Scanner input = new Scanner(System.in); // allows user input
	        
	        System.out.print("Enter a number: ");
	        int number = input.nextInt(); // read the number from the user
	        
	        int sum = 0; // variable to store the running total
	        
	        System.out.println("Numbers from 1 to " + number + ":");
	        
	        for (int i = 1; i <= number; i++) {
	            System.out.println(i); // display each number
	            sum += i;              // add i to the total sum
	        }
	        
	        System.out.println("Sum: " + sum); // display the total sum

	}

}
