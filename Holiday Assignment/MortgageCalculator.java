import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      
        System.out.print("Enter the loan principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the annual interest rate (%): ");
        double annualRate = input.nextDouble();

        
        System.out.print("Enter the loan duration (years): ");
        int years = input.nextInt();

       
        double monthlyRate = annualRate / 100 / 12;


        int numberOfPayments = years * 12;

        double monthlyPayment = principal *
                (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) /
                (Math.pow(1 + monthlyRate, numberOfPayments) - 1);

        
        System.out.println("\nMortgage Calculation Result");
        System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);

     
    }
}

