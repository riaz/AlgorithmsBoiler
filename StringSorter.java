package intro;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Insertion;
//import edu.princeton.cs.algs4.StdIn;

public class StringSorter {
	public static void main(String[] args){
		
		assert args.length > 0 ;
		@SuppressWarnings("deprecation")
		String[] strings = In.readStrings(args[0]);
		
		Insertion.sort(strings);
		
		for(String s:strings)
			System.out.println(s);
	}
}
