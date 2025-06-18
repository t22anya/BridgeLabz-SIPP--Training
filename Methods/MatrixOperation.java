import java.util.Random;

public class MatrixOperation {

    public static void main(String[] args) {
        int[][] matrix2x2 = generateMatrix(2, 2);
        int[][] matrix3x3 = generateMatrix(3, 3);

        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);

        System.out.println("Transpose:");
        displayMatrix(transposeMatrix(matrix2x2));

        double det2x2 = determinant2x2(matrix2x2);
        System.out.println("Determinant: " + det2x2);

        if (det2x2 != 0) {
            System.out.println("Inverse:");
            displayMatrix(inverse2x2(matrix2x2));
        } else {
            System.out.println("Inverse: Not possible (determinant is 0)");
        }

        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrix3x3);

        System.out.println("Transpose:");
        displayMatrix(transposeMatrix(matrix3x3));

        double det3x3 = determinant3x3(matrix3x3);
        System.out.println("Determinant: " + det3x3);

        if (det3x3 != 0) {
            System.out.println("Inverse:");
            displayMatrix(inverse3x3(matrix3x3));
        } else {
            System.out.println("Inverse: Not possible (determinant is 0)");
        }
    }

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = rand.nextInt(10) + 1;
        return mat;
    }

    public static int[][] transposeMatrix(int[][] mat) {
        int[][] trans = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++)
                trans[j][i] = mat[i][j];
        return trans;
    }

    public static double determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public static double determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    public static double[][] inverse2x2(int[][] m) {
        double det = determinant2x2(m);
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;
        return inv;
    }

    public static double[][] inverse3x3(int[][] m) {
        double det = determinant3x3(m);
        double[][] cof = new double[3][3];

        cof[0][0] =  m[1][1] * m[2][2] - m[1][2] * m[2][1];
        cof[0][1] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]);
        cof[0][2] =  m[1][0] * m[2][1] - m[1][1] * m[2][0];

        cof[1][0] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]);
        cof[1][1] =  m[0][0] * m[2][2] - m[0][2] * m[2][0];
        cof[1][2] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]);

        cof[2][0] =  m[0][1] * m[1][2] - m[0][2] * m[1][1];
        cof[2][1] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]);
        cof[2][2] =  m[0][0] * m[1][1] - m[0][1] * m[1][0];

        double[][] adj = transposeMatrixDouble(cof);
        double[][] inv = new double[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inv[i][j] = adj[i][j] / det;

        return inv;
    }

    public static double[][] transposeMatrixDouble(double[][] mat) {
        double[][] trans = new double[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++)
                trans[j][i] = mat[i][j];
        return trans;
    }

    public static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row)
                System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }
}
