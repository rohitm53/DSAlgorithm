package arrays.sorting;

import java.util.Arrays;

public class MergeSortAlgorithm {

    public static void main(String[] args) {
        int[] arr = {2,5,1,10,6,9,8};

        mergeSort(arr,0,arr.length-1);

        Arrays.stream(arr).forEach(i-> System.out.print(" "+i));

    }


    private static void mergeSort(int[] arr,int lower,int upper){

        if(lower<upper){
            //atleast two elements are their in the array

            int mid = (lower+upper)/2;
            mergeSort(arr,lower,mid);
            mergeSort(arr,mid+1,upper);
            merge(arr,lower,mid,upper);

        }
    }

    private static void merge(int[] arr,int lower,int mid,int upper){

        int n1 = mid-lower+1;
        int n2 = upper-mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for(int i=0;i<n1;i++){
            leftArray[i]=arr[i+lower];
        }

        for(int j=0;j<n2;j++){
            rightArray[j]=arr[mid+1+j];
        }


        int i=0;
        int j=0;
        int k =lower;

        while (i<n1 && j<n2){
            if(leftArray[i]<=rightArray[j]){
                arr[k]=leftArray[i];
                i++;
            }else{
                arr[k]=rightArray[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            arr[k]=leftArray[i];
            i++;
            k++;
        }

        while (j<n2){
            arr[k]=rightArray[j];
            j++;
            k++;
        }
    }

}

