package interviews;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PascalsTriangle {
	public void pascal(int n){
		int arr[][] = new int[n][n];
		for(int i=0;i<n;i++){
			if(i==0)
				arr[0][0] = 1;
			else{
				arr[i][0] = arr[i-1][0];
				for(int x=0;x < arr[i-1].length;i++){
					arr[i][x] = arr[i-1][x] + arr[i-1][x+1];
				}
				arr[i][arr[i-1].length] = arr[i-1][arr[i-1].length-1];				
			}
		}
		
		//Printing the pascals triangle
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		new PascalsTriangle().pascal(num);		
		
	}
}
