import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base length of the triangle (1–10): ");
        int base = input.nextInt();

        if (base < 1 || base > 10) {
            System.out.println("Base length must be between 1 and 10.");
        } else {
            for (int row = 1; row <= base; row++) {
                for (int star = 1; star <= row; star++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        
    }
}

