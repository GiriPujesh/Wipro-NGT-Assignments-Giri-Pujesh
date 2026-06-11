package ngt_training;

public class Day2q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amt = 4000;
		int mbalance =10000;
		int balance = mbalance-amt;
		int Crtpin=12346;
		int pin=12346;
		
		if(pin==Crtpin) {
			if(amt<=mbalance) {
				System.out.println("Transaction Sucessful!,Available balance ="+balance);
			}
			else {
				System.out.println("Insuffient Balance");
			}
			
			
		}
		else {
			System.out.println("Incorrect Pin");
		}
		

	}

}
