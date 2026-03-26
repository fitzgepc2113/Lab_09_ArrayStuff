import java.util.Random;
import java.util.Scanner;

/* Patrick Fitzgerald*/

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        final int LENGTH = 100;
        int finalSum = 0;
        int finalAve = 0;
        int totalCount = 0;
        int dataPoints[] = new int[100];

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = i + 1;

            System.out.printf(dataPoints[i] + " ");
        }

        System.out.println("");

       for ( int j = 0; j < dataPoints.length; j++) {
            dataPoints[j] = random.nextInt(1,101);
        }


        for (int dataPoint : dataPoints) {
            System.out.printf(dataPoint + " ");
        }

        System.out.println("");

        for (int dataPoint : dataPoints) {
            System.out.printf(dataPoint + " | ");
        }

        System.out.println("");

        for (int dataPoint : dataPoints) {

            finalSum += dataPoint;

        }

        finalAve = finalSum / dataPoints.length;

        System.out.println("The sum of the random array dataPoints is: " + finalSum);
        System.out.println("The average of the random array dataPoints is: " + finalAve);

        System.out.println("");

        Scanner in = new Scanner(System.in);

        int rangeNum = SafeInput.getRangedInt(in, "Input a value: ", 1,100);
        System.out.println("\nThe value you entered is: " + rangeNum);


        boolean found = false;
        for (int dataPoint = 0; dataPoint < dataPoints.length; dataPoint++) {
            if (dataPoints[dataPoint] == rangeNum) {
                found = true;
                System.out.println("Found a value matching " + rangeNum + " found at " + dataPoint);
                totalCount = totalCount + 1;
            }
        }
        if (!found) {
            System.out.println("Target " + rangeNum + " not found");

        }

        System.out.println("Your input value " + rangeNum + " was found " + totalCount + " time(s) in the random array.");



        boolean found2 = false;
        for (int dataPoint = 0; dataPoint < dataPoints.length; dataPoint++) {
            if (dataPoints[dataPoint] == rangeNum) {
                found2 = true;
                System.out.println("The First value matching " + rangeNum + " found at " + dataPoint);
                break;
            }
        }
        if (!found2) {
            System.out.println("Value " + rangeNum + " not found");
        }

int max = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;

        for (int dataPoint = 0; dataPoint < dataPoints.length; dataPoint++) {

            if (dataPoints[dataPoint] > max) {
                max = dataPoints[dataPoint];
            }
            if (dataPoints[dataPoint] < min) {
                min = dataPoints[dataPoint];
            }


        }

        System.out.println("The minimum value is " + min);

        System.out.println("");

        System.out.println("The maximum value is " + max);

        System.out.println("");

       System.out.println("Average of the dataPoints is: " + getAverage(dataPoints));

        System.out.println("");

    }

    public static double getAverage(int[] dataPoints) {
        int theSum = 0;

        for (int dataPoint : dataPoints) {

            theSum += dataPoint;

        }

        return (double) theSum / dataPoints.length;
    }

}
