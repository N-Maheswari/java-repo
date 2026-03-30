/*Write a program with a String variable: String light = "Red"; (test with Red, Yellow, Green).
Use a switch statement to print the appropriate action for each light colour.
Red → 'STOP — Do not proceed.'
Yellow → 'CAUTION — Prepare to stop.'
Green → 'GO — Proceed safely.'
Default → 'UNKNOWN signal — treat as Red.'
Also use a ternary to print: 'Safe to go: true/false' based on whether the light is Green.
Expected Output (sample):
Light: Red
Action: STOP — Do not proceed.
Safe to go: false*/

public class TrafficProblem {

	public static void main(String[] args) {
	String light ="red";
	//String light="green";
	//String light="yellow";
	System.out.println("Light:"+light);
	switch(light) {
	case "red":
		System.out.println("Action: STOP -Do not proceed");
		break;
	case "yellow":
		System.out.println("Action: CAUTION - Prepare to Stop");
		break;
	case "green" :
		System.out.println("Action: GO - Proceed safely");
		break;
	default:
		System.out.println("Action: UNKNOWN SIGNAL - Treat as Red");
	}
	
	System.out.println("Safe to go:"+(light.equals("green")?true:false));
	 }

}
