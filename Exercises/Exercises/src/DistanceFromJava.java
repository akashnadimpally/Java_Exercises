//Allow a user to enter any number of double values up to 10. The user should enter 99999 to quit entering numbers.
//Display an error message if the user quits without entering any numbers;
//otherwise, display each entered value and its distance from the average. Save the file as DistanceFromAverage.java.

import java.util.Scanner;

public class DistanceFromJava {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;
        double[] a = new double[size];

        System.out.println("Enter double values up to 10 or 99999 to exit: ");

        int count = 0;
        int i =0;
        while(count < 10) {
            double input = sc.nextDouble();
            if (input == 99999) {
                break;
            }
            a[i] = input;
            i++;
            count++;
        }

        double sum = 0;
        for(i=0;i<10;i++) {
            System.out.print(a[i]+" ");
            sum+=a[i];
        }

        double avg = sum/10;

        System.out.println("Averge of the Array: "+avg);

        double[] b = new double[size];

        for (i=0;i<10;i++) {
            double distance = avg - a[i];
            b[i] = distance;
        }

        System.out.println("Distance from the average: ");

        for(i=0;i<10;i++) {
            System.out.print(b[i]+" ");
        }

    }
}
