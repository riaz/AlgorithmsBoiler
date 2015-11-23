package intro;

import edu.princeton.cs.algs4.StdIn;

public class LinkedStackOfStrings {
	
	private Node first = null;
	
	//A linked-list node data-structure
	private class Node{
		String item;
		Node next;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void push(String N){
		Node oldNode = first;
		first = new Node();
		first.item = N;
		first.next = oldNode;
		
		
		//Method 1
//		if(first == null)   //meaning the first element
//		{
//			Node newNode = new Node();
//			newNode.item = N;
//			newNode.next=null;
//			first=newNode;
//		}
//		else{
//			Node newNode = new Node();
//			newNode.item = N;
//			newNode.next = first;
//			first = newNode;
//			
//		}
		
	}
	
	public String pop(){
		String item = first.item;
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
