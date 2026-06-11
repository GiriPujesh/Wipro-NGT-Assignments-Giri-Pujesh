package ngt_training;

public class Day2q7 {
	  public static void main(String[] args) {
	       

	        String correctPassword = "admin123";
	        int att = 3;

	        while (att > 0) {
	            System.out.print("Enter password: ");
	            String input = "admin123";

	            if (input.equals(correctPassword)) {
	                System.out.println("Access Granted!");
	                return;
	            } else {
	                att--;
	                System.out.println("Wrong password. Attempts left: " + att);
	            }
	        }

	        System.out.println("Access Denied!");
	    }
	}
