/*Part 5: Encapsulation — Person Class 🟢 Easy
Demonstrate FULL encapsulation by creating a Person class:
Fields: Must all be private: name (String), age (int), email (String), and salary (double).
Getters: Write public getters for all fields.
Setters (with validation): * age must be between 0 and 120.
salary must not be negative.
email must contain an '@' symbol.
Note: If validation fails, print an error message and keep the old value.
Testing (in main): Create a Person. Attempt to set invalid values (e.g., age = -5, salary = -1000, email = "notvalid"). Verify and print that the old values were preserved.
*/
package encapsulation;

public class Person {

	    private String name;
	    private int age;
	    private String email;
	    private double salary;

	    public Person(String name, int age, String email, double salary) {
	        this.name = name;
	        setAge(age);
	        setEmail(email);  
	        setSalary(salary);
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public double getSalary() {
	        return salary;
	    }


	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(int age) {
	        if (age >= 0 && age <= 120) {
	            this.age = age;
	        } 
	        else {
	            System.out.println("Invalid age! Keeping old value: " + this.age);
	        }
	    }

	    public void setEmail(String email) {
	        if (email.contains("@")) {
	            this.email = email;
	        } else {
	            System.out.println("Invalid email! Keeping old value: " + this.email);
	        }
	    }

	    public void setSalary(double salary) {
	        if (salary >= 0) {
	            this.salary = salary;
	        } else {
	            System.out.println("Invalid salary! Keeping old value: " + this.salary);
	        }
	    }
	}

