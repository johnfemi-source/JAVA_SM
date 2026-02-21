
public class ProductOfNumbers {
    public static void main(String[] args) {

        long product = 1;

        for (int index = 1; index <= 10; index++) {
            product *= index;
        }

        System.out.println("Product of first 10 natural numbers: " + product);
    }
}
