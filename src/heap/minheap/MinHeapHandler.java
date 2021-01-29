package heap.minheap;

public class MinHeapHandler {

    private int[] heap;
    private int size;
    private int maxSize=0;

    public MinHeapHandler(int maxSize) {
        this.maxSize=maxSize;
        this.size=0;
        heap = new int[this.maxSize];
        heap[0] = Integer.MIN_VALUE;
    }

    public void insertValue(int element){

        heap[++size]=element;

        int currentIndex = size;

        while(heap[currentIndex] < heap[getParentIndex(currentIndex)]){
            swap(currentIndex,getParentIndex(currentIndex));
            currentIndex=getParentIndex(currentIndex);
        }
    }


    public void printMinHeap(){
        for(int i=1;i<=(size/2);i++){
            System.out.println("PARENT : "+heap[i]+" LEFT CHILD : "+heap[getLeftChildIndex(i)] +
                    " RIGHT CHILD : "+heap[getRightChildIndex(i)]);
        }
    }

    public void printAllLeafNodes(){
        for(int i=1;i<=size;i++){
            if(getLeftChildIndex(i)>size && getRightChildIndex(i)>size){
                System.out.println(heap[i]);
            }
        }
    }

    public int pollMin(){
        int popped = heap[1];
        heap[1]=heap[size--];
        minHeapify(1);
        return popped;
    }

    private void minHeapify(int pos){

        int number = heap[pos];
        int leftChild = heap[getLeftChildIndex(pos)];
        int rightChild = heap[getRightChildIndex(pos)];

        if(leftChild<rightChild && number>leftChild){
            swap(getLeftChildIndex(pos),pos);
            minHeapify(getLeftChildIndex(pos));
        }else if(number>rightChild){
            swap(getRightChildIndex(pos),pos);
            minHeapify(getRightChildIndex(pos));
        }


    }

    //---------------Helper methods----------------------------------------------
    private void swap(int a,int b){
        int temp = heap[a];
        heap[a]=heap[b];
        heap[b]=temp;
    }

    private int getParentIndex(int pos){
        return pos/2;
    }

    private int getLeftChildIndex(int pos){
        return 2 * pos;
    }

    private int getRightChildIndex(int pos){
        return (2* pos)+1;
    }

}
