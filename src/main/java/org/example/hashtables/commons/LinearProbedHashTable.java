package org.example.hashtables.commons;

import org.example.lists.commons.Employee;

public class LinearProbedHashTable {
    private StoredEmployee[] hashtable;

    public LinearProbedHashTable() {
        hashtable = new StoredEmployee[10];
    }

    // doesn't handle collisions
    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);

        if(isOccupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (isOccupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if(isOccupied(hashedKey)) {
            System.out.println("Sorry there's already an employee at position " + hashedKey);
        } else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    // 0(1) because under the hood we are just using array indexing
    public Employee get(String key) {
        int hashedKey = findKey(key);

        if(hashedKey == -1) {
            return null;
        }

        return hashtable[hashedKey].employee;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);

        if(hashtable[hashedKey] != null &&
                hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if(hashedKey == hashtable.length -1 ) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashtable[hashedKey] != null &&
                !hashtable[hashedKey].key.equals(key) &&
                    hashedKey != stopIndex) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if(hashtable[hashedKey] != null &&
                hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }
        return -1;
    }

    public void printHashTable() {
        for(int i=0; i < hashtable.length; i++) {
            if(hashtable[i] == null) {
                System.out.println("empty");
            } else {
                System.out.println("Position " + i + ": " + hashtable[i].employee);
            }
        }
    }

    public Employee remove(String key) {
        int hashedKey = findKey(key);

        if(hashedKey == -1) {
            return null;
        }

        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;

        StoredEmployee[] oldHashTable = hashtable;
        hashtable = new StoredEmployee[oldHashTable.length];

        for(int i = 0; i < oldHashTable.length; i++) {
            if(oldHashTable[i] != null) {
                put(oldHashTable[i].key, oldHashTable[i].employee);
            }
        }
        return employee;
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    private boolean isOccupied(int index) {
        return hashtable[index] != null;
    }
}
