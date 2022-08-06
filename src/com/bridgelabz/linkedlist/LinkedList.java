package com.bridgelabz.linkedlist;

public class LinkedList<E> {

    Node<E> head;
    Node<E> tail;

    public void add(E key) {
        Node<E> newNode = new Node<>(key);
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
            System.out.print(temp.key);
            temp = temp.next;
            if(temp != null){
                System.out.print("->");
            }
        }

    }

    public void append(E key) {

        Node<E> newNode = new Node<>(key);
        if(tail== null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    public void insert(E searchKey,E insertKey) {

        Node<E> insertNode=new Node<>(insertKey);
        Node<E> temp=head;

        while(temp!=null){

            if(temp.key==searchKey){

                  insertNode.next = temp.next;
                  temp.next = insertNode;
                break;

            }
            temp=temp.next;
        }

    }


    public void pop() {
        Node<E> temp = head;
        temp.key = head.key;
        head = head.next;
        temp=null;
    }

    public void popLast() {
        Node<E> temp = head;
        Node<E> beforeTemp = null;

        if (head == tail) {

            head = null;
            tail = null;

        }else{

            while(temp!=null){

                if(temp == tail){

                    beforeTemp.next = null;
                    tail = beforeTemp;
                }
                beforeTemp = temp;
                temp = temp.next;
            }

        }



    }



}
