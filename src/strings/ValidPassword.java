package strings;

import java.util.Scanner;
/*
1. A password must have at least eight characters.
2. A password consists of only letters and digits.
3. A password must contain at least two digits
Input a password : abcdefgh34
Password is valid
Input a password : abcde12334
Password is Invalid
 */
public class ValidPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();

       System.out.println((isValidPassword(password) ? "Valid " : "Invalid ") );
    }

    public static boolean isValidPassword(String password) {
        final int validPasswordLength = 8;	// Valid length of password
        final int noOfDigitsExpected = 2;	// Minimum digits it must contain

        boolean validPassword =
                isLengthValid(password, validPasswordLength) &&
                        isOnlyLettersAndDigits(password) &&
                        hasNDigits(password, noOfDigitsExpected);

        return validPassword;
    }

    public static boolean isLengthValid(String password, int validLength) {
        return password.length() >= validLength;
    }

    public static boolean isOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasNDigits(String password, int n) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
            }
            if (count >= n) {
                return true;
            }
        }
        return false;
    }
}
