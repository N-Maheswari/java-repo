/*Part 7: Polymorphism — Shape Hierarchy
Shape (Superclass): Include a color (String) field. Add methods area() (returning 0) and perimeter() (returning 0). Add a displayInfo() method that calls and prints the results of area() and perimeter().
Circle (Subclass): Add radius. Override area() ($\pi \times r^2$) and perimeter() ($2 \times \pi \times r$).
Rectangle (Subclass): Add width and height. Override both math formulas.
Triangle (Subclass): Add base, height, side1, side2, and side3. Override both math formulas ($\text{area} = 0.5 \times \text{base} \times \text{height}$).
Square (Subclass): Extend Rectangle. Take a single side parameter in the constructor and call super(side, side).
Testing (in main): Create a Shape[] array containing one of each shape type. Loop through the array and call displayInfo() on each. Notice how Java automatically calls the correct subclass version of the methods—this is polymorphism in action!*/
package polymorphism;

public class Shape {
	    String color;

	    public Shape(String color) {
	        this.color = color;
	    }

	    public double area() {
	        return 0;
	    }

	    public double perimeter() {
	        return 0;
	    }

	    public void displayInfo() {
	        System.out.println("Color: " + color);
	        System.out.println("Area: " + area());
	        System.out.println("Perimeter: " + perimeter());
	        System.out.println("----------------------");
	    }
}
