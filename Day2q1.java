package ngt_training;

public class Day2q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        double bill=5500;
        double dis = 0;

        if (bill >= 10000) {
            dis = 0.40;
        } 
        else if (bill >= 7500) {
            dis = 0.30;
        } 
        else if (bill >= 5000) {
            dis= 0.20;
        }
        else if (bill >= 2500 ) {
        	dis= 0.10;
        }

        double total = bill - (bill * dis);

        System.out.println("Discount Applied: " + (dis * 100) + "%");
        System.out.println("Total bill: " + total);

	}

}
