/*Part 2: String Manipulation
Create a class with the following methods and test them in your main method:
int countVowels(String s): Count the vowels in the string manually using a charAt loop.
String reverseString(String s): Reverse the given string using a for loop and string concatenation.
boolean isPalindrome(String s): Check if the string reads the same forwards and backwards. Requirement: You must ignore case and ignore spaces.
int countOccurrences(String text, String word): Count and return how many times the word appears within text.
*/
package library;

public class stringManipulation {
	
		public int countVowels(String s) {
			int count = 0;
	        s = s.toLowerCase();
	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                count++;
	            }
	        }
	        return count;

	}
		String reverseString(String s) {	
			 String reversed = "";
		        for (int i = s.length() - 1; i >= 0; i--) {
		            reversed = reversed + s.charAt(i);
		        }
		        return reversed;
	}
		boolean isPalindrome(String s) {
			  s = s.replace(" ", "").toLowerCase();
		      String reversed = reverseString(s);
		      return s.equals(reversed);
		}	
		
		int countOccurrences(String text, String word) {
			int count = 0;
	        text = text.toLowerCase();
	        word = word.toLowerCase();
	        int index = 0;
	        while ((index = text.indexOf(word, index)) != -1) {
	            count++;
	            index = index + word.length();
	        }
	        return count;
		}
			
	   public static void main(String[] args) {

			        stringManipulation s= new stringManipulation();

			        String str = "Have a great day";
			        String text = "Changes must start from you";

			        System.out.println("Vowels: " + s.countVowels(str));
			        System.out.println("Reversed: " + s.reverseString(str));
			        System.out.println("Is Palindrome: " + s.isPalindrome(str));
			        System.out.println("Occurrences of 'you': " + s.countOccurrences(text, "you"));	
			    }
		}

