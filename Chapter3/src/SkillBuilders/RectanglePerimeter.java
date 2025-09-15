package SkillBuilders;

import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		// get width
		System.out.print("enter the width of the rectangle: " );
		int width = scanner.nextInt();
		// get length
		System.out.print("enter the length of the rectangle: " );
		int length = scanner.nextInt();
		// add width and length for Perimeter
		int perimeter = 2 * (length + width);
		
		// display
		
		System.out.println("the perimeter of the rectangle is: " + perimeter);
		scanner.close();
	}

}
