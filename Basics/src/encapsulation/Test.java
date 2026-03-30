package encapsulation;

public class Test {
	    public static void main(String[] args) {

	        Person p = new Person("Siva", 25, "abcde@gmail.com", 50000);

	       
	        System.out.println("Initial Values:");
	        System.out.println("Name: " + p.getName());
	        System.out.println("Age: " + p.getAge());
	        System.out.println("Email: " + p.getEmail());
	        System.out.println("Salary: " + p.getSalary());

	        System.out.println("\nTrying to set invalid values...");

	       
	        p.setAge(-5);
	        p.setSalary(-1000);
	        p.setEmail("notvalid");

	        System.out.println("\nAfter Invalid Updates:");
	        System.out.println("Name: " + p.getName());
	        System.out.println("Age: " + p.getAge());       // should remain 25
	        System.out.println("Email: " + p.getEmail());   // should remain valid
	        System.out.println("Salary: " + p.getSalary()); // should remain 50000
	    }
	}


