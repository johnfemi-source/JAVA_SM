import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many students do you have? ");
        int numberOfStudents = input.nextInt();

        System.out.print("How many subjects do they do? ");
        int numberOfSubjects = input.nextInt();

        int[][] scores = new int[numberOfStudents][numberOfSubjects];

 
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < numberOfSubjects; j++) {

                while (true) {
                    System.out.print("Enter score for Subject " + (j + 1) + ": ");
                    int score = input.nextInt();

                    if (score >= 0 && score <= 100) {
                        scores[i][j] = score;
                        break;
                    } else {
                        System.out.println("Score must be between 0 and 100. Try again.");
                    }
                }
            }
        }

        System.out.println("\nCLASS SUMMARY ");

        int classTotal = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            int studentTotal = 0;

            for (int j = 0; j < numberOfSubjects; j++) {
                studentTotal += scores[i][j];
            }

            double studentAverage = (double) studentTotal / numberOfSubjects;
            classTotal += studentTotal;

            System.out.println("Student " + (i + 1) + " Total Score: " + studentTotal);
            System.out.println("Student " + (i + 1) + " Average Score: " + studentAverage);
            System.out.println();
        }

        double classAverage = (double) classTotal / (numberOfStudents * numberOfSubjects);
        System.out.println("Class Average Score: " + classAverage);

    }
}

