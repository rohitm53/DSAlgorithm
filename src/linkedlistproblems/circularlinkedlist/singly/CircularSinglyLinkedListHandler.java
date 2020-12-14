package linkedlistproblems.circularlinkedlist.singly;

import linkedlistproblems.linkedlist.SinglyNode;

public class CircularSinglyLinkedListHandler {

    private SinglyNode head;
    private SinglyNode tail;

    public void insertAtEnd(SinglyNode singlyNode){

        if(head==null){
            // Circular linked list is empty
            singlyNode.next = singlyNode;
            head=tail=singlyNode;
        }else{
            SinglyNode currentNode = head;
            while(currentNode.next!=head){
                currentNode = currentNode.next;
            }
            currentNode.next=singlyNode;
            singlyNode.next=head;
            tail=singlyNode;
        }
    }


    public void addNodeAfterSpecificNode(SinglyNode node , int nodeDataValue){

        if(head==null){
            System.out.println("Circular linked list is empty");
        }else{
            SinglyNode curr = head;
            while(curr.next!=head){
                if(curr.data==nodeDataValue){
                    break;
                }
                curr=curr.next;
            }
            if(curr!=tail){
                SinglyNode nextNode = curr.next;
                curr.next=node;
                node.next=nextNode;
            }else{
                curr.next=node;
                node.next=head;
                tail=node;
            }
        }
    }


    public void deleteNode(int nodeDataValue){

        if (head==null){
            System.out.println("Circular Linked list is empty");
        }else{

            SinglyNode curr = head;
            SinglyNode prev=head;
            while (curr.next!=head){
                if(curr.data==nodeDataValue){
                    break;
                }
                prev=curr;
                curr=curr.next;
            }
            if(curr!=head){
                // means we did not reached upto head , we got our required node
                prev.next=curr.next;

            }else{
                if(curr==head && head.data==nodeDataValue){
                    head=null;
                }else{
                    System.out.println("Provided node is not available");
                }
            }
        }

    }


    public void printFromHead(){
        if(head==null){
            System.out.println("Circular linked list is empty");
        }else{

            System.out.println(head.data);
            SinglyNode currentNode = head.next;
            while(currentNode!=head){
                System.out.println(currentNode.data);
                currentNode=currentNode.next;
            }
        }
    }



}
