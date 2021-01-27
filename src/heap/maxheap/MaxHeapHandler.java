package heap.maxheap;

import java.util.Arrays;

public class MaxHeapHandler {

    private int[] heap;
    private int size;
    private int maxSize=0;

    public MaxHeapHandler(int maxSize) {
        this.maxSize=maxSize;
        this.size=0;
        heap = new int[this.maxSize];
        heap[0] = Integer.MAX_VALUE;
    }

    public void insertValue(int element){

        heap[++size]=element;
        int current =size;
        while (heap[current]>heap[getParentIndex(current)]){
            swap(current,getParentIndex(current));
            current = getParentIndex(current);
        }

    }
    public void printHeap(){

        for(int i=1 ; i<=(size/2);i++){
            System.out.println("PARENT :  "+heap[i] + "  LEFT CHILD : "+heap[getLeftChildIndex(i)] +
                    "  RIGHT CHILD : "+heap[getRightChildIndex(i)]);
        }
    }

    public void checkAllNodeForLeaf(){
        for(int i=1;i<=size;i++){
            System.out.println(heap[i] + " : Leaf Node : "+isLeaf(i));
        }
    }

    public void printAllLeadfNode(){
        for(int i=1;i<=size;i++){
            int leftChildIndex = (2*i);
            int rightChildIndex = (2*i)+1;

            if(leftChildIndex> size && rightChildIndex>size){
                System.out.println(heap[i]);
            }

        }
    }

    //---------------Helper methods----------------------------------------------


    private int getLeftChildIndex(int pos){
        return 2 * pos;
    }
    private int getRightChildIndex(int pos){
        return (2 * pos)+1;
    }

    private int getParentIndex(int position){
        return position/2;
    }


    //Function to remove maximum element from top
    public int pollMax(){
        int popped = heap[1];
        heap[1] = heap[size--];
        maxHeapify(1);
        return popped;
    }

    public void maxHeapify(int pos){

        int number = heap[pos];
        int leftChild = heap[getLeftChildIndex(pos)];
        int rightChild = heap[getRightChildIndex(pos)];


        if(leftChild>rightChild && number<leftChild){
            swap(getLeftChildIndex(pos),pos);
            maxHeapify(getLeftChildIndex(pos));
        }else if(number<rightChild){
            swap(getRightChildIndex(pos),pos);
            maxHeapify(getRightChildIndex(pos));
        }


    }

    //Function to check node at provided position is leaf node
    public boolean isLeaf(int pos){
        return pos >= (size / 2) && pos <= size  ;
    }

    public void printHeight(){
        int height = (int)Math.ceil(Math.log(size +1) / Math.log(2)) - 1;
        System.out.println("Height : "+height);
    }


    private void swap(int a,int b){
        int temp = heap[a];
        heap[a]=heap[b];
        heap[b]=temp;
    }
}
