package inheritance;

public class Bird extends Animal {
	    boolean canFly;

	    public Bird(String name, String sound, int legs, boolean canFly) {
	        super(name, sound, legs);
	        this.canFly = canFly;
	    }

	    public void speak() {
	        System.out.println(name + " chirps " + sound);
	    }

	    public void fly() {
	        if (canFly) {
	            System.out.println(name + " is flying!");
	        } else {
	            System.out.println(name + " cannot fly.");
	        }
	    }
}
