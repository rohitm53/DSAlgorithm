package problems.arrays;

import java.util.Arrays;

public class MinimumBribes {

    static void minimumBribes(int[] q) {

        int len = q.length;
        int bribes=0;
        boolean isChaotic = false;

        for(int i=(len-1);i>0;i--){

            int expectedValue=(i+1);
            int currentValue=q[i];

            if(currentValue==expectedValue){
            }else if(q[i-1]==expectedValue){
                swap(q,(i-1),i);
                bribes++;
            }else if(q[i-2]==expectedValue){
                swap(q,(i-1),(i-2));
                swap(q,(i-1),i);
                bribes=bribes+2;

            }else{
                isChaotic=true;
                System.out.println("Too chaotic");
                break;
            }
        }
        if(!isChaotic){
            System.out.println(bribes);
        }
    }

    private static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        int[] queue = {1,2,5,3,7,8,6,4};
        minimumBribes(queue);
    }
}
