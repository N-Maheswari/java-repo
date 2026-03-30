package polymorphism;

public class Test {
	    public static void main(String[] args) {

	        Shape[] shapes = new Shape[4];

	        shapes[0] = new Circle("Orange", 7);
	        shapes[1] = new Rectangle("Pink", 3, 5);
	        shapes[2] = new Triangle("Blue", 2, 3, 2, 3, 5);
	        shapes[3] = new Square("White", 4);

	        for (Shape s : shapes) {
	            s.displayInfo();
	        }
	    }
}
