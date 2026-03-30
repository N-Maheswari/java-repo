
/*Write a program that converts Celsius to Fahrenheit AND Kelvin. Formula: F = (C * 9/5) + 32, K = C + 273.15.*/

public class Temperature {

	public static void main(String[] args) {
		float celsius =98f, fahrenheit, kelvin;
		
		fahrenheit = (celsius*9/5) +32;
		System.out.println("Converting 98 degree Celsius to Fahrenheit ="+fahrenheit+" degree F");
		
		kelvin= celsius + 273.15f;
		System.out.println("Converting 98 degree Celsius to Kelvin ="+kelvin +" K");
	}

}
