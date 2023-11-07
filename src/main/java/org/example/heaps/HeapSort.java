package org.example.heaps;

import org.example.heaps.commons.MaxHeap;

public class HeapSort {
    public static void run() {
        MaxHeap heap = new MaxHeap(10);

        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        int[] sortedArray = heapSort(heap);

        System.out.print("Sorted array: ");
        for(int i=0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + ", ");
        }
    }

    public static int[] heapSort(MaxHeap heap) {
        int unsortedPartitionIndex = heap.getSize();
        int[] sortedArray = new int[unsortedPartitionIndex];
        while(unsortedPartitionIndex - 1 > 0) {
            sortedArray[--unsortedPartitionIndex] = heap.delete(0);
        }
        return sortedArray;
    }
}
