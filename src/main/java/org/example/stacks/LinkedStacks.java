package org.example.stacks;

import org.example.lists.commons.Employee;
import org.example.stacks.common.ArrayStack;
import org.example.stacks.common.LinkedStack;

public class LinkedStacks {
    public static void run() {
        LinkedStack stack = new LinkedStack();

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("Merit", "Smith", 13));
        stack.push(new Employee("Marc", "Miguel", 14));
        stack.push(new Employee("Mirko", "Vaginetti", 99));

        stack.printStack();
        System.out.println();
        System.out.println("Peek" + stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Peek" + stack.peek());

        System.out.println();
        stack.printStack();
    }
}
