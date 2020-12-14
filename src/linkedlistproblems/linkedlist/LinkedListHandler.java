package linkedlistproblems.linkedlist;

public class LinkedListHandler {
	
	
	public SinglyNode head;
	
	
	public void insert(SinglyNode singlyNode) {
		
		if(head==null) {
			head= singlyNode;
		}else {
			
			SinglyNode nextSinglyNode = head;
			while(nextSinglyNode.next!=null) {
				nextSinglyNode = nextSinglyNode.next;
			}
			nextSinglyNode.next= singlyNode;
			System.out.println("Inserted node : "+ singlyNode.data);
		}
	}
	
	
	public void printLinkedList() {
		
		System.out.println("Linked list values");
		
		if(head==null) {
			System.out.println("Linked list is empty");
		}else {
			
			SinglyNode singlyNode = head;
			while(singlyNode !=null) {
				System.out.println(singlyNode.data);
				singlyNode = singlyNode.next;
			}
			
		}
	}
	
	
	public void deleteNodeByDataKey(int dataKey) {
		
		SinglyNode currentSinglyNode = head, prevSinglyNode =null;
		
		if(currentSinglyNode ==null) {
			System.out.println("Linked list is empty");
		}else {
			
			
			if(currentSinglyNode.data==dataKey) {
				head = head.next;
			}else {
				prevSinglyNode =head;
				currentSinglyNode = head.next;
				while(currentSinglyNode !=null && currentSinglyNode.data!=dataKey) {
					prevSinglyNode = currentSinglyNode;
					currentSinglyNode = currentSinglyNode.next;
				}
				
				
				if(currentSinglyNode !=null) {
					/// node found to delete 
					prevSinglyNode.next = currentSinglyNode.next;
					currentSinglyNode =null;
					
				}else {
					System.out.println("Node is not availaible to delete");
				}
			}
		}
		
	}
	
	public void deleteNodeAtPosition(int position) {
		
		SinglyNode currentSinglyNode = head;
		SinglyNode prevSinglyNode =null;
		
		if(position==1 && head!=null) {
			head = head.next;
			System.out.println("Node is deleted at position : "+position);
		}else {
			
			int count=1;
			
			while(currentSinglyNode !=null) {
				if(count==position) {
					break;
				}else {
					prevSinglyNode = currentSinglyNode;
					currentSinglyNode = currentSinglyNode.next;
					count++;
				}
			}
			
			if(currentSinglyNode !=null) {
				prevSinglyNode.next= currentSinglyNode.next;
				System.out.println("Node is deleted at position : "+position);
			}else {
				System.out.println("Position is greater/less than Linked List");
			}
		}
		
	}

}
