public class Numberopeartions{

    public static int getDigitCount(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigitsArray(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = Character.getNumericValue(str.charAt(i));
        }
        return digits;
    }

    public static int getSumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int getSumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += (int) Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) {
        int sum = getSumOfDigits(digits);
        return num % sum == 0;
    }

    public static int[][] getDigitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }

    public static void main(String[] args) {
        int num = 378;
        int[] digits = getDigitsArray(num);

        System.out.println("Number: " + num);
        System.out.println("Digit Count: " + getDigitCount(num));
        System.out.println("Sum of Digits: " + getSumOfDigits(digits));
        System.out.println("Sum of Squares: " + getSumOfSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshad(num, digits));
        System.out.println("Digit Frequency:");
        int[][] freq = getDigitFrequency(digits);
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) System.out.println(freq[i][0] + " → " + freq[i][1]);
        }
    }
}
