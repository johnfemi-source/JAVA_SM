import java.util.Scanner;

public class CheckOutSystem2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0;
        double subtotal = 0;
        String choice;

        String[] productNames = new String[10];
        int[] quantities = new int[10];
        double[] prices = new double[10];
        double[] costs = new double[10];

        System.out.println("WELCOME TO SEMICOLON STORE");
        System.out.println("--------------------------");

        int productCount = 0;
       
        System.out.print("Enter cashier name: ");
        String cashierName = input.nextLine();

        System.out.print("Enter customer name: ");
        String customerName = input.nextLine();
        while (true) {
           
            System.out.print("Enter product name: ");
            productNames[productCount] = input.nextLine();

            System.out.print("Enter product price: ");
            prices[productCount] = input.nextDouble();

            System.out.print("Enter quantity purchased: ");
            quantities[productCount] = input.nextInt();
            input.nextLine();

            costs[productCount] = prices[productCount] * quantities[productCount];
            subtotal += costs[productCount];

            System.out.print("Add another product? (yes/no): ");
            choice = input.nextLine();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }

            productCount++;
        }

        double discount = 424.00;

        double vat = (subtotal - discount) * 0.075;

        double finalAmount = subtotal - discount + vat;

        System.out.println("\n======================================================");
        System.out.println("                  SEMICOLON STORES                   ");
        System.out.println("                  MAIN BRANCH                         ");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.println("======================================================");
        System.out.println("Cashier: Cashier's Name" + cashierName);
        System.out.println("Customer Name:" + customerName);
        System.out.println("======================================================");

        for (int i = 0; i <= productCount; i++) {
            System.out.printf("%-10s\t%-3d\t%.2f\t%.2f\n", productNames[i], quantities[i], prices[i], costs[i]);
        }

        System.out.println("------------------------------------------------------");
        System.out.printf("Sub Total:\t\t\t\t%.2f\n", subtotal);
        System.out.printf("Discount:\t\t\t\t-%.2f\n", discount);
        System.out.printf("VAT @ 7.5%%:\t\t\t\t%.2f\n", vat);
        System.out.println("------------------------------------------------------");
        System.out.printf("Bill Total:\t\t\t\t%.2f\n", finalAmount);
        System.out.println("======================================================");
        System.out.println("THIS IS NOT A RECEIPT KINDLY PAY " + finalAmount);
        System.out.println("======================================================");

    }
}

