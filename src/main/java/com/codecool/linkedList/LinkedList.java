package com.codecool.linkedList;

public class LinkedList {
    private Node head;

    public void add(Object data) {
        if (head == null) {
            head = new Node(data);
        }

        Node temp = new Node(data);
        Node current = head;

        if (current != null) {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(temp);
        }
    }

    public Node getHead() {
        return this.head;
    }
}
