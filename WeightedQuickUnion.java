package intro;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class WeightedQuickUnion {
	private int[] items,size;
	private int count;	
	
	public WeightedQuickUnion(int N){
		items = new int[N];
		size  = new int[N];
		for(int i=0;i<N;i++){
			items[i] = i;
			size[i] = 1;
		}
		count = N;
	}
	
	public void validate(int p)
	{
		if(p < 0 || p > 9)
			throw new IndexOutOfBoundsException();
	}
	
	public boolean isConnected(int p,int q){
		validate(p);
		validate(q);
		return root(p) == root(q);
	}
	
	public int root(int p){
		validate(p);
		while(p!=items[p])
			p= items[p];
		return p;
	}
	
	public void union(int p,int q){
		validate(p);
		int i = root(p);
		int j = root(q);
		
		if(root(p) == root(q)) return;
		
		if(size[i] < size[j]){ // q attaches to p root
			items[i] = j;
			size[j] += size[i];
		}else{
			items[j] = i;
			size[i] += size[j]; 
		}
		count--;
	}
	
	public int components(){
		return count;
	}
	
	public void displayItems(){
		for(int i=0;i<items.length;i++){
			StdOut.print(items[i] + " ");
		}
		StdOut.println();
	}
	
	public static void main(String args[]){
		int N = StdIn.readInt();
		WeightedQuickUnion obj =new WeightedQuickUnion(N);
		
		while(!StdIn.isEmpty()){
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			
			obj.union(p, q);
			
		}
		obj.displayItems();		
//		StdOut.println("No. of connected Components: " + obj.components());
	}
	
}
