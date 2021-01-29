package arrays.sorting;

import java.util.Arrays;
import java.util.PriorityQueue;

public class RunningMedian {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        Arrays.stream(solution(array)).forEach(System.out::println);

    }

    private static double[] solution(int[] array){

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> -1 * o1.compareTo(o2));
                    // to keep max element at top we named this as maxHeap in PriorityQueue Data Structure

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
                   // to min value at top so named as minHeap in PriorityQueue Data Structure

        double[] resultMedians = new double[array.length];

        for(int i=0;i<array.length;i++){

            int number = array[i];
            //Step 1 : Add number to priorities queues
            addNumber(number,maxHeap,minHeap);
            reBalance(maxHeap,minHeap);
            resultMedians[i] = getMedian(maxHeap,minHeap);
        }

        return resultMedians;
    }

    private static void addNumber(int number,PriorityQueue<Integer> lowerHeap,PriorityQueue<Integer> higherHeap){

        if(lowerHeap.isEmpty() || number<lowerHeap.peek()){
            lowerHeap.add(number);
        }else{
            higherHeap.add(number);
        }
    }

    private static void reBalance(PriorityQueue<Integer> lowerHeap,PriorityQueue<Integer> higherHeap){

        PriorityQueue<Integer> biggerHeap = lowerHeap.size()>higherHeap.size()? lowerHeap : higherHeap;
        PriorityQueue<Integer> smallerHeap = lowerHeap.size()>higherHeap.size()? higherHeap : lowerHeap;

        if(biggerHeap.size()-smallerHeap.size()>=2){
            smallerHeap.add(biggerHeap.poll());
        }
    }
    private static double getMedian(PriorityQueue<Integer> lowerHeap,PriorityQueue<Integer> higherHeap){

        PriorityQueue<Integer> biggerHeap = lowerHeap.size()>higherHeap.size()? lowerHeap : higherHeap;
        PriorityQueue<Integer> smallerHeap = lowerHeap.size()>higherHeap.size()? higherHeap : lowerHeap;


        if(biggerHeap.size()==smallerHeap.size()){
            return ((double)biggerHeap.peek()+smallerHeap.peek())/2;
        }else{
            return biggerHeap.peek();
        }
    }


}
