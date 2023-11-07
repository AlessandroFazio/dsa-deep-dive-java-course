package org.example.heaps;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void run() {
        Queue<Integer> queue = new PriorityQueue<Integer>();

        queue.add(2);
        queue.add(-22);
        queue.add(2343);
        queue.add(54);
        queue.add(0);
        queue.add(-1);
        queue.add(2);
        queue.add(88);

        System.out.println("Peek" + queue.peek());

        System.out.println("Removed: " + queue.remove());

        System.out.println("Peek" + queue.peek());

        System.out.println("Polled: " + queue.poll());

        System.out.println("Peek: " + queue.peek());

        Object[] ints = queue.toArray();
        for(Object num: ints) {
            System.out.print("num: " + num + ", ");
        }
    }
}
