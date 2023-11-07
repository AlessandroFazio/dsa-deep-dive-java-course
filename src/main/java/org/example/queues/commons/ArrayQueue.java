package org.example.queues.commons;

import org.example.hashtables.commons.Employee;

import java.util.NoSuchElementException;

public class ArrayQueue {
    Employee[] queue;
    int front;
    int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        if(isFull()) {
            int numItems = size();
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length-front, back);
            queue = newArray;

            front = 0;
            back = numItems;
        }

        queue[back] = employee;
        if(back == queue.length - 1) {
            back = 0;
        } else {
            back++;
        }
    }

    public Employee remove() {
        if(isEmpty()) {
            throw new NoSuchElementException("The ArrayQueue is empty. Nothing to remove.");
        }

        Employee removedEmployee = queue[front];
        queue[front] = null;
        front++;
        if(isEmpty()) {
            front = 0;
            back = 0;
        } else if (front == queue.length){
            front = 0;
        }
        return removedEmployee;
    }

    public Employee peek(){
        if(isEmpty()){
            throw new NoSuchElementException("The ArrayQueue is empty. Nothing to remove.");
        }
        return queue[front];
    }

    public boolean isFull(){
        return size() == queue.length - 1;
    }

    public boolean isEmpty() {
        return back == front;
    }

    public int size() {
        if(front <= back) {
            return back - front;
        }
        else {
            return queue.length - front + back;
        }
    }

    public void printQueue() {
        System.out.print("Queue: front -> ");
        if(front <= back) {
            for (int i = front; i < back; i++) {
                System.out.print(queue[i] + ", ");
            }
            System.out.print("<- back");
        }
        else {
            System.out.print("Queue: front -> ");
            for(int i = front; i < queue.length; i++) {
                System.out.print(queue[i] + ", ");
            }
            for(int i = 0; i < back; i++) {
                System.out.print(queue[i] + ", ");
            }
            System.out.print("<- back");
        }
    }
}
