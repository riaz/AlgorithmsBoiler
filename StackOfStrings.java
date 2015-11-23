package intro;

import edu.princeton.cs.algs4.StdIn;

class StackString{
	private String[] stack;
	private int top;
	
	public StackString(int N){
		stack = new String[N]; //defines a stack of size N
		top=-1;
	}
	
	public void pop(){
		System.out.println(stack[top--]);
	}
	
	public void push(String val){		
		stack[++top] = val;
	}
	
	public void display(){
		for(int i=0;i<=top;i++){
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}
}


public class StackOfStrings {
	
	public static void main(String[] args){
		StackString ss = new StackString(100);
	    
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

