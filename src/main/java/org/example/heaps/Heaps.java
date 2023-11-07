package org.example.heaps;

import org.example.heaps.commons.MaxHeap;

public class Heaps {
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

        heap.printHeap();
        System.out.println();
        System.out.println("The peek (root) is now at: " + heap.peek());

        heap.delete(1);
        heap.printHeap();

        heap.delete(5);
        heap.printHeap();

        System.out.println();
        System.out.println("The peek (root) is now at: " + heap.peek());
    }
}
