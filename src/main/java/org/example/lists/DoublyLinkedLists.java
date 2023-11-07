package org.example.lists;

import org.example.lists.commons.Employee;
import org.example.lists.commons.EmployeeDoublyLinkedList;

public class DoublyLinkedLists {
    public static void run() {
        EmployeeDoublyLinkedList employeeList = new EmployeeDoublyLinkedList();

        System.out.println("list is empty: " + employeeList.isEmpty());
        System.out.println();

        employeeList.addToFront(new Employee("Jane", "Jones", 123));
        employeeList.addToFront(new Employee("Merit", "Smith", 13));
        employeeList.addToFront(new Employee("Marc", "Miguel", 14));
        employeeList.addToFront(new Employee("Mirko", "Vaginetti", 99));

        employeeList.printList();

        System.out.println();
        System.out.println(employeeList.getSize());

        employeeList.removeFromFront();
        System.out.println();
        System.out.println("size of the list: " + employeeList.getSize());

        System.out.println();
        employeeList.printList();

        employeeList.addToEnd(new Employee("Jhonny", "Vanzettini", 99));
        System.out.println();
        employeeList.printList();

        EmployeeDoublyLinkedList newEmployeeList = new EmployeeDoublyLinkedList();
        newEmployeeList.addToEnd(new Employee("Jane", "Jones", 123));
        newEmployeeList.addBefore(
                new Employee("Marcel", "Guler", 129),
                new Employee("Jane", "Jones", 123)
        );

        System.out.println();
        newEmployeeList.printList();

        newEmployeeList.removeFromEnd();

        System.out.println();
        System.out.println("is new list empty: " + newEmployeeList.isEmpty());
        System.out.println("new list head is: " + newEmployeeList.getHead());
        System.out.println("new list head is: " + newEmployeeList.getTail());
    }
}

