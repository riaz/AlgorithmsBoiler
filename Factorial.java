package interviews;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	
	public int factorial(int n){
		if(n==0 || n==1)
			return 1;
		else return n*factorial(n-1);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number whose factorial is to be found");
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(">> " + new Factorial().factorial(n));
		
	}
}
