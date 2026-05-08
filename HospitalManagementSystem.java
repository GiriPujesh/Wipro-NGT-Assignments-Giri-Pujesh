package ngt_training;


import java.io.*;

public class HospitalManagementSystem {
    public static void main(String[] args) {

        try {
            // Saving patient records
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("patients.txt", true));

            bw.write("Patient ID:201");
            bw.newLine();

            bw.write("Patient Name:Ramesh");
            bw.newLine();

            bw.write("Disease:Fever");
            bw.newLine();

            bw.close();

            // Generating medical report
            PrintWriter report = new PrintWriter("medicalreport.txt");

            report.println("Medical Report");
            report.println("Patient:Ramesh");
            report.println("Diagnosis:Viral Fever");
            report.println("Prescription:Paracetamol");

            report.close();

            System.out.println("Patient Record & Medical Report Saved");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}