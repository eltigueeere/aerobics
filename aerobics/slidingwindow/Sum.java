package aerobics.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {

    public static int[] sum(int[] nums, int target) {
        int[] respInt = new int[3];
        if (nums == null || nums.length == 0) {
            return respInt;
        }
        int right = 0, left = 2, _target = 0;
        List<Integer> resp = new ArrayList<>();
        
        while (left < nums.length) {
            for (int i = right; i <= left; i++) {
                _target += nums[i];
            }
            if (_target == target) {
                resp.add(right);
                resp.add(left);

                for (int j = resp.get(0), i = 0; j <= resp.get(1); j++, i++) {
                    respInt[i] = nums[j];
                    System.out.println(Arrays.toString(respInt));
                }
                return respInt;
            }
            _target = 0;
            right++;
            left++;

        }

        return respInt;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 5, 5, 1, 1, 2, 1, 8, 6 };
        int target = 7;

        sum(nums, target);

    }
}
