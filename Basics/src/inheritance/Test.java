package inheritance;

public class Test {
	    public static void main(String[] args) {

	        Animal a = new Animal("Animal", "SomeSound", 4);
	        Dog d = new Dog("Tommy", "Bark", 4, "Labrador");
	        Bird b = new Bird("Birdy", "Chirp", 2, true);
	        Fish f = new Fish("Fishy", "Blub", 0, "Salt");

	        a.speak();
	        d.speak();
	        b.speak();
	        f.speak();

	        b.fly();
	        f.swim();

	        System.out.println("\nUsing Animal array:");

	        Animal[] animals = new Animal[4];
	        animals[0] = a;
	        animals[1] = d;
	        animals[2] = b;
	        animals[3] = f;

	        for (Animal animal : animals) {
	            animal.speak(); 
	        }
	    }
}
