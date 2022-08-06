package com.bridgelabz.linkedlist;

public class SortedLinkedList<K extends Comparable<K>> extends LinkedList<K>{

    public void sorting(int linkedListSize){

        Node<K> temp = head;
        Node<K> beforeTemp = null;

        int passNumber = linkedListSize;
        while(temp!=null && passNumber!=0){

            if(beforeTemp!=null){

                if(beforeTemp.key.compareTo(temp.key) > 0 ){

                    K swapKey = beforeTemp.key;
                    beforeTemp.key = temp.key;
                    temp.key = swapKey;

                }
                passNumber--;
            }

            beforeTemp = temp;
            temp = temp.next;
        }

    }

}
