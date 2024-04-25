//Write an application that prompts the user for a String that contains at least
// five letters and at least five digits.
// Continuously reprompt the user until a valid String is entered.
// Display a message indicating whether the user was successful or did not enter enough digits,
// letters, or both. Save the file as FiveLettersAndFiveDigits.java.

import java.util.Scanner;

public class FiveLettersAndFiveDigits {

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        String inputString;

        do {
            inputString = stringInput(sc);
            if (!isValidString(inputString)) {
                System.out.println("Please enter a correct string!");
            }
        } while (!isValidString(inputString));

        System.out.println("You entered a valid string!");
        sc.close();
    }

    public static boolean isValidString(String s) {
        int letterCount = 0;
        int digitCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                letterCount++;
            }
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        return letterCount >= 5 && digitCount >= 5;
    }

    public static String stringInput(Scanner sc) {
        System.out.println("Enter a string: ");
        return sc.nextLine();
    }
}
