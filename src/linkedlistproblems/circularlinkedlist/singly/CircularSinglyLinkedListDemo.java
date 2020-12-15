package linkedlistproblems.circularlinkedlist.singly;

import linkedlistproblems.linkedlist.SinglyNode;

public class CircularSinglyLinkedListDemo {

    public static void main(String[] args) {

        CircularSinglyLinkedListHandler listHandler = new CircularSinglyLinkedListHandler();

        listHandler.insertAtEnd(new SinglyNode(1));
        listHandler.insertAtEnd(new SinglyNode(2));
        listHandler.insertAtEnd(new SinglyNode(3));
        listHandler.insertAtEnd(new SinglyNode(4));


        listHandler.printFromHead();

        listHandler.addNodeAfterSpecificNode(new SinglyNode(33),4);
        System.out.println("-----------After Update-------------------------------");


        listHandler.printFromHead();


    }
}
