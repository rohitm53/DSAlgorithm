package problems.miscellaneous;

import java.util.*;

public class ThreeSum {


    public static void main(String[] args) {

        ThreeSum threeSum = new ThreeSum();

        int[] nums = {0,0,0};
        System.out.println(threeSum.threeSum(nums));


    }

    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> resultList= new HashSet<>();
        if(nums.length<3){
            return new ArrayList<>(resultList);
        }
        Arrays.sort(nums);

        int n = nums.length;

        for(int i=0;i<n-2;i++){

            int j=i+1;
            int k=n-1;

            while (j<k){

                int delta =  (nums[j]+nums[k]);
                if(-1*delta ==nums[i]){
                    resultList.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                }else if((-1 * delta)>nums[i]){
                    j++;
                }else if((-1*delta)<nums[j]){
                    k--;
                }
            }

        }

        return new ArrayList<>(resultList);
    }



}
