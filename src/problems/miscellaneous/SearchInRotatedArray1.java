package problems.miscellaneous;

public class SearchInRotatedArray1 {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target=6;
        System.out.println(new SearchInRotatedArray1().search(arr,target));
    }

    public int search(int[] nums, int target) {

        int result=-1;
        int i=0;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                break;
            }
        }

        result = binarySearch(nums,0,i,target);
        if(result==-1){
            result=binarySearch(nums,i+1,nums.length-1,target);
        }
        return result;
    }

    private int binarySearch(int[] nums, int low, int high, int target) {

        if(low<high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target<nums[mid]){
                return binarySearch(nums,low,mid,target);
            }else if(target>nums[mid]){
                return binarySearch(nums,mid+1,high,target);
            }else{
                return -1;
            }
        }else if(low==high){
            if(target==nums[low]){
                return low;
            }
        }

        return -1;
    }
}
