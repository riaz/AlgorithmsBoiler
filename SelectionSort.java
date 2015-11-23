package interviews;

public class SelectionSort {
	
	public void sort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int temp = arr[i];
			int idx=i;
			for(int j=i+1;j<arr.length;j++){
				if (temp > arr[j]){
					temp = arr[j];
					idx =j;
				}
			}
			
			//swap i with idx if both are different
			if(i!=idx){
				temp = arr[i];
				arr[i]   = arr[idx];
				arr[idx] = temp;
			}			
			
		}
	}
	
	public static void main(String[] args){
		int[] a = {5,1,3,2,4};		
		
		System.out.println("The array before the sort");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		new SelectionSort().sort(a);
		
		
		System.out.println("The array after the sort");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();			
	}
}
