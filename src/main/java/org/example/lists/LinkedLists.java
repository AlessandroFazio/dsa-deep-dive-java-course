package org.example.lists;

import org.example.lists.commons.Employee;
import org.example.lists.commons.EmployeeLinkedList;

public class LinkedLists {
    public static void run() {
        EmployeeLinkedList employeeList = new EmployeeLinkedList();

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
    }
}
