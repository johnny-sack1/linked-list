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

    @Test
    void lengthTest() {
        LinkedList list = createLinkedListWithAlphabet();
        int result = 26;
        assertEquals(result, list.length());
    }

    @Test
    void insertTest() {
        LinkedList list = createLinkedListWithAlphabet();
        list.insert(5, 'A');
        String result = " A B C D E F A G H I J K L M N O P Q R S T U V W X Y Z";
        assertEquals(result, list.toString());
    }

    private LinkedList createLinkedListWithAlphabet() {
        LinkedList list = new LinkedList();
        for (int i = 65; i <= 90; i++) {
            list.add((char)i);
        }
        return list;
    }
}
