package linkedlist;

public class LinkedListHandler {
	
	
	public Node head;
	
	
	public void insert(Node node) {
		
		if(head==null) {
			head=node;
		}else {
			
			Node nextNode = head;
			while(nextNode.next!=null) {
				nextNode = nextNode.next;
			}
			nextNode.next=node;
			System.out.println("Inserted node : "+node.data);
		}
	}
	
	
	public void printLinkedList() {
		
		System.out.println("Linked list values");
		
		if(head==null) {
			System.out.println("Linked list is empty");
		}else {
			
			Node node = head;
			while(node!=null) {
				System.out.println(node.data);
				node = node.next;
			}
			
		}
	}
	
	
	public void deleteNodeByDataKey(int dataKey) {
		
		Node currentNode = head,prevNode=null;
		
		if(currentNode==null) {
			System.out.println("Linked list is empty");
		}else {
			
			
			if(currentNode.data==dataKey) {
				head = head.next;
			}else {
				prevNode=head;
				currentNode = head.next;
				while(currentNode!=null &&currentNode.data!=dataKey) {
					prevNode=currentNode;
					currentNode=currentNode.next;
				}
				
				
				if(currentNode!=null) {
					/// node found to delete 
					prevNode.next = currentNode.next;
					currentNode=null;
					
				}else {
					System.out.println("Node is not availaible to delete");
				}
			}
		}
		
	}
	
	public void deleteNodeAtPosition(int position) {
		
		Node currentNode = head;
		Node prevNode=null;
		
		if(position==1 && head!=null) {
			head = head.next;
			System.out.println("Node is deleted at position : "+position);
		}else {
			
			int count=1;
			
			while(currentNode!=null) {
				if(count==position) {
					break;
				}else {
					prevNode = currentNode;
					currentNode = currentNode.next;
					count++;
				}
			}
			
			if(currentNode!=null) {
				prevNode.next=currentNode.next;
				System.out.println("Node is deleted at position : "+position);
			}else {
				System.out.println("Position is greater/less than Linked List");
			}
		}
		
	}

}
