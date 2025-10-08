import java.util.*;

public class RotateMatrix {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix1);
        System.out.println(Arrays.deepToString(matrix1));

        int[][] matrix2 = {{0,1,1,2},{2,0,3,1},{4,5,0,5},{5,6,7,0}};
        rotate(matrix2);
        System.out.println(Arrays.deepToString(matrix2));
    }
}
