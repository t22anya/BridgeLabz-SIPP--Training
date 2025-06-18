import java.util.Scanner;

public class FactorAnalysis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }

        int[] factors = findFactors(number);

        System.out.print("Factors of " + number + ": ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        int sum = sumOfFactors(factors);
        long product = productOfFactors(factors);
        int sumSquares = sumOfSquaresOfFactors(factors);

        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumSquares);
    }
    public static int[] findFactors(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }
    public static int sumOfSquaresOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += Math.pow(f, 2); 
        }
        return sum;
    }
}
