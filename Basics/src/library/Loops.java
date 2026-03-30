/*Part 1: Control Flow & Loops
Write a program to execute the following tasks:
For Loop: Print the multiplication table for 7 (from $7 \times 1$ through $7 \times 10$).
While Loop: Find and print the first number greater than 1 whose square is strictly greater than 500.
Nested Loops: Print a right-angled triangle pattern made of stars (*) with exactly 5 rows.*/
package library;

public class Loops {

	public static void main(String[] args) {
		int k=7;
		System.out.println("------------------For LOOP-------------------------");
			for(int i=1;i<=10;i++) {
				System.out.println("7*" +i +"=" +k*i);
				}
		System.out.println("------------------While LOOP-------------------------");
		int n=1;
		while(n<50) {
			int square=n*n;
			if (square>500) {
				System.out.println("Number(>1)whose square is greater than 500 is "+ n +" Square of n"+square);
				break;
			}
			n++;
		}
		System.out.println("------------------Nested LOOPS-------------------------");
		for(int i =0;i<5;i++){
			int num=0;
				while(num<=i) {
					System.out.print("*");
					num++;
				}
			System.out.println();
		}
		
			
	     }
	}


