import java.util.Scanner;

public class NumberStats{

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++)
            if (digits[i] == 0)
                return true;
        return false;
    }

    public static boolean isArmstrongNumber(int num, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int d : digits)
            sum += Math.pow(d, power);
        return sum == num;
    }

    public static int[] findTwoLargest(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2 && d != max1)
                max2 = d;
        }
        return new int[]{max1, max2};
    }

    public static int[] findTwoSmallest(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min1) {
                min2 = min1;
                min1 = d;
            } else if (d < min2 && d != min1)
                min2 = d;
        }
        return new int[]{min1, min2};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = countDigits(num);
        int[] digits = getDigits(num);
        boolean duck = isDuckNumber(digits);
        boolean armstrong = isArmstrongNumber(num, digits);
        int[] largestTwo = findTwoLargest(digits);
        int[] smallestTwo = findTwoSmallest(digits);

        System.out.println("Digit Count: " + count);
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println("\nDuck Number: " + duck);
        System.out.println("Armstrong Number: " + armstrong);
        System.out.println("Largest: " + largestTwo[0] + ", Second Largest: " + largestTwo[1]);
        System.out.println("Smallest: " + smallestTwo[0] + ", Second Smallest: " + smallestTwo[1]);
        sc.close();
    }
}
