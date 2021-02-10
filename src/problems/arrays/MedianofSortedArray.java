package problems.arrays;

import java.util.Arrays;

public class MedianofSortedArray {

    public static void main(String[] args) {

        int[] nums1 = {1,2};
        int[] nums2 = {3,4};

        System.out.println(findMedianSortedArrays(nums1,nums2));
    }



    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double result=0;
        int[] resultArray = new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        int n1=nums1.length;
        int n2=nums2.length;

        while (i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                resultArray[k]=nums1[i];
                i++;
            }else{
                resultArray[k]=nums2[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            resultArray[k++]=nums1[i++];
        }
        while (j<n2){
            resultArray[k++]=nums2[j++];
        }

        if(resultArray.length%2!=0){
            result = resultArray[resultArray.length/2];
        }else{

            int mid = resultArray.length/2;
            result = (double) (resultArray[mid]+resultArray[mid-1])/2;

        }

        return result;

    }

}
