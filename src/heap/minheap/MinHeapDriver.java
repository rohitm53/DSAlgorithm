package heap.minheap;

public class MinHeapDriver {

    public static void main(String[] args) {

        MinHeapHandler minHeapHandler = new MinHeapHandler(50);
        minHeapHandler.insertValue(1);
        minHeapHandler.insertValue(2);
        minHeapHandler.insertValue(3);
        minHeapHandler.insertValue(4);
        minHeapHandler.insertValue(5);
        minHeapHandler.insertValue(6);

        minHeapHandler.printMinHeap();

        System.out.println("--------Updated Heap-----------------------");
        minHeapHandler.pollMin();

        minHeapHandler.printMinHeap();


    }

}
