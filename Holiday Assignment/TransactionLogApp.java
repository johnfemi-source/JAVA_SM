import java.util.ArrayList;
import java.util.Scanner;

public class TransactionLogApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Double> transactions = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.println("4. History");
            System.out.print("Choose: ");

            int choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Amount: ");
                double amount = input.nextDouble();
                transactions.add(amount);
                System.out.println("Balance: " + getBalance(transactions));
            }

            else if (choice == 2) {
                System.out.print("Amount: ");
                double amount = input.nextDouble();

                if (amount <= getBalance(transactions)) {
                    transactions.add(-amount);
                } else {
                    System.out.println("No money");
                }

                System.out.println("Balance: " + getBalance(transactions));
            }

            else if (choice == 4) {
                if (transactions.isEmpty()) {
                    System.out.println("No transactions yet.");
                } else {
                    System.out.println("\nTransaction History:");
                    for (int i = 0; i < transactions.size(); i++) {
                        double t = transactions.get(i);
                        if (t > 0) {
                            System.out.println((i + 1) + ". Deposit: " + t);
                        } else {
                            System.out.println((i + 1) + ". Withdraw: " + (-t));
                        }
                    }
                }
            }

            else if (choice == 3) {
                System.out.println("Final Balance: " + getBalance(transactions));
                break;
            }
        }
    }

    public static double getBalance(ArrayList<Double> transactions) {
        double balance = 0;
        for (double t : transactions) {
            balance += t;
        }
        return balance;
    }
}

