public class BinarySearch2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int midElement = matrix[mid / cols][mid % cols];
            if (midElement == target) return true;
            else if (midElement < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}