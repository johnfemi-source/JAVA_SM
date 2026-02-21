import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = input.nextInt();

        int[][] scores = new int[students][subjects];
        int[] total = new int[students];
        double[] average = new double[students];
        int[] position = new int[students];

        for (int index = 0; index < students; index++) {
            System.out.println("\nStudent " + (index + 1));

            for (int number = 0; number < subjects; number++) {

                int score = -1; 
                
                while (score < 0 || score > 100) {
                    System.out.print("Enter score for Subject " + (number + 1) + ": ");
                    score = input.nextInt();

                    if (score < 0 || score > 100) {
                        System.out.println("Score must be between 0 and 100.");
                    }
                }

                scores[index][index] = score;
                total[index] += score;
            }

            average[index] = (double) total[index] / subjects;
        }

        for (int index = 0; index < students; index++) {
            position[index] = 1;

            for (int number = 0; number < students; number++) {
                if (total[number] > total[index]) {
                    position[index]++;
                }
            }
        }

        System.out.println("\n==========================================");
        System.out.println("STUDENT\tSUB1\tSUB2\tSUB3\tSUB4\tTOT\tAVE\tPOS");
        System.out.println("---------------------------------------------------------------");

        for (int index = 0; index < students; index++) {
            System.out.print("Student " + (index + 1) + "\t");

            for (int number = 0; number < subjects; number++) {
                System.out.print(scores[index][number] + "\t");
            }

            System.out.printf("%d\t%.2f\t%d\n", total[index], average[index], position[index]);
            System.out.println("--------------------------------------------------------------");
        }

    }
}

