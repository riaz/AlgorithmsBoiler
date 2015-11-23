package intro;

import java.io.File;

import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.StdOut;

public class FileSorter {
	public static void main(String[] args){
		
		if(args.length <= 0){
			System.out.println("OP Failed : Please enter a folder in the fs as parameter");			
			System.exit(0);
		}
		
		File directory = new File(args[0]);
		
		String[] files = directory.list();
		
		Insertion.sort(files);
		
		StdOut.println("The contents of this folder in sorted order is:");
		for(String s: files){
			StdOut.println(s);
		}
	}
}
