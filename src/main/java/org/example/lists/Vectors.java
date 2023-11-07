package org.example.lists;

import org.example.lists.commons.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Vectors {
    public static void run() {
        List<Employee> employeeList = new Vector<>( );
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add( new Employee("Merit", "Smith", 13));
        employeeList.add(new Employee("Marc", "Miguel", 14));
        employeeList.add(new Employee("Mirko", "Vaginetti", 99));
    }
}
