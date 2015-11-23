package intro;

import edu.princeton.cs.algs4.StdIn;

public class ResizingStackOfStrings {
	private String stack[];
	private  int top=-1;
	
	ResizingStackOfStrings(){
		//initializing with a stack size of 2 at the beginning , every time when it meets the limit we resize by 2.
		stack = new String[2];
	}
	
	public void push(String s){
		if(stack.length-1 == top){
			resize(2*stack.length);
		}
		stack[++top] = s;
		System.out.println("Item : "+ s + " inserted into Stack");
	}
	
	public void resize(int N){
		String[] newStack= new String[N];
		for(int i=0;i<stack.length;i++){
			newStack[i] = stack[i];
		}
		stack = newStack;
	}
	
	public String pop(){
		if(top <= stack.length/4){
			resize(stack.length/2);
		}
		String item = stack[top--];
		System.out.println("Item : "+ item + " popped from Stack");
		return item;		
			
	}
	
	public void display(){
		for(int i=0;i<=top;i++){
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		ResizingStackOfStrings ss = new ResizingStackOfStrings();
	    
		while(!StdIn.isEmpty()){
			String s = StdIn.readString();
			
			if(!s.equals("-"))
				ss.push(s);
			else
				ss.pop();		    			
		}
		
		ss.display();
	
	}
}
