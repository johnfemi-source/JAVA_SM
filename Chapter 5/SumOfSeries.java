import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {

        long sum = 0;

        System.out.println("n\tSum");

        for (int n = 1; n <= 100; n++) {
            sum += n;
            System.out.println(n + "\t" + sum);
        }
    }
}

