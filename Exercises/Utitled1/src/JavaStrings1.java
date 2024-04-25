import java.util.Scanner;

public class JavaStrings1 {

    public static String toTitleCase(String input) {
        StringBuilder titleCase = new StringBuilder();
        boolean nextTitleCase = true;

        for (char c : input.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            } else {
                c = Character.toLowerCase(c);
            }
            titleCase.append(c);
        }

        return titleCase.toString();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);

        String line1 = sc.nextLine();
        String line2 = sc.nextLine();

        String line = line1+line2;

        System.out.println(line.length());

        if (line1.compareTo(line2) < 0) {
            System.out.println("No");
        } else if (line1.compareTo(line2) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String res = toTitleCase(line1)+" "+toTitleCase(line2);

        System.out.println(res);


    }
}
