import java.util.Random;
import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int number = random.nextInt(10) + 1;
        int guess;
        int attempts = 0;

        System.out.print("Guess a number between 1 and 10: ");

        do {
            guess = input.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!");
            }

            if (guess != number) {
                System.out.print("Try again: ");
            }

        } while (guess != number);

        System.out.println("You're correct!");
        System.out.println("Number of attempts: " + attempts);
    }
}

