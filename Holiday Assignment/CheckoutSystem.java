import java.util.Scanner;

public class CheckoutSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0;
        String choice;

        String[] productNames = new String[10];
        int[] quantities = new int[10];
        double[] prices = new double[10];
        double[] costs = new double[10];


        System.out.println("WELCOME TO SEMICOLON STORE");
        System.out.println("--------------------------");

        while (true) {
            System.out.print("Enter product name: ");
            String productName = input.nextLine();

            System.out.print("Enter product price: ");
            double price = input.nextDouble();

            System.out.print("Enter quantity purchased: ");
            int quantity = input.nextInt();
            input.nextLine();

            double cost = price * quantity;
            total += cost;  
     
            System.out.print("Add another product? (yes/no): ");
            choice = input.nextLine();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }
  


        double discount = 0;
        if (total >= 10000) {
            discount = total * 0.10; 
            

        }

        double vat = (total - discount) * 0.075;

        double finalAmount = total - discount + vat;

        System.out.println("\n================== CUSTOMER INVOICE ==============");
        System.out.println("Semicolon store");
        System.out.println("Main Branch");
        System.out.println("Location: 312 Herbert Macaulay Way, Sabo Yaba,Lagos");
        System.out.println("===========================================");
  
        System.out.printf("Total Amount: ₦%.2f%n", total);
        System.out.printf("Discount: ₦%.2f%n", discount);
        System.out.printf("VAT (7.5%%): ₦%.2f%n", vat);
        System.out.printf("Amount to Pay: ₦%.2f%n", finalAmount);
        System.out.println("========================================");

       
    System.out.println("");


          System.out.println("==============RECEIPT=============== ");
          System.out.printf("Total Amount: ₦%.2f%n", total);
          System.out.printf("VAT (7.5%%): ₦%.2f%n", vat);
          System.out.printf("Amount to Pay: ₦%.2f%n", finalAmount);
          System.out.println("=============================");
        
    


       

}


}





