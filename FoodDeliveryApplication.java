package ngt_training;


import java.io.*;

public class FoodDeliveryApplication {
    public static void main(String[] args) {

        try {
            // Saving restaurant menu
            FileWriter menu = new FileWriter("menu.txt");

            menu.write("1. Pizza - 250\n");
            menu.write("2. Burger - 120\n");
            menu.write("3. Biryani - 300\n");

            menu.close();

            // Saving delivery log
            BufferedWriter log = new BufferedWriter(
                    new FileWriter("deliverylog.txt", true));

            log.write("Order 5001 Delivered Successfully");
            log.newLine();

            log.close();

            System.out.println("Menu & Delivery Logs Saved");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}