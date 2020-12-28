package problems.arrays;

public class ArrayManipulation {

    public static void main(String[] args) {

        int n = 10;
        int[][] queries = {
                {2,6,8},
                {3,5,7},
                {1,8,1},
                {5,9,15}
        };

        long result = arrayManipulation(n,queries);
        System.out.println(result);

    }

    static long arrayManipulation(int n, int[][] queries) {

        int[] query1 = queries[0];

        long maxValue = query1[2];
        long maxStartIndex = query1[0]-1;
        long maxEndIndex = query1[0]-1;

        if(queries.length>1){

            for(int i=0;i<queries.length;i++){

                int start = queries[i][0]-1;
                int end = queries[i][1]-1;
                int k = queries[i][2];


            }

        }

        return maxValue;
    }

}
