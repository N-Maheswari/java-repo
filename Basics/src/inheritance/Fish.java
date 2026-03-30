package inheritance;

public class Fish extends Animal {
	    String waterType; // Fresh or Salt

	    public Fish(String name, String sound, int legs, String waterType) {
	        super(name, sound, legs);
	        this.waterType = waterType;
	    }

	    public void swim() {
	        System.out.println(name + " is swimming in " + waterType + " water.");
	    }
}