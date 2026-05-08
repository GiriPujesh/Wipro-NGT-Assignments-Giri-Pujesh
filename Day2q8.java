package ngt_training;

public class Day2q8 {

	public static void main(String[] args) {
        
        int choice;

        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = 4;

            switch (choice) {
                case 1:
                    System.out.println("Balance: ₹10,000");
                    break;
                case 2:
                    System.out.println("Deposit Successful");
                    break;
                case 3:
                    System.out.println("Withdrawal Successful");
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}

