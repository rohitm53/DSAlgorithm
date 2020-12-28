package problems.arrays;

public class MinimunSwap {

    static int minimumSwaps(int[] arr) {
        int swaps=0;

        int counter=0;

        while(counter<arr.length){

            if(arr[counter]!=(counter+1)){

                int swapIndex = arr[counter]-1;
                int swapValue = arr[swapIndex];
                arr[swapIndex] = arr[counter];
                arr[counter]=swapValue;
                swaps++;
                counter=0;
                continue;
            }
            counter++;
        }
        return swaps;
    }


    public static void main(String[] args) {

        int[] arr={4,3,1,2};

        int res = minimumSwaps(arr);
        System.out.println(res);

    }

}
