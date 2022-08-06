package com.bridgelabz.linkedlist;

public class LinkedListMain {

    public static void main(String[] args) {

        System.out.println("Welcome to the Linked List Program");

        System.out.println("Adding elements 70,30,56 to Linked List :");
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(70);
        linkedList.add(30);
        linkedList.add(56);
        System.out.println("Displaying the list of elements :");
        linkedList.display();
        System.out.println();

        System.out.println("Appending elements 56,30,70 to Linked List :");
        LinkedList<Integer> linkedList1 = new LinkedList();
        linkedList1.append(56);
        linkedList1.append(30);
        linkedList1.append(70);
        System.out.println("Displaying the list of elements :");
        linkedList1.display();
        System.out.println();
    }



}
