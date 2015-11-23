package intro;

import edu.princeton.cs.algs4.StdIn;

public class GenericLinkedList<Item> {
private Node first = null;
	
	//A linked-list node data-structure
	private class Node{
		Item item;
		Node next;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void push(Item N){
		Node oldNode = first;
		first = new Node();
		first.item = N;
		first.next = oldNode;
		
	}
	
	public Item pop(){
		Item item = first.item;
		first = first.next;		
		return item;
	}
	
	public void display(){
		Node dummy = new Node();
		dummy = first;
		while(dummy!=null){
			System.out.println(dummy.item);
			dummy = dummy.next;
		}
	}
	
		
	//Test Client
	public static void main(String[] args){
		LinkedStackOfStrings ss= new LinkedStackOfStrings();
		
		while(!StdIn.isEmpty()){
			String s = StdIn.readString();
//			System.out.println(s);
			
			if(!s.equals("-"))
				ss.push(s);
			else
				ss.pop();		    			
		}
		
		ss.display();
	}	
}
