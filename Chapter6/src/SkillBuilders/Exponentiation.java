package SkillBuilders;
import java.util.Scanner;
public class Exponentiation {

	public static double powerOf(double base, double exponent) {
        return Math.pow(base, exponent);
    }
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//get 2 numbers from the user
		 System.out.print("Enter the base number: ");
	        double base = input.nextDouble();

	        System.out.print("Enter the exponent: ");
	        double exponent = input.nextDouble();
		
	        // Call the method and display the result
	        double result = powerOf(base, exponent);

	        System.out.println(base + " raised to the power of " + exponent + " is " + result);
	    
	}
	
}
