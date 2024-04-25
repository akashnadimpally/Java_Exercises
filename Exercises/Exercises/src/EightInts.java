//Write an application that can hold eight integers in an array.
// Display the integers from first to last, and then display the integers from last to first.

import java.util.Scanner;

public class EightInts {
    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int size = sc.nextInt();
        int[] num = new int[size];

        System.out.println("Enter the numbers: ");

        for (int i=0;i<size;i++) {
            num[i] = sc.nextInt();
        }

        for (int i=0;i<size;i++) {
            System.out.println("Element "+i+" : "+num[i]);
        }
    }
}
