package interviews;

public class InsertionSort {
	public static void main(String[] args){
		int[] arr = {9,8,7,6,5,4,3,2,1};
		
		for (int i=1;i<arr.length;i++)
		{
			int k = i-1;   //Storing 
			int p = arr[i]; 
			if(arr[k] > p){
				while(k>=0 && arr[k] > p){
					arr[k+1] = arr[k];
					k--;
				}
				arr[k+1] = p;
			}
		}
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + ",");
		}
		
	}
}
