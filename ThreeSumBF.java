package intro;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;


public class ThreeSumBF {
	public static int count(int[] arr){
		int N = arr.length;
		int count = 0;
		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				for(int k=j+1;k<N;k++){
					if(arr[i] + arr[j]+arr[k]==0) count++;
				}
			}
		}
		return count;
	}

	
	public static void main(String[] args){
		@SuppressWarnings("deprecation")
		int[] a = In.readInts(args[0]);
		StdOut.println(count(a));		
	}
}
