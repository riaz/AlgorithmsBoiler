package interviews;

public class Stack {
	private int cap;
	private int top;
	private int[] stack;
	
	public Stack(int cap,int top){
		this.stack=new int[this.cap];
		this.top = top;
	}
	
	public Stack(){
		this.cap = 1000;
		this.top = -1;
		this.stack=new int[this.cap];		
	}
	
	public boolean stackOverflow(int top){
		return top == cap-1;
	}
	
	public boolean stackUnderflow(int top){
		return top==0;
	}
	
	public void push(int data)
	{
		assert stackOverflow(top);
		this.stack[++top] = data;
	}
	
	public void pop()
	{
		assert stackUnderflow(top);
		System.out.println(stack[top]);
		top--;
	}
	
		
	public static void main(String args[]){
		Stack obj = new Stack();
		obj.push(10);
		obj.push(30);
		obj.push(40);
		
		obj.pop();
		obj.pop();
		
		obj.push(20);
		
		obj.pop();
		
		obj.push(60);
		obj.push(50);
		
		obj.pop();
		
			
	}
}
