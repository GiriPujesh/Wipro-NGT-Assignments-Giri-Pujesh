package ngt_training;

public class Day3q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee("Giri" , 100000);
		emp.setSalary(0);

	}

}
class Employee {
    private String name;
    private double salary; 

    public Employee(String name, double salary) {
        this.setName(name);
        this.salary = salary;
    }

    // Getter
    public double getSalary() {
        return salary;
    }

    // Setter with validation
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("salary" +salary);
        } else {
            System.out.println("Invalid salary!");
        }
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}