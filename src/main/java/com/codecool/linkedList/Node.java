package com.codecool.linkedList;

public class Node {
    Node next;
    Object data;

    public Node(Object data) {
        this.next = null;
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getData() {
        return this.data;
    }
}
