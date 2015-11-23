package intro;

public class LinkedQueueOfStrings {
	
	private Node first = null;
	private Node last = null;
	
	private class Node{
		String item;
		Node next;		
	}
	
	public void enqueue(String s){
		//Add a node to the last, and last to this new node
		Node oldNode = last;
		last = new Node();
		last.item = s;
		last.next = null;
		
		if(isEmpty())
			first = last;
		else
			oldNode.next = last;	
	}
	
	public void dequeue(){
		
	}
	
	public boolean isEmpty(){
		return first == null;
	}
		
	public static void main(String args[]){
		
	}
}	
