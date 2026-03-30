package abstractClass;

public class EMIPayment extends Payment {
	    int months;

	    public EMIPayment(double amount, String payerName, int months) {
	        super(amount, payerName);
	        this.months = months;
	    }
	    
	    void processPayment() {
	        double emi = amount / months;
	        System.out.println("EMI Payment selected.");
	        System.out.println("Monthly installment: Rs." + emi + " for " + months + " months.");
	    }
}
