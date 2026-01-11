import java.util.*;

public class NumberReverse {

    public static void main(String[] args) {
        int number = 12021;

        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = getDigitsArray(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        int[] reversed = reverseDigitsArray(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversed));

        boolean arraysEqual = areArraysEqual(digits, reversed);
        System.out.println("Are original and reversed arrays equal: " + arraysEqual);

        boolean isPalindrome = isPalindromeNumber(digits);
        System.out.println("Is Palindrome: " + isPalindrome);

        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuck);
    }

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] getDigitsArray(int number) {
        String str = String.valueOf(number);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static boolean isPalindromeNumber(int[] digits) {
        int[] reversed = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }
}
