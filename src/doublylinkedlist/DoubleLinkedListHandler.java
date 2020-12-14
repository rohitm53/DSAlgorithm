package doublylinkedlist;

public class DoubleLinkedListHandler {

	private DoublyNode head;
	
	
	public void insertAtEnd(DoublyNode node) {
		
		if(head==null) {
			head=node;
		}else {
			
			DoublyNode next = head;
			DoublyNode prevNode=null;
			while(next.nextNode!=null) {
				prevNode=next;
				next=next.nextNode;
			}
			
			if(prevNode==null) {
				//only one item is available in list
				head.nextNode=node;
				node.prevNode=head;
				
			}else {
				//
				next.nextNode=node;
				node.prevNode=next;
			}
		}
	}
	
	public void insertAtBegining(DoublyNode node) {
		
		if(head==null) {
			head=node;
		}else {
			
			head.prevNode=node;
			node.nextNode=head;
			
			head = node;
			
		}
	}
	
	public void addNodeAdjectToElement(DoublyNode node , int elementData,Boolean isBefore) {

		if(head==null){
			System.out.println("Double Linked list is empty");
		}else{

			if(head.data==elementData){

				if(isBefore){
					//Adding element before head
					node.nextNode=head;
					head.prevNode=node;
					head=node;
				}else{
					node.nextNode = head.nextNode;
					node.prevNode=head;
					head.nextNode=node;
				}
			}else{

				DoublyNode currNode  = head;
				while(currNode!=null &&  currNode.data!=elementData){
					currNode = currNode.nextNode;
				}

				if(currNode!=null){

					if(isBefore){
						DoublyNode prev = currNode.prevNode;
						node.nextNode=currNode;
						node.prevNode=prev;
						prev.nextNode=node;
						currNode.prevNode=node;

					}else{
						DoublyNode nextNode = currNode.nextNode;
						node.nextNode=nextNode;
						node.prevNode=currNode;
						currNode.nextNode=node;
						nextNode.prevNode=node;

					}
				}else{
					System.out.println("Provided element is not found in double linked list");
				}
			}
		}
	}


	public void addtAtPosition(DoublyNode node , int position , Boolean isBefore){

		if(head==null){
			System.out.println("Double Linked list is empty");
		}else{

			int counter=1;
			DoublyNode curr = head;
			while(curr.nextNode!=null){

				if(position==counter){
					break;
				}else{
					curr = curr.nextNode;
					counter++;
				}
			}

			if(isBefore){

				DoublyNode prevNode = curr.prevNode;

				prevNode.nextNode=node;
				node.nextNode=curr;
				node.prevNode=prevNode;
				curr.prevNode=node;


			}else{
				DoublyNode nextNode = curr.nextNode;
				node.nextNode=nextNode;
				node.prevNode= curr;
				curr.nextNode=node;
				nextNode.prevNode=node;
			}
		}
	}


	public void printAllNodes(){

		if(head==null){
			System.out.println("Doubly linked list is empty");
		}else{

			System.out.println(head.data);
			DoublyNode curr = head.nextNode;
			while (curr!=null){
				System.out.println(curr.data);
				curr = curr.nextNode;
			}
		}
	}
}
