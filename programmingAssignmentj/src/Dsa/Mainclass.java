package Dsa;

public class Mainclass {
	public static void main(String[] args) {
		RedBus rb =new RedBus(5);
		
		rb.booking(0,"maran");
		rb.booking(7, "karan");
		rb.booking(1,"sam");
		rb.booking(2, "sharat");
		rb.booking(3,"somi");
		rb.booking(4, "ramu");
		
		
		rb.displayData();
		
		rb.checking("sam");
		rb.checking("maran");
		rb.checking("william");
		
		rb.cancellation(0);
		rb.cancellation(3);
		rb.cancellation(4);
		
		
		rb.displayData();
	}
}
