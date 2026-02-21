
public class DivisibleBySeven {
    public static void main(String[] args) {
        int count = 0;

        for (int index = 1; index <= 100; index++) {
            if (i % 7 == 0) {
                count++;
            }
        }

        System.out.println("Numbers between 1 and 100 divisible by 7: " + count);
    }
}
