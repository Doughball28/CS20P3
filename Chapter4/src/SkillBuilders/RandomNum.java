package SkillBuilders;
import java.util.Scanner;
public class RandomNum {

	 public static void main(String[] args) 
	 {
	        Scanner scanner = new Scanner(System.in);

	        // Ask user for minimum value
	        System.out.print("Enter the minimum value: ");
	        int min = scanner.nextInt();

	        // Ask user for maximum value
	        System.out.print("Enter the maximum value: ");
	        int max = scanner.nextInt();

	        // Generate random integer between the min and max
	        int randomNum = (int)(Math.random() * (max - min + 1)) + min;

	        // Display result
	        System.out.println("Random number between " + min + " and " + max + " is: " + randomNum);
	        scanner.close();  
	 }
	}