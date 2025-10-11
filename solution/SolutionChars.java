package solution;

import java.util.ArrayList;
import java.util.List;

public class SolutionChars {

    public static boolean estanLosChar(char[][] matriz, String word) {
        List<Character> list = new ArrayList<>();
        for (char[] fila : matriz) {
            for (char c : fila) {
                list.add(c);
            }
        }

        int i = 0; // índice en word
        for (char c : list) {
            if (c == word.charAt(i)) {
                i++;
                if (i == word.length()) { // se encontró toda la palabra
                    return true;
                }
            }
        }

        return false; // si termina el loop sin completar la palabra
    }

    public static void main(String[] args) {
        char[][] matriz = {
            { 'M', 'N', 'O', 'P' },
            { 'E', 'F', 'G', 'H' },
            { 'A', 'B', 'C', 'D' },
            { 'I', 'J', 'K', 'L' }
        };

        String word = "NGBCKL";

        System.out.println(estanLosChar(matriz, word) ? "Sí está" : "No está");
    }
}
