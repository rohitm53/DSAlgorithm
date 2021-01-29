package arrays.sortingproblem;

import java.util.ArrayList;
import java.util.Collections;

public class FraudulentActivityNotifications {

    public static void main(String[] args) {

        int[] expenditure = {2,3,4,2,3,6,8,4,5};
        int d = 5;
        System.out.println(activityNotifications(expenditure,d));

    }
    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        int result=0;
        int len = expenditure.length;
        ArrayList<Integer> listExp = new ArrayList<>();

        if(len>0){

            for(int i=0;i<len;i++){

                int mainExp = expenditure[i];
                if((i+1)>d){

                    int size = listExp.size();
                    if(size%2==0){
                        int midIndex = size/2;
                        int median = (listExp.get(midIndex) + listExp.get(midIndex+1))*2;
                        if(mainExp>=median){
                            result++;
                        }
                    }else{
                        int midIndex = size/2;
                        int median = (listExp.get(midIndex))*2;
                        if(median>=mainExp){
                            result++;
                        }
                    }
                    listExp.remove(i-d);
                }
                listExp.add(mainExp);
                Collections.sort(listExp);
            }

        }
        return result;
    }

}
