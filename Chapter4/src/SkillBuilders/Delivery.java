package SkillBuilders;
import java.util.Scanner;
public class Delivery {

	public static void main(String[] args) 
	{
		  Scanner scanner = new Scanner(System.in);

	        // Get package dimensions
	        System.out.print("Enter the length of the package: ");
	        int length = scanner.nextInt();

	        System.out.print("Enter the width of the package: ");
	        int width = scanner.nextInt();

	        System.out.print("Enter the height of the package: ");
	        int height = scanner.nextInt();

	        // Check dimensions
	        if (length > 10 || width > 10 || height > 10) {
	            System.out.println("Reject");
	        } else {
	            System.out.println("Accept");
	        }

	        scanner.close();
	 }
}