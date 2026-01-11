public class FactorAnalyzer {

    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int getGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int i = 1; i < factors.length; i++) {
            if (factors[i] > max) max = factors[i];
        }
        return max;
    }

    public static int getSumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long getProductOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static double getProductOfCubes(int[] factors) {
        double product = 1;
        for (int f : factors) product *= Math.pow(f, 3);
        return product;
    }

    public static void main(String[] args) {
        int num = 12;
        int[] factors = getFactors(num);
        System.out.print("Factors of " + num + ": ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();
        System.out.println("Greatest Factor: " + getGreatestFactor(factors));
        System.out.println("Sum of Factors: " + getSumOfFactors(factors));
        System.out.println("Product of Factors: " + getProductOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + getProductOfCubes(factors));
    }
}
