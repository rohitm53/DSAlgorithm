package problems.arrays.sorting;

import java.util.Arrays;
//Time Complexity  : O(nlogn)
public class QuickSortAlgorithm {


    public static void main(String[] args) {
//        int[] arr = {2,5,1,10,6,9,8};
        int[] arr = {1,12,5,111,200,1000,10,10};
        int low = 0;
        int high = arr.length-1;
        quickSort(arr,low,high);

        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void quickSort(int[] arr , int low,int high) {

        if(low<high){
            int pivotIndex=partition(arr,low,high);
            quickSort(arr,low,pivotIndex);
            quickSort(arr,pivotIndex+1,high);
        }

    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[low];
        int i=low-1,j=high+1;

        while(true){

          do {
              i++;
          }while (i<arr.length && arr[i]<=pivot);

          do{
              j--;
          }while (arr[j]>pivot);

          if(i >= j){
              return j;
          }
          swap(arr,i,j);
        }
    }

    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
