
import java.util.Scanner;

public class FirstVowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String text = input.nextLine().toLowerCase(); 
        
        int position = -1;
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                position = i;
                break;
            }
        }
        
        if (position != -1) {
            System.out.println("First vowel found at position: " + position);
        } else {
            System.out.println("No vowels found.");
        }
        
    }
}

