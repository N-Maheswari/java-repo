package abstractClass;

public class CardPayment extends Payment {
	    String cardNumber;
	    String bankName;

	    public CardPayment(double amount, String payerName, String cardNumber, String bankName) {
	        super(amount, payerName);
	        this.cardNumber = cardNumber;
	        this.bankName = bankName;
	    }

	    void processPayment() {
	        String last4 = cardNumber.substring(cardNumber.length() - 4);
	        System.out.println("Card payment of Rs." + amount +  " processed using " + bankName +
	                " card ending with " + last4);
	    }
}
