package ngt_training;


import java.util.*;


class Patient {
 int id;
 String name;

 public Patient(int id, String name) {
     this.id = id;
     this.name = name;
 }

 public String toString() {
     return "ID: " + id + ", Name: " + name;
 }
}


class HospitalSystem {

 private Set<Integer> patientIds = new HashSet<>();
 private List<Patient> patientList = new ArrayList<>();

 
 public void registerPatient(int id, String name) {
     
     if (patientIds.contains(id)) {
         
         System.out.println("Patient with ID " + id + " is already registered!,Use a new Id");
         return;
     }

     
     Patient patient = new Patient(id, name);
     patientIds.add(id);
     patientList.add(patient);

     
     System.out.println("Patient added successfully: " + patient);
 }

 
 public void viewPatients() {
     System.out.println("\nList of Registered Patients:");
     for (Patient p : patientList) {
         System.out.println(p);
     }
 }
}

public class MainHS {
 public static void main(String[] args) {
     HospitalSystem system = new HospitalSystem();


     system.registerPatient(101, "John");
     system.registerPatient(102, "Alice");
     system.registerPatient(101, "Bob"); 

     system.viewPatients();
 }
}