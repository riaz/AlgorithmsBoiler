package intro;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;


public class QuickUnion {
	private int id[];
	private int count;
	
	public QuickUnion(int N){
		id = new int[N];
		for(int i=0;i<N;i++) id[i] = i;
		count = N;
	}
	
	public int root(int p){
		validate(p);
		while(id[p]!=p){
			p = id[p];
		}
		return p;
	}
	
	public boolean isConnected(int p,int q){
		validate(p);
		validate(q);
		return root(p) == root(q);
	}	
	
	public int components(){
		return count;
	}
	
	public void union(int p,int q){
		validate(p);
		validate(q);
		id[p] = root(q);
		count--;
	}
	
	public void validate(int p){
		if(p<0 || p >= id.length) 
			throw new IndexOutOfBoundsException();
	}
	
	public static void main(String[] args){
		int N = StdIn.readInt();
		QuickUnion obj = new QuickUnion(N);
		while(!StdIn.isEmpty()){
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			obj.union(p,q);
		}
		StdOut.println("Number of connected components: " + obj.components());
		
	}
	
	
}
