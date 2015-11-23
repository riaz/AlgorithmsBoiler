package interviews;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AmstrongNumber {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int n = Integer.parseInt(br.readLine());
		
		int temp=0;
		int p =n;
		while(n>0){
		 int num = n%10;
		 
		 temp = temp + num*num*num;
		 n = n/10;
		}
		if(p == temp)
			System.out.println(p + " is an amstrong number");
		else
			System.out.println(p + " is not an amstrong number");
	}
}
