import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int count = input.nextInt();

        if (count <= 0) {
            System.out.println("You must enter at least one number.");
        } else {
            System.out.print("Enter number 1: ");
            int number = input.nextInt();

            int min = number;
            int max = number;

            for (int i = 2; i <= count; i++) {
                System.out.print("Enter number " + i + ": ");
                number = input.nextInt();

                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }
            }

            int sum = min + max;

            System.out.println("Minimum value: " + min);
            System.out.println("Maximum value: " + max);
            System.out.println("Sum of extremes: " + sum);
        }

        input.close();
    }
}

