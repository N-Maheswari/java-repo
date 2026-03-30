package abstractClass;

class CashPayment extends Payment {

	    public CashPayment(double amount, String payerName) {
	        super(amount, payerName);
	    }

	    void processPayment() {
	        System.out.println("Cash payment of Rs." + amount + " received.");
	    }
}
