package org.example.hashtables;

import org.example.hashtables.commons.Employee;

import java.util.*;

public class RemoveDuplicates {
    public static void run(){
        Employee employee1 = new Employee("Jane", "Jones", 123);
        Employee employee2 = new Employee("Mathy", "Mino", 22);
        Employee employee3 = new Employee("Matilde", "Giancarli", 78);
        Employee employee4 = new Employee("Joyce", "Back", 123);

        List<Employee> employeeList = new LinkedList<Employee>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        List<Employee> toRemove = new ArrayList<>();
        Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
        for(Employee employee: employeeList) {
            if(employeeMap.containsKey(employee.getId())){
                toRemove.add(employee);
            } else {
                employeeMap.put(employee.getId(), employee);
            }
        }
        for(Employee employee: toRemove) {
            employeeList.remove(employee);
        }

        for(Employee employee: employeeList) {
            System.out.println(employee);
        }
    }
}
