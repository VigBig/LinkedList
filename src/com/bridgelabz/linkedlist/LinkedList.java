package com.bridgelabz.linkedlist;

public class LinkedList<E> {

    Node<E> head;
    Node<E> tail;

    public void add(E data) {
        Node<E> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display(){
        Node<E> temp = head;

        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
            if(temp != null){
                System.out.print("->");
            }
        }

    }

    public void append(E data) {

        Node<E> newNode = new Node<>(data);
        if(tail== null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }

    }
}
