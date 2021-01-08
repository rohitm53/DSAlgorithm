package problems.hashmaps;

import java.util.*;
import java.util.function.Predicate;

public class FrequencyQueries  {


    public static void main(String[] args) {
        List<List<Integer>> queries = Arrays.asList(
          Arrays.asList(1,5),
          Arrays.asList(1,6),
          Arrays.asList(3,2),
          Arrays.asList(1,10),
          Arrays.asList(1,10),
          Arrays.asList(1,6),
          Arrays.asList(2,5),
          Arrays.asList(3,2)
        );
        List<Integer> result = freqQuery(queries);
        System.out.println(result);
    }

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        List<Integer> result = new ArrayList<>();

        Map<Integer,Integer> hmData = new LinkedHashMap<>();
        Map<Integer,HashSet<Integer>> hmCount = new LinkedHashMap<>();

        for(List<Integer> key : queries){

            int query = key.get(0);
            int queryValue = key.get(1);

            if(query==1){
                if(hmData.containsKey(queryValue)){
                    int prevCount = hmData.get(queryValue);
                    int newCount = prevCount+1;

                    // we want to delete its previous count
                    updateCount(hmCount,prevCount,queryValue,false);

                    //Adding data to main data structure
                    hmData.put(queryValue,newCount);


                    //Updating its count
                    updateCount(hmCount,newCount,queryValue,true);

                }else{
                    hmData.put(queryValue,1);
                    updateCount(hmCount,1,queryValue,true);
                    // we want to delete its update its count in hmCount
                }

            }else if(query==2){
                if(hmData.containsKey(queryValue) && hmData.get(queryValue)>0){
                    int prevCount = hmData.get(queryValue);
                    int newCount = prevCount-1;

                    // we want to delete its previous count
                    updateCount(hmCount,prevCount,queryValue,false);

                    if(newCount>0){
                        hmData.put(queryValue,newCount);
                        updateCount(hmCount,newCount,queryValue,true);
                    }else{
                        hmData.remove(queryValue);
                    }
                }
            }else if(query==3){
                if(hmCount.containsKey(queryValue)){
                    result.add(1);
                }else{
                    result.add(0);
                }
            }
        }
        System.out.println(hmCount);
        return  result;
    }

    private static void updateCount(Map<Integer,HashSet<Integer>> hmCount,int keyCount,int value,boolean isAdd){

        if(isAdd){
            if(hmCount.containsKey(keyCount)){
                HashSet<Integer> hashSet = hmCount.get(keyCount);
                hashSet.add(value);
            }else{
                HashSet<Integer> hashSet = new HashSet<>();
                hashSet.add(value);
                hmCount.put(keyCount,hashSet);
            }
        }else{
            if(hmCount.containsKey(keyCount)){
                HashSet<Integer> hashSet = hmCount.get(keyCount);
                hashSet.removeIf(integer -> integer==value);
                if(hashSet.size()==0){
                    hmCount.remove(keyCount);
                }
            }else{
                /// do nothing

            }

        }


    }

}
