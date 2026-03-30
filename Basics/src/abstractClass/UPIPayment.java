package abstractClass;

public class UPIPayment extends Payment {
	    String upiId;

	    public UPIPayment(double amount, String payerName, String upiId) {
	        super(amount, payerName);
	        this.upiId = upiId;
	    }

	    void processPayment() {
	        System.out.println("Processing UPI payment...");
	        System.out.println("UPI ID: " + upiId);
	        System.out.println("Success");
	    }
}
