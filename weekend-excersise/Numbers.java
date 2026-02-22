
public class Numbers {
    public static void main(String[] args) {
        int number = 123456789;
        int reversed = 0;

        while (number != 0) {
            int lastDigit = number % 10; 
            reversed = reversed * 10 + lastDigit; 
            number = number / 10; 
        }
        System.out.println("" + reversed);
    }
}
