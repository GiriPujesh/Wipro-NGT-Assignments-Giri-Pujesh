package ngt_training;


import java.util.Scanner;

class InvalidPINException extends Exception {
 public InvalidPINException(String message) {
     super(message);
 }
}


class ATM {
 private final int correctPIN = 1234;

 public void insertCard() {
     System.out.println("Card inserted successfully.");
 }

 public void enterPIN(int pin) throws InvalidPINException {
     if (pin != correctPIN) {
         throw new InvalidPINException("Incorrect PIN! Access Denied.");
     } else {
         System.out.println("PIN verified successfully.");
     }
 }
}


public class ATMSystem {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     ATM atm = new ATM();

     try {
         
         atm.insertCard();
         System.out.print("Enter your PIN: ");
         int pin = sc.nextInt();
         atm.enterPIN(pin);
         System.out.println("Transaction Successful!");

     } catch (InvalidPINException e) {
         
         System.out.println("Exception: " + e.getMessage());

     } finally {
         
         System.out.println("Transaction logged (finally block executed).");
     }

     sc.close();
 }
}