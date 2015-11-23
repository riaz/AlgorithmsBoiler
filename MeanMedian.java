package interviews;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MeanMedian {
	public void median(int[] arr){
		Arrays.sort(arr);
		int med =  arr.length/2;
		
		System.out.println(arr[med]);
	}
	
	public void mean(int[] arr){
		int sum=0;
		double res;
		
		for(int i=0;i<arr.length;i++)
			sum += arr[i];
		
		res = sum/arr.length;
		System.out.println(res);
	}
	
	public static void main(String[] args) throws IOException{
		
		MeanMedian mm = new MeanMedian();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the numbers to find : (1)Mean or (2) Median");
		int N = Integer.parseInt(br.readLine());
		
		int list[] = new int[N];
		
		for(int i=0;i<N;i++)
			list[i] = Integer.parseInt(br.readLine());
		
		System.out.println("Mean is:");
		mm.mean(list);
		
		System.out.println("Median is:");
		mm.median(list);		
		
	}
}	
