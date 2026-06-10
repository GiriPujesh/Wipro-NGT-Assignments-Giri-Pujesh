package ngt_training;

public class Day2q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=25;
		
		if(marks >=90) {
			System.out.println("A Grade");
		}
		else if(marks >= 80){
			System.out.println("B Grade");
		}
		else if(marks >= 70) {
			System.out.println("C Grade");
			
		}
		else if(marks >= 50) {
			System.out.println("D Grade");
			
		}
		else if(marks >=35) {
			System.out.println("E Grade");
		}
		else {
			System.out.println("Fail "+ marks);
		}
		

	}

}
