package problems.miscellaneous;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveNthNodeFromEnd {

    public static void main(String[] args) {

//        ListNode head = new ListNode(10,
//                            new ListNode(20,
//                                    new ListNode(30,
//                                            new ListNode(40,
//                                                    new ListNode(50,
//                                                            new ListNode(60,
//                                                                    new ListNode(70,
//                                                                            new ListNode(80))))))));

        ListNode head = new ListNode(1,null);


        RemoveNthNodeFromEnd removeNthNodeFromEnd = new RemoveNthNodeFromEnd();
        removeNthNodeFromEnd.removeNthFromEnd(head,1);

        ListNode curr = head;
        while (curr!=null){
            System.out.println(curr.val);
            curr = curr.next;
        }




    }
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode curr = head;
        int size = 0;

        while(curr!=null){
            size++;
            curr=curr.next;
        }

        n = size-n+1;
        ListNode prev = null;
        curr = head;
        int count=0;


        while (curr!=null && count<n){
            count++;
            prev = curr;
            curr=curr.next;
        }
        if(curr!=null && prev!=null){
            prev.next = curr.next;
        }

        return head;
    }
}
