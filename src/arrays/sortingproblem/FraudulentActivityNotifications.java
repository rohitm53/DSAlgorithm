package arrays.sortingproblem;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FraudulentActivityNotifications {

    public static void main(String[] args) {

        int[] expenditure = {2,3 ,4 ,2, 3 ,6 ,8 ,4, 5};
        int d = 5;
        System.out.println(activityNotifications(expenditure,d));

    }
    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        int notificationCount=0;
        Arrays.sort(expenditure);

        for(int i=0;i<expenditure.length;i++){

            if((i+1)>d){

                Integer[] subArray = IntStream.range((i-d),i).
                        mapToObj(k->expenditure[k]).
                        toArray(Integer[]::new);

                if(d%2==0){
                    int mid = d/2;
                    int median  = ((subArray[mid] + subArray[mid-1])/2);

                    if(expenditure[i]>=2*median){
                        notificationCount++;
                    }
                }else{
                    int median = subArray[subArray.length/2];
                    if(expenditure[i]>=2*median){
                        notificationCount++;
                    }
                }
            }

        }

        return notificationCount;
    }

}
