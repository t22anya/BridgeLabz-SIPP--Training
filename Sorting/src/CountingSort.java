import java.util.*;

public class CountingSort {

    public static void countingSort(int[] ages) {
        int min = 10, max = 18;
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[ages.length];

        for (int age : ages) {
            count[age - min]++;
        }

       
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int index = count[age - min] - 1;
            output[index] = age;
            count[age - min]--;
        }

      
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];
        System.out.println("Enter the ages of " + n + " students (between 10 to 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        countingSort(ages);

        System.out.println("Sorted student ages:");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
