package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionChars {

    public static void estanLosChar(char[][] matriz, String word) {
        int row = matriz.length;
        int col = matriz[0].length;
        char[] worChar = word.toCharArray();
        int starChar = 0;
        int indexList = 0;
        char[] getChar = new char[worChar.length];
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                list.add(matriz[i][j]);
            }
        }
        while (starChar < worChar.length || indexList < list.size() ) {
            if (worChar[starChar] == list.get(indexList)) {
                getChar[starChar] = worChar[starChar];
                starChar++;
            }
            indexList ++;
        }
        System.out.println(Arrays.toString(getChar) + " VS " + Arrays.toString(worChar));
        if (Arrays.toString(getChar).equals(Arrays.toString(worChar))) {
            System.out.println("Si esta");
        } else {
            System.out.println("No esta");
        }

    }

    public static void main(String[] args) {
        char[][] matriz = {
                { 'M', 'N', 'O', 'P' },
                { 'E', 'F', 'G', 'H' },
                { 'A', 'B', 'C', 'D' },
                { 'I', 'J', 'K', 'L' }
        };
        String word = "NGBCKL";
        estanLosChar(matriz, word);

    }

}
