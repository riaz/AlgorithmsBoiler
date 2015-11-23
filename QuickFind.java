package intro;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;


public class QuickFind {
	private int items[];
	private int count; //this is the count of the number of components
	
	public QuickFind(int N){
		items = new int[N];
		for(int i=0;i<N;i++){
			items[i] = i;
		}
		count = N;
	}
	
	private void validate(int p){ //validates that p is a valid index
		if(p<0 || p >= items.length)
			throw new IndexOutOfBoundsException("Index " + p + "is not with in the range of 0 and " + items.length);
	}
	
	public int find(int p){
		validate(p);
		return items[p];
	}
	
	public int components(){
		return count;
	}
	
	public boolean isConnected(int p,int q){
		validate(p);
		validate(q);
		return items[p] == items[q];
	}
	
	public void union(int p,int q){ //all the items[p] becomes items[q]
		validate(p);
		validate(q);
		
		int x = items[p];
		int y = items[q];
		
		if(x==y) return; //they belong to the same connected component , also isConnected(p,q) could be used
		
		for(int i=0;i<items.length;i++){
			if(items[i]==x) //change to y
				items[i] = y;
		}
		
		//a union operation decreases the count
		count--;
	}
	
	public void displayItems(){
		System.out.print("\nItems Array : ");
		for(int i=0;i<items.length;i++){
			StdOut.print(items[i] + " ");
		}
		StdOut.println();
	}
	
	public static void main(String args[]){
		//StdOut.println("HelloWorld");
		
		int N = StdIn.readInt();
		
		QuickFind obj = new QuickFind(N);
		while(!StdIn.isEmpty()){
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			
			obj.union(p,q); 
			
		}
		obj.displayItems();
		//StdOut.println("Number of connected components: " + obj.components());		
		
	}
}
