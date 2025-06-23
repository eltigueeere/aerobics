import java.util.HashMap;
public class TwoSumHasMap {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15,16,17,3,15,14,13,0};
        int target= 9;
        HashMap<Integer, Integer> map = new HashMap<>();
        int complement=0;
        for(int i=0; i<nums.length-1; i++){
            complement = target-nums[i];
            System.out.println(map);
            if(map.containsKey(complement)){
                System.out.println("we have the complement ");
                System.out.println(i + " + " + map.get(complement) );
                break;
            } else{
                map.put(nums[i],i);
            }
        }
    }
}
