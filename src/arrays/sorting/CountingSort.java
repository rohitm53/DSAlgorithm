package arrays.sorting;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {

        int[] arr = {2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
        Arrays.stream(countSort(arr)).forEach(i-> System.out.print(i+" "));
    }


    private static int[] countSort(int[] arr){

        int max=0;// Maximum element in array;
        int n=arr.length;

        //Loop to find out Max element
        for(int item : arr){
            if(item>max){
                max=item;
            }
        }

        //Initializing count array with  max+1 because we need to deal with values in main arary as index
        int[] countArr = new int[max+1];

        for (int j : arr) {
            countArr[j]++;   /// making count array
        }
        for(int i=1;i<=max;i++){
            countArr[i]=countArr[i]+countArr[i-1];   // making posiition of result array by prefix sum array algo
        }

        int[] result = new int[n];

        for(int i=(n-1);i>=0;i--){
            result[--countArr[arr[i]]]=arr[i];

        }
        return result;

    }

}
