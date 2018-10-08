package com.codecool.linkedList;

public class LinkedList {
    private int length;
    private Node head;

    public void add(Object data) {
        if (head == null) {
            head = new Node(data);
        }

        Node newNode = new Node(data);
        Node current = head;

        if (current != null) {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        length++;
    }

    public Object get(int index) {
        Node current = null;

        if (head != null) {
            current = head.getNext();
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null) {
                    return null;
                }
                current = current.getNext();
            }
            return current.getData();
        }
        return current;
    }

    public Object getHead() {
        return this.head.getData();
    }

    public Object getTail() {
        return get(this.length - 1);
    }
}
