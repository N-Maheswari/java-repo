package polymorphism;

public class Circle extends Shape {
	    double radius;
	    
	    public Circle(String color, double radius) {
	        super(color);
	        this.radius = radius;
	    }

	    public double area() {
	        return Math.PI * radius * radius;
	    }

	    public double perimeter() {
	        return 2 * Math.PI * radius;
	    }

}
