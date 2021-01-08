package problems.hashmaps;

import java.util.*;

public class CountTriplets {

    public static void main(String[] args) {

        List<Long> arrList = getData();
        System.out.println(countTriplets(arrList,1));
//        System.out.println(countTriplets(Arrays.asList(1L,2L,2L,4L),2));
    }

    private static List<Long> getData(){
        List<Long> arrList = new ArrayList<>();

        for(int i=0;i<100;i++){
            arrList.add(1L);
        }
        return arrList;
    }

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {

        long result=0;

        HashMap<Long,Long> hmRightMap = new HashMap<>();
        HashMap<Long,Long> hmLeftMap = new HashMap<>();

        for(long item : arr){
            hmRightMap.put(item,hmRightMap.getOrDefault(item, 0L)+1);
        }

        for (long midTerm : arr) {
            long num1 = midTerm / r;
            long num3 = midTerm * r;

            hmRightMap.put(midTerm, hmRightMap.getOrDefault(midTerm, 0L) - 1);

            if ((midTerm % r==0) &&hmLeftMap.containsKey(num1) && hmRightMap.containsKey(num3)) {

                long leftCount = hmLeftMap.get(num1);
                long rightCount = hmRightMap.get(num3);
                result += leftCount * rightCount;

            }
            hmLeftMap.put(midTerm, hmLeftMap.getOrDefault(midTerm, 0L) + 1);
        }
        return result;
    }
}

