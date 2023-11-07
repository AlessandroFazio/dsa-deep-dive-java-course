package org.example.heaps.commons;

public class MaxHeap {
    private int[] heap;
    private int size;

    public MaxHeap(int capacity) {
        heap = new int[capacity];
    }

    public boolean isFull() {
        return size == heap.length;
    }

    // Time complexity: O(1) (for insertion) + O(log2N) (for fixing the MaxHeap above)
    public void insert(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is full");
        }
        heap[size] = value;
        heapify_above(size, value);
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Time Complexity:
    // first case: allow random value deletion: O(N) -> linear search for finding the element
    // second case ( this implementation ): O(log2N) -> allow deletion only with indexes
    public int delete(int index) {
        if (isEmpty()){
            throw new IndexOutOfBoundsException("Heap is empty");
        }
        int parent = getParent(index);
        int deletedValue = heap[index];

        heap[index] = heap[size - 1];

        if(index == 0 || heap[index] < heap[parent]) {
            heapify_down(index, size - 1);
        } else {
            heapify_above(index, heap[size - 1]);
        }

        size--;
        return deletedValue;
    }

    private void heapify_above(int index, int value) {
        if (index == 0 || heap[getParent(index)] >= value) {
            heap[index] = value;
            return;
        }
        int parentIndex = getParent(index);
        heap[index] = heap[parentIndex];
        heapify_above(parentIndex, value);
    }

    private void heapify_down(int index, int lastHeapIndex) {
        int childToSwap;

        while(index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);
            if(leftChild <= lastHeapIndex) {
                if (rightChild > lastHeapIndex) {
                    childToSwap = leftChild;
                } else {
                    childToSwap = heap[leftChild] > heap[rightChild] ? leftChild : rightChild;
                }
                if (heap[index] < heap[childToSwap]) {
                    int tmp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = tmp;
                }
                else {
                    break;
                }
                index = childToSwap;
            }
            else {
                break;
            }
        }
    }

    public int peek(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Heap is empty");
        }
        return heap[0];
    }

    public void sort() {
        int lastHeapIndex = size-1;
        for(int i=0; i < lastHeapIndex; i++) {
            int tmp = heap[0];
            heap[0] = heap[lastHeapIndex - i];
            heap[lastHeapIndex - i] = tmp;

            heapify_down(0, lastHeapIndex - i -1);
        }
    }

    public void printHeap(){
        for(int i = 0; i < size; i++){
            System.out.print(heap[i]);
            System.out.print(", ");
        }
        System.out.println();
    }

    public int getParent(int index) {
        return (index - 1) / 2;
    }

    public int getChild(int index, boolean left) {
        return 2 * index + (left ? 1 : 2);
    }

    public int getSize(){
        return size;
    }
}
