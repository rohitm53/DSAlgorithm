package heap.maxheap;

public class MaxHeapDriver {

    public static void main(String[] args) {

        int size = 50;
        MaxHeapHandler maxHeapHandler = new MaxHeapHandler(size);

        maxHeapHandler.insertValue(1);
        maxHeapHandler.insertValue(2);
        maxHeapHandler.insertValue(3);
        maxHeapHandler.insertValue(4);
        maxHeapHandler.insertValue(5);
        maxHeapHandler.insertValue(6);
        maxHeapHandler.insertValue(7);
        maxHeapHandler.insertValue(8);
        maxHeapHandler.insertValue(9);
        maxHeapHandler.insertValue(10);
        maxHeapHandler.insertValue(100);
        maxHeapHandler.insertValue(200);
        maxHeapHandler.printHeap();

        System.out.println("Removing Top value : "+maxHeapHandler.pollMax());
        maxHeapHandler.printHeap();
    }

}
