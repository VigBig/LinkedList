package com.bridgelabz.linkedlist;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @Test
    public void testSearchElementExists() {

        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(70);
        linkedList.add(30);
        linkedList.add(56);

        boolean actual = linkedList.search(30);
        assertEquals(true,actual);
    }

    @Test
    public void testSearchElementDoesNotExist() {

        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(70);
        linkedList.add(30);
        linkedList.add(56);

        boolean actual = linkedList.search(97);
        assertEquals(false,actual);
    }

    @Test
    public void testInsert40after30() {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(70);
        linkedList.add(30);
        linkedList.add(56);
        linkedList.insert(30,40);

        String actual = linkedList.linkedListAsString();
        assertEquals("56->30->40->70",actual);
    }
}