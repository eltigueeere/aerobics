package JAVAchallengsBook.string;

import java.util.Arrays;
import java.util.Collection;

public class MatrixUtils {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        if (n <= 1) {
            return;
        }
        // layers
        for (int i = 0; i < n / 2; i++) {
            // elements
            for (int j = i; j < n - i - 1; j++) {
                // P1
                int temp = matrix[i][j];
                // top-left <- bottom-left
                matrix[i][j] = matrix[n - 1 - j][i];
                // bottom-left <- bottom-right        
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                // bottom-right <- top-right        
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                // top-right <- top-left        
                matrix[j][n - 1 - i] = temp;

            }
        }
        // [9, 10, 11, 12]
        // [16, 17, 18, 19]
        // [23, 24, 25, 26]
        // [30, 31, 32, 33]
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 9, 10, 11, 12 }, { 16, 17, 18, 19 }, { 23, 24, 25, 26 }, { 30, 31, 32, 33 } };
        for (int[] array : matrix) {
            System.out.println(Arrays.toString(array));

        }
        System.out.println("Rotate");
        rotate(matrix);
        for (int[] array : matrix) {
            System.out.println(Arrays.toString(array));
        }
    }
}
