package Mastery;
import java.util.Scanner;
public class Exercise10 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("are you looking for the volume of a rectangle sphere or cube?: ");
		String shape = scan.nextLine();
		
		if (shape.equalsIgnoreCase("rectangle")) 
		{
			System.out.print("please enter the length: ");
			int length = scanner.nextInt();
			
			System.out.print("please enter the width: ");
			int width = scanner.nextInt();
			
			System.out.print("please enter the height: ");
			int height = scanner.nextInt();
			int volume = (length * width * height);
			System.out.print("the volume of the rectangle is: " + volume);
		}
		else if (shape.equalsIgnoreCase("sphere")) 
		{
			System.out.print("please enter the diameter: ");
			int diameter = scanner.nextInt();
			
			int volume = (int) ( Math.PI * diameter * diameter * diameter / 6 );
			System.out.print("the volume of the rectangle is: " + volume);
		}
		else if (shape.equalsIgnoreCase("cube")) 
		{
			System.out.print("please enter the length of any side: ");
			int side = scanner.nextInt();
			
			int volume = (side * side * side );
			System.out.print("the volume of the rectangle is: " + volume);
		}
		else 
		{
			System.out.print("invalid input");
		}
	}

}
