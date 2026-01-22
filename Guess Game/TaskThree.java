
import java.util.Random;
import java.util.Scanner;

public class TaskThree{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int number = random.nextInt(10) + 1;

        System.out.print("Guess a number between 1 and 10: ");
        int guess = input.nextInt();

        if (guess == number) {
            System.out.println("You're correct!");
        } else if (guess > number) {
            System.out.println("Too high!");
        } else {
            System.out.println("Too low!");
        }

        System.out.println("The correct number was: " + number);
    }
}

