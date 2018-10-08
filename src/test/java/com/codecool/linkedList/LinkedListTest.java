package com.codecool.linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test
    void headTest() {
        LinkedList list = createLinkedListWithAlphabet();
        char result = 'A';
        assertEquals(result, list.getHead());
    }

    @Test
    void tailTest() {
        LinkedList list = createLinkedListWithAlphabet();
        char result = 'Z';
        assertEquals(result, list.getTail());
    }

    private LinkedList createLinkedListWithAlphabet() {
        LinkedList list = new LinkedList();
        for (int i = 65; i <= 90; i++) {
            list.add((char)i);
        }
        return list;
    }
}
