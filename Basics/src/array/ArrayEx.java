/*
 Fixed-Size Array: Quiz Score Analyzer
Create an int[] array containing 8 quiz scores (e.g., 85, 92, 78, 90, 88, 76, 95, 89).
Use a for loop to find and print the highest score in the array.
Use the same loop (or a new one) to find and print the lowest score.
Calculate and print the average score of the class.
*/
package array;

public class ArrayEx {
	public static void main(String[] args) {
	 int[] scores = {85, 92, 78, 90, 88, 76, 95, 89};

     int highest = scores[0];
     int lowest = scores[0];
     int sum = 0;

     for (int score : scores) {
         if (score > highest) {
             highest = score;
         }
         if (score < lowest) {
             lowest = score;
         }
         sum += score;
     }

     double average = (double) sum / scores.length;

     System.out.println("Highest Score: " + highest);
     System.out.println("Lowest Score: " + lowest);
     System.out.println("Average Score: " + average);
}
}
