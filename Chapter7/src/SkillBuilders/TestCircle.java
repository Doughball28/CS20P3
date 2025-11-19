package SkillBuilders;

public class TestCircle {

	public static void main(String[] args) 
	{

		// Using the default constructor
		Circle spot = new Circle();
		System.out.println("Default radius: " + spot.getRadius());
		
		// Using the overloaded constructor
		Circle dot = new Circle(5);
		System.out.println("Overloaded radius: " + dot.getRadius());
	}

}
