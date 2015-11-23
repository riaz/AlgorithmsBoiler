package interviews;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public void search(int[] arr,int start,int end,int num){
		if(start == end){
			System.out.println("Not Found");		
			System.exit(0);
		}
		
		int mid = start + (end - start)/2;
		
		if(arr[mid] == num){
			System.out.println("Found");
			System.exit(0);
		}
		else if(num > arr[mid])
				search(arr,mid+1,end,num);
		else if(num < arr[mid])
				search(arr,start,mid-1,num);
				
	}
	
	public static void main(String[] args){
		int[] arr= {9,19,3,5,2,5,13,78,12,23,0,4,9,15,67,17,1};
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a  number to search");
		int num = s.nextInt();
		
		Arrays.sort(arr);
		new BinarySearch().search(arr, 0 ,arr.length-1,num);	
		s.close();
	}
}
