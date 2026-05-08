package ngt_training;


import java.io.*;

class Employee implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        try {
            Employee emp = new Employee(1, "Kiran", 50000);

            // Serialization
            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream("employee.dat"));

            oos.writeObject(emp);

            oos.close();

            System.out.println("Employee Object Serialized");

            // Deserialization
            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream("employee.dat"));

            Employee e = (Employee) ois.readObject();

            System.out.println("\nEmployee Details:");
            System.out.println("ID: " + e.id);
            System.out.println("Name: " + e.name);
            System.out.println("Salary: " + e.salary);

            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}