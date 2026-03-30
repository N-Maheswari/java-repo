package inheritance;

public class Dog extends Animal {
	    String breed;

	    public Dog(String name, String sound, int legs, String breed) {
	        super(name, sound, legs);
	        this.breed = breed;
	    }

	    public void speak() {
	        System.out.println(name + " says " + sound + " and wags tail");
	    }
	}
