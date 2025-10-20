
package tomson;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void result(Map<Integer, Integer> check, int[] resp) {
        int max = Collections.max(check.values());
        int i=0;
        for (Map.Entry<Integer, Integer> entry : check.entrySet()) {
            if (entry.getValue() == max) {
                resp[i] = entry.getKey();
                i++;
            }
        }

    }

    public static int[] grade(int[] nums) {
        int[] resp = new int[5];
        Map<Integer, Integer> check = new HashMap<>();
        for (int n : nums) {
            int valuNum = check.getOrDefault(n, 0);
            valuNum++;
            check.put(n, valuNum);
        }
        System.out.println(check.toString());
        result(check, resp);
        return resp;
    }

    public static void main(String[] rgv) {

        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 90, 9, 8, 7, 6, 5, 4, 3, 2, 1, 23, 3, 4, 5, 76, 8, 9 };
        System.out.println(Arrays.toString(grade(nums)));

    }
}