package arrays.sorting;

import java.util.Arrays;
//Time Complexity  : O(n^2)
public class SelectionSortAlgorithm {

    public static void main(String[] args) {
        int[] arr = {2,5,1,10,6,9,8};
        selectionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void selectionSort(int[] arr){

        for(int i=0;i<arr.length;i++){

            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    minIndex=j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;

        }

    }
}
