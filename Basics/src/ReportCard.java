/*A student has 5 subject marks (all hardcoded, test with different sets): Maths, Science, English, History, Java Programming.
Calculate total and percentage.
Assign grade using if-else: A+ (>=90), A (>=80), B (>=70), C (>=60), D (>=50), F (<50).
Check if the student passed: all subjects must be >= 40 to pass.
Identify: highest scoring subject, lowest scoring subject.
Check for scholarship: percentage >= 85 AND passed all subjects → 'Eligible for Merit Scholarship'.
Print a full report card: subject-wise marks, total, percentage, grade, pass/fail, scholarship status.
Use a ternary operator for at least 2 of the above checks.

Hint: Use separate int variables for each subject. Track max/min using if comparisons.
Expected Output (sample):
Maths: 88  Science: 76  English: 92  History: 68  Java: 95
Total: 419  Percentage: 83.8%
Grade: A  Status: PASS
Scholarship: Not Eligible (below 85%)*/
public class ReportCard {

	public static void main(String[] args) {
	int math_m=88,science_m=76,english_m=92,history_m=68,java_m=95;
	double total = math_m+science_m+english_m+history_m+java_m;
	double percentage =total/5;
	String grade,status;
	
	//grade calculation
	if(percentage >+90) {
		grade="A+";
	}
	else if(percentage >=80) {
		grade="A";
	}
	else if(percentage >=70) {
		grade="B";
	}
	else if(percentage >=60) {
		grade="C";
	}
	else if(percentage >=50) {
		grade="D";
	}
	else {
		grade="F";
	}
	//status 
	status= (math_m>=40 && science_m>=40 && english_m>=40 && history_m>=40 &&java_m>=40) ?"PASS":"FAIL";
	 // Highest subject
    int highest = math_m;
    String highSub = "Maths";

    if (science_m > highest) {
    	highest = science_m; 
    	highSub = "Science"; 
    }
    if (english_m> highest) {
    	highest = english_m;
    	highSub = "English"; 
    }
    if (history_m> highest) {
    	highest = history_m;
    	highSub = "History";
    }
    if (java_m > highest) { 
    	highest = java_m; 
    	highSub = "Java Programming"; 
    }

    // Lowest subject
    int lowest = math_m;
    String lowSub = "Maths";

    if (science_m < lowest) { 
    	lowest = science_m;
    	lowSub = "Science"; 
    }
    if (english_m < lowest) { 
    	lowest = english_m; 
    	lowSub = "English"; 
    }
    if (history_m < lowest) { 
    	lowest = history_m; 
    	lowSub = "History"; 
    }
    if (java_m < lowest) { 
    	lowest = java_m; 
    	lowSub = "Java Programming"; 
    }
	
	System.out.println("Maths: "+math_m+"\tScience: "+science_m+"\tEnglish: "+english_m+"\tHistory: "+history_m+"\tJava: "+java_m);
	System.out.println("Total:"+total+"\tPercentage: "+percentage+"%");	
	System.out.println("Grade:"+grade+"\tStatus: "+status);
	System.out.println("Scholarship: "+(percentage >=85 && status.equals("PASS")?"Eligible for scholarship":"Not Eligible(below 85%)"));
	System.out.println("Highest Subject: "+highSub+"\tScore: "+highest);
	System.out.println("Lowest Subject: "+lowSub+"\tScore: "+lowest);
	}

}
