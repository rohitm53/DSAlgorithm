package linkedlistproblems.circularlinkedlist.doubly;

import linkedlistproblems.doublylinkedlist.DoublyNode;
import linkedlistproblems.linkedlist.SinglyNode;

public class CircularDoublyLinkedListHandler {

    public DoublyNode head;
    public DoublyNode tail;


    public void insertAtEnd(DoublyNode node){

        if(head==null){
            head=tail=node;
            head.nextNode=node;
            head.prevNode=node;
        }else{
            tail.nextNode=node;
            node.prevNode=tail;
            node.nextNode=head;
            tail=node;
        }
    }


    public void insertAtFront(DoublyNode node){

        if(head==null){
            head=tail=node;
            head.nextNode=node;
            head.prevNode=node;
        }else{
            node.nextNode=head;
            head.prevNode=node;
            tail.nextNode=node;
            node.prevNode=tail;
            head=node;
        }

    }


    public void printFromHead(){

        if(head==null){
            System.out.println("Circular linked list is empty");
        }else{
            System.out.println(head.data);
            DoublyNode curr = head.nextNode;
            while (curr!=head){
                System.out.println(curr.data);
                curr=curr.nextNode;
            }
        }
    }

}
