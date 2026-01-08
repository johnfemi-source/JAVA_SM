import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a plain text: ");
        String text = input.nextLine();

        System.out.print("Enter a shift: ");
        int shift = input.nextInt();

        shift = shift % 26;
        String result = "";

        for (int counter = 0; counter < text.length(); counter++) {

            char letter = text.charAt(counter);

 
            if (letter >= 'A' && letter <= 'Z') {

                int position = letter - 'A';
                int newPosition = (position + shift) % 26;
                char newChar = (char) (newPosition + 'A');

                result += newChar;

            }
 
            else if (letter >= 'a' && letter <= 'z') {

                int position = letter - 'a';
                int newPosition = (position + shift) % 26;
                char newChar = (char) (newPosition + 'a');

                result += newChar;

            }
           
            else {
                result += letter;
            }
        }

        System.out.println("The encrypted text is: " + result);
        input.close();
    }
}
