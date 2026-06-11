package ngt_training;

public class Day5q2 {
	 public static void main(String[] args) {
	        CreditCardPayment obj = new CreditCardPayment();
	        obj.processPayment(); 
	        obj.show();
	    }

}
class Payment {
    
    public final void processPayment() {
        System.out.println("Processing secure payment...");
    }
}

class CreditCardPayment extends Payment {
    

    public void show() {
        System.out.println("Credit Card Payment");
    }
}

