package interviews;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
	public static void main(String args[]) throws IOException{
		String s;
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a string to find palindrome or not");
		s = br.readLine();
		
		ReverseString rs = new ReverseString();
		if(s.equals(rs.reverse(s.toCharArray()))){
			System.out.println("The String is a palindrome");			
		}
		else{
			System.out.println("The String is not a palindrome");
		}
	}
}
