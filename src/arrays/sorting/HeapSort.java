package arrays.sorting;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {

        int[] arr = {15,5,30,1,17,10,20};
        int size=arr.length;
        int n=size-1;

        /*
        * Assuming we are going to make max heap
        * */

        /*
        * Step 1 : Make this array as MaxHeap by calling heapify method from largest non leaf indexed
        * node to 0
        * Largest Non Lead index node : n/2
        * */
        // This loop will make max heap from provided array
        for(int i=n/2;i>=0;i--){
            heapify(arr,n,i);
        }


        /*
        * Step 2 : We are going to delete element from max heap (Top element) and keep that element
        * at last and reduce the heap from n and again call heapify method from index 1
        * */

        for(int i=n;i>=0;i--){
            swap(arr,0,i);
            heapify(arr,i,0);
        }


        Arrays.stream(arr).forEach(System.out::println);

    }


    private static void heapify(int[] arr,int n,int i){

        int largest = i;
        int leftChildIndex = (2*i)+1;
        int rightChildIndex = (2*i) +2;

        if(leftChildIndex<n && arr[leftChildIndex]>arr[largest]){
            largest=leftChildIndex;
        }

        if(rightChildIndex<n && arr[rightChildIndex]>arr[largest]){
            largest=rightChildIndex;
        }

        if(largest!=i){
            swap(arr,i,largest);
            heapify(arr,n,largest);
        }
    }


    private static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
