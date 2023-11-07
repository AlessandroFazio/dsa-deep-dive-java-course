package org.example.queues;

import org.example.hashtables.commons.Employee;
import org.example.queues.commons.ArrayQueue;

public class ArrayQueues {
    public static void run() {
        ArrayQueue queue = new ArrayQueue(10);

        queue.add(new Employee("Jane", "Jones", 123));
        queue.add( new Employee("Merit", "Smith", 13));
        queue.add(new Employee("Marc", "Miguel", 14));
        queue.add(new Employee("Mirko", "Vaginetti", 99));

        queue.printQueue();

        queue.remove();

        System.out.println();
        queue.printQueue();
    }
}
