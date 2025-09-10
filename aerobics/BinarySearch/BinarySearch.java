package aerobics.BinarySearch;

public class BinarySearch {
    public static int binarySeach(int[] nums, int target) {
        int index = -1, right = nums.length - 1, left = 0;

        while (left <= right) {
            index = left + (right - left) / 2;
            System.out.println(right);
            System.out.println(index);
            System.out.println(nums[index]);
            if (nums[index] == target) {
                return index;
            } else if (nums[index] > target) {
                right = index - 1;
            } else {
                left = index + 1;
            }
            System.out.println("right " + right);
            System.out.println("left " + left);
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 15, 16 };

        System.out.println(binarySeach(nums, 2));

        System.out.println("Binary Seach");
    }
}
