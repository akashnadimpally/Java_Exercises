import java.util.Scanner;

public class InBetween {
    public static void main(String []Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter a number greater than previous number: ");
        int b = sc.nextInt();
        for (int i=a; i<=b; i++){
            System.out.print(i+" ");
        }
    }
}
