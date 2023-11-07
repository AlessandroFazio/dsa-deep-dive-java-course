package org.example.lists;

import org.example.lists.commons.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void run() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add( new Employee("Merit", "Smith", 13));
        employeeList.add(new Employee("Marc", "Miguel", 14));
        employeeList.add(new Employee("Mirko", "Vaginetti", 99));

        employeeList.forEach(System.out::println);

        System.out.println();
        System.out.println(employeeList.get(1));

        System.out.println();
        System.out.println(employeeList.isEmpty());

        System.out.println();
        employeeList.set(0, new Employee("John", "Doe", 458));
        employeeList.forEach(System.out::println);

        System.out.println();
        System.out.println("Added employees in the list: " + employeeList.size());

        System.out.println();
        employeeList.add(3, new Employee("John", "Doe", 4532));
        employeeList.forEach(System.out::println);

        System.out.println();
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee: employeeArray){
            System.out.println(employee);
        }
        System.out.println();
        System.out.println(employeeList.contains(new Employee("Merit", "Smith", 13)));

        System.out.println();
        System.out.println(employeeList.indexOf(new Employee("Merit", "Smith", 13)));

        System.out.println();
        employeeList.remove(2);
        employeeList.forEach(System.out::println);
    }
}
