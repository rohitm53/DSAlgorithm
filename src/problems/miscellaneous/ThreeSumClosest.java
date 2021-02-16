package problems.miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumClosest {


    public static void main(String[] args) {

        ThreeSumClosest threeSumClosest = new ThreeSumClosest();

//        int[] nums = {0,1,2};
//        int target =3;
        int[] nums = {0,0,0};
        int target =1;

        System.out.println(threeSumClosest.threeSumClosest(nums,target));

    }

    public int threeSumClosest(int[] nums, int target) {

        int n = nums.length;
        int result=nums[0]+nums[1]+nums[n-1];
        Arrays.sort(nums);


        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right = n-1;

            while (left<right){

                int currSum = nums[i]+nums[left]+nums[left];

                if(currSum<target){
                    left++;
                }else{
                    right--;
                }

                if(Math.abs(currSum-target)<Math.abs(result-target)){
                    result = currSum;
                }

            }

        }
        return result;
    }

}
