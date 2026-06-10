package ngt_training;


import java.io.*;

public class ECommerceApplication {
    public static void main(String[] args) {

        try {
            // Saving order details
            PrintWriter pw = new PrintWriter(
                    new FileWriter("orders.txt", true));

            pw.println("Order ID:101");
            pw.println("Product:Laptop");
            pw.println("Price:55000");
            pw.println("Customer:Rahul");
            pw.println("----------------------");

            pw.close();

            // Generating invoice
            FileWriter invoice = new FileWriter("invoice101.txt");

            invoice.write("Invoice ID:101\n");
            invoice.write("Product:Laptop\n");
            invoice.write("Amount:55000\n");

            invoice.close();

            System.out.println("Order & Invoice Saved Successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}