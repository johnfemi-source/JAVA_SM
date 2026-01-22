
import java.util.Random;
import java.util.Scanner;

public class TaskTWo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int number = random.nextInt(10) + 1;

        System.out.print("Guess a number between 1 and 10: ");
        int guess = input.nextInt();

        if (guess == number) {
            System.out.println("You're correct!");
        } else {
            System.out.println("You're wrong!");
            System.out.println("The correct number was: " + number);
        }

    }
}

