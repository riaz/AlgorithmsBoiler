package interviews;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagram {
	//Program to check if two strings are anagram or not
	
	public static void main(String[] args) throws IOException{
		/*
		 * Example:
		 * Input:
		 * ===========
		 * > abba,aabb
		 * > abba,abab
		 * > abba,aaab
		 * 
		 * Output:
		 * ===========
		 * >Yes
		 * >Yes
		 * >No
		 * */
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
			String[] str = br.readLine().split(",");
			
					
			//Step 1:
			int a[] = new int[26];
			
			for(int i=0;i<str[0].length();i++){
				a[str[0].charAt(i)-'a']++;
			}
			
			//Step 2:
			for(int i=0;i<str[1].length();i++){
				a[str[1].charAt(i)-'a']--;
			}
			
			//Step 3
			int count=0;
			for(int i=0;i<a.length;i++){
				if(a[i] == 0) count++;
			}
			
			if(count == a.length)
				System.out.println("String is a anagram");
			else
				System.out.println("String is not a anagram");			
			
		}		
	
}
