package org.example.hashtables.commons;

import org.example.lists.commons.Employee;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.SortedMap;

public class ChainedHashTable {
    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashTable() {
        hashtable = new LinkedList[10];
        for(int i=0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iter = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        while(iter.hasNext()){
            storedEmployee = iter.next();
            if(storedEmployee.key.equals(key)){
                return storedEmployee.employee;
            }
        }
        return null;
    }

    // O(n) in the worst case:
    public Employee remove(String key) {
        int hashedKey = hashKey(key);

        if(hashtable[hashedKey].isEmpty()){
            return null;
        }

        ListIterator<StoredEmployee> iter = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        int index = -1;
        while(iter.hasNext()) {
            storedEmployee = iter.next();
            index++;
            if(storedEmployee.key.equals(key)){
                break;
            }
        }
        if(storedEmployee == null) {
            return null;
        } else {
            hashtable[hashedKey].remove(index);
            return storedEmployee.employee;
        }
    }

    public void printHashTable() {
        for(int i=0; i < hashtable.length; i++) {
            if(hashtable[i].isEmpty()) {
                System.out.println("Position " + i + " is empty");
            } else {
                ListIterator<StoredEmployee> iter = hashtable[i].listIterator();
                while(iter.hasNext()) {
                    System.out.println(iter.next().employee);
                    System.out.println(" -> ");
                }
                System.out.println("null");
            }
        }
    }

    private int hashKey(String key) {
        // return key.length() % hashtable.length;
        return Math.abs(key.hashCode()) % hashtable.length;
    }
}
