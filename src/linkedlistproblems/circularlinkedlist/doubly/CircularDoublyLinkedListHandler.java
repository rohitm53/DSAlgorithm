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
            head.prevNode=tail;
        }
    }


    public void insertAtFront(DoublyNode node){

        if(head==null){
            head=tail=node;
            head.nextNode=node;
            head.prevNode=node;
        }else{
            node.nextNode=head;
            node.prevNode=tail;
            head.prevNode=node;
            tail.nextNode=node;
            head=node;
        }
    }

    public void addNodeAtSpecificPosition(int nodeValue,DoublyNode node , boolean isBefore){

        if(head==null){
            System.out.println("Circular linked list is empty");
        }else{

           if(isBefore){
               DoublyNode curr = head;
               if(curr.data==nodeValue){
                   node.nextNode=head;
                   node.prevNode=tail;
                   tail.nextNode=node;
                   head.prevNode=node;
                   head=node;
               }else{
                   curr = head.nextNode;
                   while (curr!=head){
                       if(curr.data==nodeValue){
                           DoublyNode prevNode = curr.prevNode;
                           node.nextNode=curr;
                           node.prevNode=prevNode;
                           prevNode.nextNode=node;
                           curr.prevNode=node;
                           return;
                       }
                       curr=curr.nextNode;
                   }
                   System.out.println("Provided node is not available in circular doubly linked list");
               }
           }else{
               DoublyNode curr = head;
               if(curr.data==nodeValue){
                   DoublyNode nextNode = curr.nextNode;
                   node.nextNode=nextNode;
                   node.prevNode=curr;
                   curr.nextNode=node;
                   nextNode.prevNode=node;
               }else{
                   curr = head.nextNode;
                   while (curr!=head){
                       if(curr.data==nodeValue){
                           DoublyNode nextNode  = curr.nextNode;
                           node.nextNode=nextNode;
                           node.prevNode=curr;
                           curr.nextNode=node;
                           nextNode.prevNode=node;
                           return;
                       }
                       curr=curr.nextNode;
                   }
                   System.out.println("Provided node is not available in circular doubly linked list");
               }
           }
        }
    }

    public void addNodeBesidesLevelFromNode(int nodeDataValue,int level,DoublyNode node,boolean isBefore){

        if(head==null){
            System.out.println("Circular linked list is empty");
        }else{
            DoublyNode reqNode=null;
            if(head.data==nodeDataValue){
                reqNode=head;
            }else{
                DoublyNode curr = head.nextNode;
                while (curr!=head){
                    if(curr.data==nodeDataValue){
                        reqNode=curr;
                        break;
                    }
                    curr=curr.nextNode;
                }
            }
            if(reqNode!=null){
                int counter = 1;
                DoublyNode counterNode = isBefore ? reqNode.prevNode : reqNode.nextNode;
                while (counter!=level){
                    if(isBefore){
                        counterNode=counterNode.prevNode;
                    }else {
                        counterNode=counterNode.nextNode;
                    }
                    counter++;
                }
                if (isBefore) {
                    DoublyNode prevNode = counterNode.prevNode;
                    prevNode.nextNode=node;
                    node.nextNode=counterNode;
                    node.prevNode=prevNode;
                    counterNode.prevNode=node;

                }else{
                    DoublyNode nextNode = counterNode.nextNode;
                    counterNode.nextNode=node;
                    node.nextNode=nextNode;
                    node.prevNode=counterNode;
                    nextNode.prevNode=node;
                }
            }else{
                System.out.println("Provided node not available in Circular Doubly linked list");
            }
        }
    }

    public void deleteNodeByValue(int nodeValue){

        if(head==null){
            System.out.println("Circular linked list is empty");
        }else if(head.data==nodeValue){
            DoublyNode nextNode = head.nextNode;
            nextNode.prevNode=tail;
            tail.nextNode=nextNode;
            head=nextNode;
        }else if(tail.data==nodeValue){
            DoublyNode nextNode = tail.nextNode;
            DoublyNode prevNode = tail.prevNode;

            prevNode.nextNode=nextNode;
            nextNode.prevNode=prevNode;
            tail=nextNode;
        }else{
            DoublyNode curr = head.nextNode;

            while (curr!=head){
                if(curr.data==nodeValue){
                    break;
                }
                curr = curr.nextNode;
            }
            if(curr!=head){
                DoublyNode nextNode = curr.nextNode;
                DoublyNode prevNode = curr.prevNode;

                prevNode.nextNode=nextNode;
                nextNode.prevNode=prevNode;
            }else{
                System.out.println("Node is not available in Circular Doubly Linked list");
            }
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
