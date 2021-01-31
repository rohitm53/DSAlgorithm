package problems.miscellaneous;

/*
* You are given two non-empty linked lists representing two non-negative integers.
* The digits are stored in reverse order, and each of their nodes contains a single digit.
* Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*
*
* */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AddTwoNumbers {


    public static void main(String[] args) {

//        ListNode l1 = null;
//        //[9,9,9,9,9,9,9]
//        ListNode l1Curr=null;
//        for(int i=1;i<=7;i++){
//            if(l1Curr==null){
//                l1=new ListNode(9);
//                l1Curr = l1;
//            }else{
//                l1Curr.next = new ListNode(9);
//                l1Curr = l1Curr.next;
//            }
//        }
//
//        ListNode l2 = null;
//        ListNode l2Curr=null;
//        for(int i=1;i<=4;i++){
//            if(l2Curr==null){
//                l2=new ListNode(9);
//                l2Curr = l2;
//            }else{
//                l2Curr.next = new ListNode(9);
//                l2Curr = l2Curr.next;
//            }
//        }

        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);


        ListNode result = addTwoNumbers(l1,l2);
        System.out.println(result.toString());

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Queue<Integer> l1Queue = new LinkedList<>();
        Queue<Integer> l2Queue = new LinkedList<>();
        ListNode result  = null;

        while (l1!=null){
            l1Queue.add(l1.val);
            l1=l1.next;
        }
        while (l2!=null){
            l2Queue.add(l2.val);
            l2=l2.next;
        }
        int qoetient=0;
        ListNode current=null;
        while (!l1Queue.isEmpty() && !l2Queue.isEmpty()){
            if(result==null){
                int sum = l1Queue.remove()+l2Queue.remove();
                if(sum>9){
                    int reminder = sum%10;
                    qoetient= sum/10;
                    result = new ListNode(reminder);
                    current=result;
                }else{
                    result = new ListNode(sum);
                    current=result;
                    qoetient=0;
                }
            }else{
                int sum = l1Queue.remove()+l2Queue.remove()+qoetient;
                if(sum>9){
                    int reminder = sum%10;
                    qoetient= sum/10;
                    current.next = new ListNode(reminder);
                    current = current.next;
                }else{
                    current.next = new ListNode(sum);
                    current = current.next;
                    qoetient=0;
                }
            }

            if(l1Queue.isEmpty()  && l2Queue.isEmpty() && qoetient>0){
                current.next = new ListNode(qoetient);
            }
        }

        while(!l1Queue.isEmpty()){
            int sum = l1Queue.remove()+qoetient;
            if(sum>9){
                int reminder = sum%10;
                qoetient= sum/10;
                current.next = new ListNode(reminder);
                current = current.next;
            }else{
                current.next = new ListNode(sum);
                current = current.next;
                qoetient=0;
            }

            if(l1Queue.isEmpty() && qoetient>0){
                current.next = new ListNode(qoetient);
            }
        }

        while(!l2Queue.isEmpty()){
            int sum = l2Queue.remove()+qoetient;
            if(sum>9){
                int reminder = sum%10;
                qoetient= sum/10;
                current.next = new ListNode(reminder);
                current = current.next;
            }else{
                current.next = new ListNode(sum);
                current = current.next;
                qoetient=0;
            }
            if(l2Queue.isEmpty() && qoetient>0){
                current.next = new ListNode(qoetient);
            }
        }

        return result;
    }


     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


}
