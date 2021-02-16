package problems.miscellaneous;

import java.util.*;

public class FourSum {

    public static void main(String[] args) {
        FourSum fourSum = new FourSum();

        int[] nums = {-2,-1,-1,1,1,1,2,2};
        int target = 0;

        System.out.println(fourSum.fourSum(nums,target));

    }


    public List<List<Integer>> fourSum(int[] nums, int target) {

        Set<List<Integer>> resultSet = new HashSet<>();
        Arrays.sort(nums);

        if(nums.length<4){
            return new ArrayList<>(resultSet);
        }

        int n = nums.length;

        int i=0;
        int j=i+1;

        while (i<n){
            j=i+1;
           while (j<n){
                int delta = target-(nums[i]+nums[j]);

                int front = j+1;
                int back = n-1;

                while (front<back){

                    int diff = nums[front]+nums[back];
                    if(diff<delta){
                        front++;
                    }else if(diff>delta) {
                        back--;
                    }else {
                        resultSet.add(Arrays.asList(nums[i],nums[j],nums[front++],nums[back--]));
                    }
//
//                    while(front<back && nums[front] == nums[front+1]) front++;   //crossing duplicates
//
//                    while (front<back && nums[back] == nums[back-1]) back--;  // crossing duplicates
                }

                while (j+1<n && nums[j]==nums[j+1]) ++j;
                j++;
            }
            while (i+1<n && nums[i]==nums[i+1]) ++i;
            i++;
        }
        return new ArrayList<>(resultSet);
    }

}
