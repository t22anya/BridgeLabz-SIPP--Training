import java.util.Random;

public class TeamStats {

    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        int sum = getSum(heights);
        double mean = getMean(sum, heights.length);
        int shortest = getShortest(heights);
        int tallest = getTallest(heights);

        System.out.print("Heights: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        System.out.println("\nShortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.printf("Mean Height: %.2f cm\n", mean);
    }

    public static int[] generateHeights(int size) {
        Random rand = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + rand.nextInt(101);
        }
        return heights;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int h : arr) {
            sum += h;
        }
        return sum;
    }

    public static double getMean(int sum, int count) {
        return (double) sum / count;
    }

    public static int getShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) {
            if (h < min) min = h;
        }
        return min;
    }

    public static int getTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) {
            if (h > max) max = h;
        }
        return max;
    }
}
