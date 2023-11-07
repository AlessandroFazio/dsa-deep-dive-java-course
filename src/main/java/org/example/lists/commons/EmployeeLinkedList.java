package org.example.lists.commons;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode newNode = new EmployeeNode(employee);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.println(current);
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }
        EmployeeNode removedNode = head;
        head = removedNode.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
