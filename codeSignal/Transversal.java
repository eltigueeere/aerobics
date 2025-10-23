package codeSignal;
// name ejecicio Zigzag Traversal in a Grid
public class Transversal {
    public static int[] transversal(int[][] matrix) {
        int[] resp = new int[matrix.length * matrix[0].length];
        int col = matrix.length - 1, row = matrix[0].length - 1, j = row, loop = 0,
                maxLops = matrix.length * matrix[0].length;
        boolean movLeft =false;
        while (loop < maxLops) {
            if (col == 1 && movLeft==false) {
                resp[loop] = matrix[col][j];
                col--;
            } else if (col == 0 && movLeft==false) {
                resp[loop] = matrix[col][j];
                movLeft = true;
                j--;
            } else if( col == 0 && movLeft == true ){
                resp[loop] = matrix[col][j];
                col++;
            } else if (col == 1 && movLeft == true) {
                resp[loop] = matrix[col][j];
                j--;
                movLeft = false;
            }

            System.out.println(resp[loop]);
            loop++;
        }
        return resp;
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 101, 102, 103, 104 },
                { 201, 202, 203, 204 }
        };
        transversal(grid);
    }

}
