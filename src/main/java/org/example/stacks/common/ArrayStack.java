package org.example.stacks.common;

import org.example.lists.commons.Employee;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    // O(n) for pushing into the stack array
    public void push(Employee employee) {
        if(top == stack.length) {
            // need to resize the backing array
            Employee[] newArray = new Employee[2*stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = employee;
    }
    // O(n) if pop implementation cares about resizing the array
    // O(1) otherwise (here the case)
    public Employee pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    // O(1)
    public Employee peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public int getSize(){
        return top;
    }

    public void printStack() {
        for(int i= top-1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
