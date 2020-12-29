package problems.arrays;

public class ArrayManipulation {

    public static void main(String[] args) {

        int n = 5;
        int[][] queries = {
                {1,2,100},
                {2,5,100},
        };

        long result = arrayManipulation(n,queries);
        System.out.println(result);

    }

    static long arrayManipulation(int n, int[][] queries) {

        long maxValue=0;
        long[] array = new long[n+2];

        for(int [] query : queries){

            int a = query[0];
            int b = query[1];
            int k = query[2];

            array[a-1]=array[a-1]+k;
            array[b]=array[b]-k;
        }
        maxValue = array[0];
        for(int i=1;i<n;i++){
            array[i] = array[i-1]+array[i];
            if(array[i]>maxValue){
                maxValue=array[i];
            }
        }

        return maxValue;
    }

}
