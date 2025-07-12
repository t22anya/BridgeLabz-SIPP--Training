import java.util.*;
public class ChallengeLinearBinary {
    public static int firstMissingPositive(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) if (num > 0) set.add(num);
        for (int i = 1; i <= arr.length; i++) if (!set.contains(i)) return i;
        return arr.length + 1;
    }

    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}