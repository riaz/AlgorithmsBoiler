package interviews;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
	public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N;
			System.out.println("Enter the size of the array:");
			N = Integer.parseInt(br.readLine());
			
			int arr[] = new int[N];
			
			//Populating the values into arr
			for (int i=0;i<N;i++)
			{
				arr[i] = Integer.parseInt(br.readLine());
			}
			
			for(int i=0;i<N-1;i++){
				for(int j=i+1;j<N;j++){
					if(arr[i]>arr[j]){//swap them
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}			
			//Displaying the sorted array
			
			for(int i=0;i<N;i++){
				System.out.print(arr[i]+",");
			}			
	}
}
