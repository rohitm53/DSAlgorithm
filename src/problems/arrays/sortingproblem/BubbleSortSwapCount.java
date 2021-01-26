package problems.arrays.sortingproblem;

public class BubbleSortSwapCount {


    public static void main(String[] args) {
        int[] array = {6,4,1};
        countSwaps(array);
    }


    // Complete the countSwaps function below.
    private static void countSwaps(int[] arr) {

        int countSwap=0;
        int len = arr.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-1;j++){

                if(arr[j]>arr[j+1]){
                    swap(arr,j,(j+1));
                    countSwap++;
                }

            }
        }

        System.out.println("Array is sorted in "+countSwap+" swaps.");
        System.out.println("First Element: "+arr[0]);
        System.out.println("Last  Element: "+arr[len-1]);

    }

     private static void swap(int[] array,int i,int j){
        array[i]=array[i]+array[j];
        array[j] = array[i]-array[j];
        array[i]=array[i]-array[j];
    }

}
