package ngt_training;

public class Day2q2 {
 
	public static void main(String []args) {
		String CrtUser= "Giri" ;
		String Crtpassword ="123456";
		String User="Giri";
		String Password="123456";
		
		if(User==CrtUser) {
			if (Password==Crtpassword) {
				System.out.print("user verifed,Login sucessful!");
			}
			else {
				System.out.println("Login FAiled!,wrong password");
			}
		}
		else {
			System.out.println("User Name entered is wrong ");
		}
	}
}
