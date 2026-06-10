package ngt_training;

//Order Processing Thread
class OrderThread extends Thread {
 public void run() {
     try {
         System.out.println(getName() + " started...");
         Thread.sleep(2000);
         System.out.println(getName() + " completed.");
     } catch (InterruptedException e) {
         System.out.println(getName() + " interrupted.");
     }
 }
}

//Payment Processing Thread
class PaymentThread extends Thread {
 public void run() {
     try {
         System.out.println(getName() + " started...");
         Thread.sleep(1500);
         System.out.println(getName() + " completed.");
     } catch (InterruptedException e) {
         System.out.println(getName() + " interrupted.");
     }
 }
}

//Notification Thread
class NotificationThread extends Thread {
 public void run() {
     try {
         System.out.println(getName() + " started...");
         Thread.sleep(1000);
         System.out.println(getName() + " completed.");
     } catch (InterruptedException e) {
         System.out.println(getName() + " interrupted.");
     }
 }
}

//Main Class
public class FoodDelivery {
 public static void main(String[] args) {

     // Create Threads
     OrderThread t1 = new OrderThread();
     PaymentThread t2 = new PaymentThread();
     NotificationThread t3 = new NotificationThread();

     // setName()
     t1.setName("Order Processing Thread");
     t2.setName("Payment Processing Thread");
     t3.setName("Notification Thread");

     // setPriority()
     t1.setPriority(Thread.MIN_PRIORITY);
     t2.setPriority(Thread.NORM_PRIORITY);
     t3.setPriority(Thread.MAX_PRIORITY);

     // start()
     t1.start();

     try {
         // join()
         t1.join();

         t2.start();
         t2.join();

         t3.start();
         t3.join();

     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted.");
     }

    
     System.out.println("All tasks finished.");
 }
}