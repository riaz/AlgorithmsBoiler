package intro;

import edu.princeton.cs.algs4.*;

/**
 * 
 * @author riaz
 * @description This program is determines the check digit of the 
 */
public class ISBN {
	private final long ISBN; 
	public ISBN(long num){
		ISBN = num;
	}
	
	public void printISBN(){		
		long N = ISBN,sum=0;
		for(int i=2;i<=10;i++){
			sum+= i*(N%10);
			N=N/10;
		}
		StdOut.print(ISBN);
		if(sum%11==0) StdOut.println('0');
		else if(sum%11==1) StdOut.println('X');
		else StdOut.println(11-sum%11);
	}
	
	public static void main(String[] args){
		ISBN newObj = new ISBN(Long.parseLong(args[0]));	
		newObj.printISBN();
	}
}
