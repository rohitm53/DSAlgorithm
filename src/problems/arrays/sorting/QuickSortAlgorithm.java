package problems.arrays.sorting;

import java.util.Arrays;
//Time Complexity  : O(nlogn)
public class QuickSortAlgorithm {


    public static void main(String[] args) {
        int[] arr = {2,5,1,10,6,9,8};
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
        int i=low,j=high;

        while(i<j){

          while(i<arr.length && pivot>=arr[i]){
              i++;
          }

          while(pivot<arr[j]){
              j--;
          }
          if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }

    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
