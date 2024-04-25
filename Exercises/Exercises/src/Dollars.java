import java.util.Scanner;

public class Dollars {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in Dollars: ");
        float dollars = sc.nextFloat();
        int cents = (int) (dollars * 100);
        int fives = (int) (dollars * 50);
        int tens = (int) (dollars * 10);
        int twenties = (int) (dollars * 20);

        System.out.println(cents+" "+fives+" "+tens+" "+twenties);
    }
}
