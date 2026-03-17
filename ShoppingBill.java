/*Build a shopping bill calculator with these items (use final for prices): Rice 5kg (Rs.250), Oil 1L (Rs.180), Bread (Rs.45), Milk 2L (Rs.90), Eggs 12pc (Rs.84).
Calculate subtotal using arithmetic operators.
Apply 5% GST if subtotal > Rs.500, else 0% GST. Use the ternary operator for this.
Apply a 10% discount if subtotal > Rs.600 (after GST). Again use ternary.
Use compound assignment operators (+=, -=) to build the final total step by step.

Hint: Build the bill step-by-step: subtotal → add GST → subtract discount → final total.
Expected Output (sample):
Subtotal: Rs. 649.00
GST (5%): Rs. 32.45
Discount: Rs. 0.00
TOTAL: Rs. 681.45*/

public class ShoppingBill {

	public static void main(String[] args) {
		final int rice_5Kg=250;
		final int oil_1L=180;
		final int bread=45;
		final int milk_2L=90;
		final int eggs_12Pc=84;
		float gst,total=0,discount;
		float subTotal = rice_5Kg + oil_1L + bread + milk_2L + eggs_12Pc;
		total=subTotal;
		gst = (subTotal>500)? 0.05f * subTotal : 0;
		total+=gst;
		discount= (total>600)? 0.1f*total : 0;
		total -=discount;
		 System.out.println("Subtotal: Rs. " +subTotal);
		 System.out.println("GST: (5%) Rs."+gst);
		 System.out.println("Discount: (10%) Rs. "+discount);
		 System.out.println("TOTAL: Rs." +total);
		}

}
