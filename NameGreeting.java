import java.util.Scanner;

public class NameGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        
        System.out.println("\nHello, " + firstName + " " + lastName + "!");
        
        scanner.close();
    }
}
