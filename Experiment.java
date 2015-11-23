package intro;

import edu.princeton.cs.*;
import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.StdRandom;

public class Experiment {
	public static void main(String[] args){
		int N = Integer.parseInt(args[0]); //this will hold the numbers to be randomized
		
		Double[] a = new Double[N];
		
		for(int i=0;i<N;i++)
			a[i] = StdRandom.uniform();
		
		Insertion.sort(a);
		
		for(int i=0;i<N;i++)
			System.out.println(a[i]);
			
	}
}
