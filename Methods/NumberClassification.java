public class NumberClassification {

    public static int getSumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }

    public static boolean isPerfect(int num) {
        return getSumOfProperDivisors(num) == num;
    }

    public static boolean isAbundant(int num) {
        return getSumOfProperDivisors(num) > num;
    }

    public static boolean isDeficient(int num) {
        return getSumOfProperDivisors(num) < num;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    public static boolean isStrong(int num) {
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int num = 145;

        System.out.println("Number: " + num);
        System.out.println("Perfect Number: " + isPerfect(num));
        System.out.println("Abundant Number: " + isAbundant(num));
        System.out.println("Deficient Number: " + isDeficient(num));
        System.out.println("Strong Number: " + isStrong(num));
    }
}
