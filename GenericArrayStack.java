package intro;

import edu.princeton.cs.algs4.StdIn;

public class GenericArrayStack<Item> {
    private Item[] stack;
	private int top;
	
	public GenericArrayStack(int N){
		//Note: Java doesn't allow array type forgenerics, so we dependon type cast operation
		stack = (Item[]) new Object[N]; //defines a stack of size N
		top=-1;
	}
	
	public void pop(){
		System.out.println(stack[top--]);
	}
	
	public void push(Item val){		
		stack[++top] = val;
	}
	
	public void display(){
		for(int i=0;i<=top;i++){
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args){
		GenericArrayStack ss = new GenericArrayStack(100);
	    
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


	
