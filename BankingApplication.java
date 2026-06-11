package ngt_training;


import java.io.*;

public class BankingApplication {
    public static void main(String[] args) {

        try {
            // Writing transaction history
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("transactions.txt", true));

            bw.write("Account No:1001 Deposit:5000");
            bw.newLine();

            bw.write("Account No:1001 Withdraw:2000");
            bw.newLine();

            bw.close();

            System.out.println("Transactions Saved Successfully");

            // Reading transaction history
            BufferedReader br = new BufferedReader(
                    new FileReader("transactions.txt"));

            String line;

            System.out.println("\nTransaction History:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}