package SkillBuilders;
import java.util.Scanner;
public class Hurricane {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("input the catagory of the hurricane from 1-5: ");
		int hurricane = scanner.nextInt();
		
		if (hurricane == 1)
		{
			System.out.println("Catagory 1:");
			System.out.println("74-95 mph");
            System.out.println("64-82 kt");
            System.out.println("119-153 km/hr");
		}
		else if (hurricane == 2) {
            System.out.println("Category 2:");
            System.out.println("96-110 mph");
            System.out.println("83-95 kt");
            System.out.println("154-177 km/hr");
        } 
        else if (hurricane == 3) {
            System.out.println("Category 3:");
            System.out.println("111-130 mph");
            System.out.println("96-113 kt");
            System.out.println("178-209 km/hr");
        } 
        else if (hurricane == 4) {
            System.out.println("Category 4:");
            System.out.println("131-155 mph");
            System.out.println("114-135 kt");
            System.out.println("210-249 km/hr");
        } 
        else if (hurricane == 5) {
            System.out.println("Category 5:");
            System.out.println("Greater than 155 mph");
            System.out.println("Greater than 135 kt");
            System.out.println("Greater than 249 km/hr");
        } 
        else {
            System.out.println("Invalid category! Please enter a number between 1 and 5.");
        }
		scanner.close();
	}

}
