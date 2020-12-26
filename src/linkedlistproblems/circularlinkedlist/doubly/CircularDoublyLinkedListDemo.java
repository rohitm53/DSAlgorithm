package linkedlistproblems.circularlinkedlist.doubly;

import linkedlistproblems.doublylinkedlist.DoublyNode;

public class CircularDoublyLinkedListDemo {

    public static void main(String[] args) {

        CircularDoublyLinkedListHandler handler = new CircularDoublyLinkedListHandler();

        handler.insertAtEnd(new DoublyNode(1));
        handler.insertAtEnd(new DoublyNode(2));
        handler.insertAtEnd(new DoublyNode(3));
        handler.insertAtEnd(new DoublyNode(4));


        handler.printFromHead();
        handler.addNodeBesidesLevelFromNode(4,2,new DoublyNode(33),false);

        System.out.println("-----------------------Updated value------------------------------");
        handler.printFromHead();

    }

}
