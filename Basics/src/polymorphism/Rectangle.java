package polymorphism;

public class Rectangle  extends Shape {
	    double width, height;

	    public Rectangle(String color, double width, double height) {
	        super(color);
	        this.width = width;
	        this.height = height;
	    }

	    public double area() {
	        return width * height;
	    }

	    public double perimeter() {
	        return 2 * (width + height);
	    }
}
