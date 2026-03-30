/*Write a program that takes a full name string (hardcoded): String fullName = "  alice marie johnson  ";
Trim whitespace, then capitalize the first letter of each word (use a combination of substring, toUpperCase, and concatenation).
Extract and print: first name, middle name, last name separately using indexOf and substring.
Count how many vowels (a,e,i,o,u — both upper and lower case) are in the cleaned name.
Reverse the string character by character using a loop and string concatenation.
Hint: Use toLowerCase() first before vowel counting so you only need to check lowercase vowels.
Expected Output (sample):
Cleaned: Alice Marie Johnson
First: Alice  Middle: Marie  Last: Johnson
Vowel count: 8
Reversed: nosnhoJ eiraM ecilA */

public class StringExplanation {

	public static void main(String[] args) {
		String fullName = " alice marie johnson ";
		System.out.println("FullName:"+fullName);
		//trim
		String name =fullName.trim();
		System.out.println("FullName:"+ fullName.trim());
		//capitalize first letter
	    int firstSpace = name.indexOf(" ");
		int secondSpace = name.indexOf(" ", firstSpace + 1);
		//System.out.println(firstSpace);
		String first = name.substring(0, firstSpace);
		String middle = name.substring(firstSpace + 1, secondSpace);
		String last = name.substring(secondSpace + 1);
 
		first = first.substring(0,1).toUpperCase() + first.substring(1);
	    middle = middle.substring(0,1).toUpperCase() + middle.substring(1);
	    last = last.substring(0,1).toUpperCase() + last.substring(1);

	    String cleanedName= first + " " + middle + " " + last;

		System.out.println("Cleaned: " + cleanedName);
		System.out.println("First: " + first + "  Middle: " + middle + "  Last: " + last);

		        // Count vowels
		String lower = cleanedName.toLowerCase();
		int count = 0;

		        for(int i = 0; i < lower.length(); i++){
		            char c = lower.charAt(i);
		            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
		                count++;
		            }
		        }
         System.out.println("Vowel count: " + count);

		        // Reversen string
		        String reversed = " ";
		        for(int i = cleanedName.length()-1; i >= 0; i--){
		            reversed = reversed + cleanedName.charAt(i);
		        }

		        System.out.println("Reversed: " + reversed);
	}
}
