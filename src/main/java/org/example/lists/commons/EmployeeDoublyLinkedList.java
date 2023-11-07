package org.example.lists.commons;

import org.w3c.dom.Node;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public EmployeeNode addToFront(Employee employee) {
        EmployeeNode newNode = new EmployeeNode(employee);
        newNode.setNext(head);

        if(!isEmpty()) {
            head.setPrevious(newNode);
        } else {
            tail = newNode;
        }
        head = newNode;
        size++;
        return newNode;
    }

    public EmployeeNode getHead() {
        return head;
    }

    public EmployeeNode getTail() {
        return tail;
    }

    public EmployeeNode removeFromFront() {
        if(isEmpty()){
            return null;
        }
        EmployeeNode removedNode = head;
        head = removedNode.getNext();

        if(head != null) {
            head.setPrevious(null);
        } else {
            tail = null;
        }

        removedNode.setNext(null);
        size--;
        return removedNode;
    }

    public EmployeeNode addToEnd(Employee employee) {
        EmployeeNode newNode = new EmployeeNode(employee);
        newNode.setNext(null);
        newNode.setPrevious(tail);

        if(!isEmpty()) {
            tail.setNext(newNode);
        } else {
          head = newNode;
        }

        tail = newNode;
        size++;
        return newNode;
    }

    public EmployeeNode removeFromEnd() {
        if(isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = tail;
        tail = removedNode.getPrevious();

        if(tail == null) {
            head = null;
        } else {
            tail.setNext(null);
            removedNode.setPrevious(null);
        }

        size--;
        return removedNode;
    }

    public boolean addBefore(Employee employee, Employee nextEmployee) {
        if(isEmpty()) {
           return false;
        }
        EmployeeNode nextNode = head;
        while(nextNode != null) {
            if(nextNode.getEmployee().equals(nextEmployee)){
                break;
            }
            nextNode = nextNode.getNext();
        }
        if(nextNode == null) {
            return false;
        }

        EmployeeNode newNode = new EmployeeNode(employee);
        EmployeeNode prevNode = nextNode.getPrevious();
        newNode.setNext(nextNode);
        newNode.setPrevious(prevNode);

        if(prevNode == null) {
            head = newNode;
        } else {
            prevNode.setNext(newNode);
        }

        nextNode.setPrevious(newNode);
        size++;
        return true;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while(current != null) {
            System.out.print(current);
            if(current.getNext() != null) {
                System.out.print(" <-> ");
            }
            current = current.getNext();
        }
        System.out.println(" <- TAIL ");
    }
}
