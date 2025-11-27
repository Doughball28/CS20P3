package SkillBuilders;

public class Circle 
{
	private static final double PI = 3.14;
	private double radius;
	private double area;
	
	// Default constructor
	public Circle() 
	{
		radius = 1;
		area = 2;
	}

	// Overloaded constructor that accepts the radius and area
	public Circle(double r, double a)
	{
		radius = r;
		area = a;
	}
		
	public double getRadius()
	{
		return radius;
	}
		
	public double getarea()
	{
		return area;
	}

	public double area()
	{
		double circleArea;
		circleArea = PI * radius * radius;
		return circleArea; 
	}
	
	public double circumference()
	{
		double c;
		c = 2 * PI * radius;
		return c;
	}

	// toString override
	@Override
	public String toString()
	{
		return "Circle[radius=" + radius + ", area=" + area + "]";
	}

	// equals override
	@Override
	public boolean equals(Object obj)
	{
		if (obj == null)
			return false;

		if (obj.getClass() != getClass())
			return false;

		Circle other = (Circle) obj;

		// compare fields
		return radius == other.radius && area == other.area;
	}
}