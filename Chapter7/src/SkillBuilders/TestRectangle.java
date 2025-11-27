package SkillBuilders;

public class TestRectangle {
	
		public static void main(String[] args) 
	{
			Rectangle box = new Rectangle();
			System.out.println("default length " + box.getLength());
			System.out.println("default width " + box.getWidth());
			System.out.println("default area" + box.getArea());
			
			Rectangle box2 = new Rectangle(5, 5);
			System.out.println("overloaded length " + box2.getLength());
			System.out.println("overloaded width " + box2.getWidth());
			System.out.println("overloaded area" + box2.getArea());
			
			

	        // default constructor
	        Rectangle r1 = new Rectangle();
	        System.out.println("Rectangle 1: " + r1);

	        // overloaded constructor
	        Rectangle r2 = new Rectangle(5, 3);
	        System.out.println("Rectangle 2: " + r2);

	        // another rectangle same as r2
	        Rectangle r3 = new Rectangle(5, 3);
	        System.out.println("Rectangle 3: " + r3);
			
			System.out.println("r2 equals r3? " + r2.equals(r3));  // true
	        System.out.println("r1 equals r2? " + r1.equals(r2));  // false
	}
}
