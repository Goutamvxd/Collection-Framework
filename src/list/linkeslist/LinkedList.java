package list.linkeslist;

public class LinkedList<T> {
	
	Node<T> head=null;
	Node<T> tail=null;
	
	private Node<T> createNewNode(T element){
		Node<T> newNode=new Node<T>(element);
		return newNode;
	}

}
