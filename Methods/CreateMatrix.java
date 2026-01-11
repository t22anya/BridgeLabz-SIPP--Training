import java.util.Random;

public class CreateMatrix{
    public static int[][] createMatrix(int r, int c) {
        int[][] mat = new int[r][c];
        Random rand = new Random();
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = rand.nextInt(10);
        return mat;
    }

    public static int[][] add(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    public static int[][] subtract(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int r = a.length, c = b[0].length, n = b.length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                for (int k = 0; k < n; k++)
                    res[i][j] += a[i][k] * b[k][j];
        return res;
    }
}
