import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15,16,17,3,15,14,13,0};
        int target = 9;
        int left=0, sum=0, right= nums.length-1;
        Arrays.sort(nums);
        while (left < right) {
            sum= nums[left] + nums[right];
            if(sum == target){
                System.out.println(Arrays.toString(nums));
                System.out.println( "---" + left + " - "+  right);
                System.out.println("suma " + nums[left] + "+" +nums[right] + "=" + sum);
                break;
            } else if( sum > target ){
                right--;
            } else{
                left++;
            }
        }
    }
}