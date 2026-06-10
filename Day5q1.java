package ngt_training;

public class Day5q1 {
	public static void main(String[] args) {
        Customer c1 = new Customer(1001, "Giri");
        c1.display();

        
    }
}
class Customer {
    private final int accNum;  
    private String name;

    
    public Customer(int accountNumber, String name) {
        this.accNum = accountNumber;
        this.name = name;
    }

    public void display() {
        System.out.println("Account Number: " + accNum);
        System.out.println("Name: " + name);
    }
}

