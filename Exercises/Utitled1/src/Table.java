import java.util.Scanner;

public class Table {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get the multiplication table upto 10 multiples: ");
        int n = sc.nextInt();

        System.out.println("Hello World");

        for (int i=0;i<=10;i++) {
            System.out.println(n+" * "+i+" = "+(n*i));
        }

    }


}
