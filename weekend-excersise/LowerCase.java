
import java.util.Scanner;

public class LowerCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String text = input.nextLine();
        
        int count = 0;
        for (int index = 0; index < text.length(); index++) {
            char ch = text.charAt(i);
            if (Character.isLowerCase(ch)) {
                count++;
            }
        }      
        System.out.println("Number of lowercase letters: " + count);
    }
}

