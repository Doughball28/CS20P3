package SkillBuilders;

public class Rectangle {

    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        length = 1;
        width = 1;
    }

    // Overloaded constructor
    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {

        if (obj == this) {       
            return true;
        }

        if (!(obj instanceof Rectangle)) {
            return false;
        }

        Rectangle other = (Rectangle) obj;

        return length == other.length && width == other.width;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Rectangle[length=" + length +
               ", width=" + width +
               ", area=" + getArea() +
               ", perimeter=" + getPerimeter() + "]";
    }
}