package problems.arrays.sorting;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {

        int[] arr = {2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
        Arrays.stream(countSort(arr)).forEach(i-> System.out.print(i+" "));
    }


    private static int[] countSort(int[] arr){

        int k=0;// Maximum element in array;
        int n=arr.length;

        for(int item : arr){
            if(item>k){
                k=item;
            }
        }
        int[] countArr = new int[k+1];

        for (int j : arr) {
            countArr[j]++;   /// making count array
        }
        for(int i=1;i<=k;i++){
            countArr[i]=countArr[i]+countArr[i-1];   // making posiition of result array by prefix sum array algo
        }

        int[] result = new int[n];

        for(int i=(n-1);i>=0;i--){
            result[--countArr[arr[i]]]=arr[i];

        }
        return result;

    }

}
