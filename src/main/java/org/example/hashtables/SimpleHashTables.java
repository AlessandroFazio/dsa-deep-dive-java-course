package org.example.hashtables;

import org.example.hashtables.commons.ChainedHashTable;
import org.example.hashtables.commons.LinearProbedHashTable;
import org.example.lists.commons.Employee;

public class SimpleHashTables {
    public static void run(String collision_handling) {
        if(collision_handling.equals("linearProbing")) {
            LinearProbedHashTable hashTable = new LinearProbedHashTable();

            hashTable.put("Jane", new Employee("Jane", "Jones", 123));
            hashTable.put("Merit", new Employee("Merit", "Smith", 13));
            hashTable.put("Marc", new Employee("Marc", "Miguel", 14));
            hashTable.put("Mirko", new Employee("Mirko", "Vaginetti", 99));

            System.out.println();
            hashTable.printHashTable();

            System.out.println();
            System.out.println(hashTable.get("Jane"));

            System.out.println();
            hashTable.put("Jane", new Employee("Jane", "McAllough", 123));
            hashTable.printHashTable();

            hashTable.remove("Mirko");
            System.out.println();
            hashTable.printHashTable();

            hashTable.put("Gino", new Employee("Gino", "MacDonald", 1000));
            System.out.println();
            hashTable.printHashTable();
        } else if (collision_handling.equals("chaining")) {
            ChainedHashTable hashTable = new ChainedHashTable();

            hashTable.put("Jane", new Employee("Jane", "Jones", 123));
            hashTable.put("Merit", new Employee("Merit", "Smith", 13));
            hashTable.put("Marc", new Employee("Marc", "Miguel", 14));
            hashTable.put("Mirko", new Employee("Mirko", "Vaginetti", 99));

            System.out.println();
            hashTable.printHashTable();

            System.out.println();
            System.out.println(hashTable.get("Jane"));

            System.out.println();
            hashTable.put("Jane", new Employee("Jane", "McAllough", 123));
            hashTable.printHashTable();

            hashTable.remove("Mirko");
            System.out.println();
            hashTable.printHashTable();

            hashTable.put("Gino", new Employee("Gino", "MacDonald", 1000));
            System.out.println();
            hashTable.printHashTable();
        }
        else {
            throw new IllegalArgumentException("The only available collision handling for the HashTable are: linearProbing, Chaining. Got %s".formatted(collision_handling));
        }
    }
}
