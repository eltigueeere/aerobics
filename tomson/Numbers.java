package tomson;

public class Numbers {

    public static int minMoves(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null || arr1.length != arr2.length)
            throw new IllegalArgumentException("Arrays must be non-null and of equal length.");

        int totalMoves = 0;

        for (int i = 0; i < arr1.length; i++) {
            String s1 = String.valueOf(arr1[i]);
            String s2 = String.valueOf(arr2[i]);

            if (s1.length() != s2.length())
                throw new IllegalArgumentException("Numbers must have same number of digits at index " + i);

            for (int j = 0; j < s1.length(); j++) {
                int digit1 = s1.charAt(j) - '0';
                int digit2 = s2.charAt(j) - '0';
                totalMoves += Math.abs(digit1 - digit2);
            }
        }
        return totalMoves;
    }

    public static void main(String[] args) {
        int[] arr1 = {123, 543};
        int[] arr2 = {321, 279};

        int result = minMoves(arr1, arr2);
        System.out.println("Minimum moves: " + result);
    }
}
