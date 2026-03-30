package abstractClass;

public class Test {
	    public static void main(String[] args) {

	        /*This will give compile error
	         Payment p = new Payment();
	         Reason:Payment is an abstract class and cannot be instantiated.
	         It contains an abstract method (processPayment) which has no implementation.*/

	        Payment[] payments = new Payment[4];

	        payments[0] = new CashPayment(1000, "Ram");
	        payments[1] = new CardPayment(2500, "Siva", "1234567812345678", "ICICI");
	        payments[2] = new UPIPayment(1500, "Sarvesh", "sarvesh@upi");
	        payments[3] = new EMIPayment(12000, "Preeti", 6);

	        for (Payment p : payments) {
	            p.processPayment(); 
	            p.displayReceipt();
	        }
}
}
