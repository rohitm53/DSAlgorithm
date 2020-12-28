package problems.arrays.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2,5,1,10,6,9,8};
        bubbleSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void bubbleSort(int arr[]){

        for(int i=0;i<arr.length;i++){
            for (int j = 0; j < arr.length; j++){
                if(arr[j]>arr[i]){
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
        }
    }
}
