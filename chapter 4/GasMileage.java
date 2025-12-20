import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int milesDriven;
        int gallonsUsed;

        int totalMiles = 0;
        int totalGallons = 0;

        System.out.print("Enter miles driven (-1 to quit): ");
        milesDriven = input.nextInt();

        while (milesDriven != -1) {
            System.out.print("Enter gallons used: ");
            gallonsUsed = input.nextInt();

            // Calculate miles per gallon for this trip
            double milesPerGallon = (double) milesDriven / gallonsUsed;
            System.out.printf("Miles per gallon for this trip: %.2f%n",
                    milesPerGallon);

            // Update totals
            totalMiles += milesDriven;
            totalGallons += gallonsUsed;

            // Calculate combined miles per gallon
            double combinedMPG = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon: %.2f%n%n",
                    combinedMPG);

            // Prompt for next trip
            System.out.print("Enter miles driven (-1 to quit): ");
            milesDriven = input.nextInt();
        }

        System.out.println("Program terminated.");
        input.close();
    }
}

