
import java.util.Random;
import java.util.Scanner;

public class TaskFour{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int number = random.nextInt(10) + 1;
        int guess;

        System.out.print("Guess a number between 1 and 10: ");
        guess = input.nextInt();

        while (guess != number) {
            if (guess > number) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }

            System.out.print("Try again: ");
            guess = input.nextInt();
        }

        System.out.println("You're correct!");
    }
}

