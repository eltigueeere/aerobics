package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MergeNums {

    public static List<int[]> merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparing(a -> a[0]));
        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];
        result.add(current);
        for (int[] next : intervals) {
            if (next[0] <= current[1]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                current = next;
                result.add(current);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 9, 12 }
        };

        System.out.println(Arrays.deepToString(matriz));
        List<int[]> merged = merge(matriz);
        for (int[] interval : merged) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }

}
