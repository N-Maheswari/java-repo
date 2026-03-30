/*
 * Part 8: Abstract Classes — Payment Processing
Payment (Abstract Superclass): Include amount (double) and payerName (String).
Create an abstract method: processPayment().
Create a concrete method: displayReceipt() that prints the payer, amount, and payment status.
CashPayment (Subclass): Override processPayment() to print "Cash payment of Rs.[amount] received."
CardPayment (Subclass): Add cardNumber (store/show only the last 4 digits) and bankName. Override processPayment().
UPIPayment (Subclass): Add upiId. Override processPayment() to simulate processing (print "Processing..." followed by "Success").
EMIPayment (Subclass): Add months (int). Override processPayment() to calculate and print the monthly installment amount.
Testing (in main): * Create a Payment[] array containing one of each concrete payment type. Loop through, calling processPayment() and displayReceipt() for each.
Question: Try typing Payment p = new Payment(); in your code. It will give a compile error. Add a comment in your code explaining exactly why this error occurs.
*/
package abstractClass;

abstract class Payment {
	    double amount;
	    String payerName;

	    public Payment(double amount, String payerName) {
	        this.amount = amount;
	        this.payerName = payerName;
	    }

	    abstract void processPayment();

	    public void displayReceipt() {
	        System.out.println("Payer: " + payerName);
	        System.out.println("Amount: Rs." + amount);
	        System.out.println("Payment completed successfully.");
	        System.out.println("---------------------------");
	    }
}
