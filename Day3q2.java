package ngt_training;

public class Day3q2 {

	public static void main(String[] args) {
		BankAccount acc=new BankAccount(0);
		acc.deposit(10000);
		acc.withdraw(5000);
		acc.getBalance();

	}

}
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;       
    }
}