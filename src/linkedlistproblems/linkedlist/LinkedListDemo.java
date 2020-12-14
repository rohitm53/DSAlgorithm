package linkedlistproblems.linkedlist;

public class LinkedListDemo {
	
	
	public static void main(String[] args) {
		
		
		LinkedListHandler linkedListHandler = new LinkedListHandler();
		
		linkedListHandler.insert(new SinglyNode(1));
		linkedListHandler.insert(new SinglyNode(2));
		linkedListHandler.insert(new SinglyNode(3));
		linkedListHandler.insert(new SinglyNode(4));
		linkedListHandler.insert(new SinglyNode(5));
		linkedListHandler.insert(new SinglyNode(6));
		linkedListHandler.insert(new SinglyNode(7));
//		
		System.out.println("--------------------------------------------------");
		
		
		linkedListHandler.printLinkedList();
		
		linkedListHandler.deleteNodeAtPosition(1);
	
		linkedListHandler.printLinkedList();
	}


}
