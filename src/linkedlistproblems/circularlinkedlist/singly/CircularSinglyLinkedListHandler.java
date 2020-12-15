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

            SinglyNode curr = head;
            while(curr.next!=head){
                curr=curr.next;
            }
            curr.next=singlyNode;
            tail=singlyNode;
            tail.next=head;

        }
    }


    public void addNodeAfterSpecificNode(SinglyNode node , int nodeDataValue){

        if(head==null){
            System.out.println("Circular linked list is empty");
        }else{

            SinglyNode curr = head;

            while(curr.data!=nodeDataValue){
                if(curr.next==head){
                    System.out.println("Provided node is not available in list");
                    System.exit(1);
                }
                curr = curr.next;
            }

            if(curr==head && curr.next==head){
                head.next=node;
                node.next=head;
                tail=node;
            }else if(curr==head){
                SinglyNode nextNode = head.next;
                head.next=node;
                node.next=nextNode;
            }else if(curr==tail){
                curr.next=node;
                node.next=head;
                tail=node;
            }else{
                SinglyNode nextNode = curr.next;
                curr.next=node;
                node.next=nextNode;
            }
        }
    }


    public void deleteNode(int nodeDataValue){

        if (head==null){
            System.out.println("Circular Linked list is empty");
        }else {

            SinglyNode curr = head;
            SinglyNode prev=new SinglyNode();

            while(curr.data!=nodeDataValue){
                if(curr.next==head){
                    System.out.println("Provided node is not available in list");
                    System.exit(1);
                }
                prev=curr;
                curr=curr.next;
            }

            if(curr==head && curr.next==head){
                head=tail=null; //only one element available in Circular linked list
            }else if(curr==head){
               head=head.next; //element found at head in Circular linked list
               tail.next=head;
            }else if(curr==tail){
                prev.next=head; //element found in middle of Circular Linked list
                tail=prev;
            }else{
                prev.next=curr.next;
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
