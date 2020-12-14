package linkedlist;

public class LinkedListDemo {
	
	
	public static void main(String[] args) {
		
		
		LinkedListHandler linkedListHandler = new LinkedListHandler();
		
		linkedListHandler.insert(new Node(1));
		linkedListHandler.insert(new Node(2));
		linkedListHandler.insert(new Node(3));
		linkedListHandler.insert(new Node(4));
		linkedListHandler.insert(new Node(5));
		linkedListHandler.insert(new Node(6));
		linkedListHandler.insert(new Node(7));
//		
		System.out.println("--------------------------------------------------");
		
		
		linkedListHandler.printLinkedList();
		
		linkedListHandler.deleteNodeAtPosition(1);
	
		linkedListHandler.printLinkedList();
	}


}
