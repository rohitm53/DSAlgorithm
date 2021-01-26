package problems.arrays.sortingproblem;

import java.util.Arrays;

public class MarkandToysProblem {


    public static void main(String[] args) {

//        int[] prices = {1,12,5,111,200,1000,10};
        int[] prices = {1,2,3,4};
        System.out.println(maximumToys(prices,7));

    }


    static int maximumToys(int[] prices, int k) {

        int pairCount=0;
        int sum=0;

        int low =0;
        int high=prices.length-1;
//        quickSort(prices,low,high);
        Arrays.sort(prices);
        for (int num : prices) {

            if (num < k && sum<k && (sum+num)<k) {
                sum += num;
                pairCount++;
            }

            if (sum > k) {
                break;
            }
        }

        return pairCount;
    }

    private static void quickSort(int[] prices,int low,int high){

        if(low<high){
            int pivotIndex = partition(prices,low,high);
            quickSort(prices,low,pivotIndex);
            quickSort(prices,pivotIndex+1,high);
        }
    }

    private static int partition(int[] prices,int low,int high){

        int i=low;
        int j=high;
        int pivot = prices[low];

        while (i<j){

            while(i<prices.length && pivot >= prices[i]){
                i++;
            }
            while (pivot<prices[j]){
                j--;
            }

            if(i<j){
                swap(prices,i,j);
            }
        }

        swap(prices,low,j);

        return j;

    }

    private static void swap(int[] arr,int a,int b){

        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }

}
