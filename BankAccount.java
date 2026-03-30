/*Part 3: Object-Oriented Basics — Bank Account
Design a banking system with the following specifications:
Create a BankAccount class with the following fields: accountNumber (String), holderName (String), balance (double), and accountType (String: Savings/Current).
Add a transactionCount field (int) that increments every time a deposit, withdrawal, or transfer occurs.
Constructor: Must be parameterized to accept all fields. Validation: The initial balance cannot be negative.
Methods:
deposit(double amt)
withdraw(double amt) — Validation: Prevent overdrafts (cannot withdraw more than the balance).
transfer(BankAccount target, double amt)
displayStatement()
Testing (in main): Create 2 accounts. Perform a series of at least 5 transactions between them. Print the final statements for both accounts.
*/
package library;

public class BankAccount {
	String accountNumber;
	String holderName;
	double balance;
	String accountType;
	int transactionCount;
	
	public BankAccount(String accNo,String name, double bal,String accType){
	accountNumber =accNo;
	holderName=name;
	accountType=accType;
	if(bal<0) {
		 System.out.println("Initial balance cannot be negative. Setting balance to 0.");
	}
	else {
		balance=bal;
	}
	transactionCount=0;

	}
	
	public void deposit(double amt) {
		if(amt>0) {
			balance+=amt;
			transactionCount++;
			System.out.println("Deposited: " + amt);
		} 
		else {
            System.out.println("Invalid deposit amount");
        }
		 
	}
	public void withdraw(double amt){
		 if(amt<=0){
			 System.out.println("Invalid withdrawl amount");
		 } 
		 else if(amt >balance){
			 System.out.println("Balance is less");
		 }
		 else 
			balance-=amt;
		 transactionCount++;
		 System.out.println("Withdrawn: "+ amt);
		 
		 }
	void transfer(BankAccount target, double amt){
		 if (amt <= 0) {
	         System.out.println("Invalid transfer amount.");
	     } 
		 else if (amt > balance) {
			 System.out.println("Insufficient balance. Transfer failed.");
	     } 
		 else {
	            balance -= amt;
	            target.balance += amt;
	            transactionCount++;
	            target.transactionCount++;
	            System.out.println("Transferred " + amt + " to " + target.holderName);
	        }
		
		
	}
	
	void displayStatement() {
		System.out.println("\n--- Account Statement ---");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : " + balance);
        System.out.println("Transactions   : " + transactionCount);
	}
	

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("Icc101", "Ram", 1000, "Savings");
        BankAccount acc2 = new BankAccount("Icc102", "Siva", 500, "Current");
        
        acc1.deposit(500);          
        acc1.withdraw(200);         
        acc1.transfer(acc2, 200);   
        acc2.deposit(1000);          
        acc2.withdraw(250);      
        
        acc1.displayStatement();
        acc2.displayStatement();
	}

}
