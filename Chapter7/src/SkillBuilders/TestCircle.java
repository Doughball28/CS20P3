package SkillBuilders;

public class TestCircle {

	public static void main(String[] args) 
	{

		//default constructor
		Circle spot = new Circle();
		System.out.println("Default radius: " + spot.getRadius());
		System.out.println("Default Area: " + spot.getarea());
		//overloaded constructor
		
		Circle dot = new Circle(5, 10);
		System.out.println("Overloaded radius: " + dot.getRadius());
		System.out.println("Overloaded area: " + dot.getarea());

		System.out.println("spot: " + spot.toString());
		System.out.println("dot: " + dot.toString());
				
		System.out.println("spot equals dot? " + spot.equals(dot));
				
		// Another circle identical to spot
		Circle spot2 = new Circle(1, 2);
		System.out.println("spot equals spot2? " + spot.equals(spot2));		
				
		
	}
}
