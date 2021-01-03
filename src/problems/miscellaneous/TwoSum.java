package problems.miscellaneous;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {


    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = twoSum(nums,target);

        Arrays.stream(result).forEach(System.out::println);

    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hmNumMap = new HashMap<>();

        hmNumMap.put(nums[0],0);

        for(int i=1;i<nums.length;i++){
            int delta = target-nums[i];
            if(hmNumMap.containsKey(delta)){
                return new int[]{hmNumMap.get(delta),i};
            }else{
                hmNumMap.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }

}
