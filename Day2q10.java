package ngt_training;

public class Day2q10 {
	public static void main(String[] args) {
        
        double total = 0;
        while (true) {
            double price = 1000;
            if (price == 0) {
                break;
            }

            total += price;
        }

        System.out.println("Total amount: ₹" + total);
    }

}
