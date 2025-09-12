package SkillBuilders;

import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter the width of the rectangle: " );
		int width = scanner.nextInt();
		
		System.out.print("enter the length of the rectangle: " );
		int length = scanner.nextInt();
		
		int perimeter = 2 * (length + width);
		
		// display
		
		System.out.println("the perimeter of the rectangle is: " + perimeter);
		}

}
