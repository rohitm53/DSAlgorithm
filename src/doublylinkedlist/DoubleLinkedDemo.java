package doublylinkedlist;

public class DoubleLinkedDemo {

	public static void main(String[] args) {
		
		
		DoubleLinkedListHandler listHandler = new DoubleLinkedListHandler();
		
		listHandler.insertAtEnd(new DoublyNode(1));
		listHandler.insertAtEnd(new DoublyNode(2));
		listHandler.insertAtEnd(new DoublyNode(3));
		listHandler.insertAtEnd(new DoublyNode(4));
		listHandler.insertAtEnd(new DoublyNode(5));
		listHandler.insertAtEnd(new DoublyNode(6));
		listHandler.insertAtEnd(new DoublyNode(7));

		listHandler.printAllNodes();

		listHandler.addtAtPosition(new DoublyNode(11),5,false);
		System.out.println("--------DoubleLinkedList After Update----------------------");

		listHandler.printAllNodes();

	}

}
