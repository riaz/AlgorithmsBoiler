package interviews;

public class QuickSortExample {
	
	public void QuickSort(int[] arr,int start,int end){
		
		//this is the recursion termination condition
		if(start == end)
			return; //do nothing end the recursion tree
		else{
			int pivot = end;
			int elem = arr[pivot];
			//partition the elements accordingly
			//the pivot index partitions stuff
			//so call
			for(int i=end-1;i>=0;i--){
				if(arr[i] > elem ) {
					int temp = arr[i];
					int j = i;
					
					while(j<pivot-1){
						arr[j] = arr[j+1];
						j++;
					}
					pivot = pivot-1;
					arr[pivot] = elem;
					arr[pivot+1] = temp;		
				}
			}
			
			QuickSort(arr,start,pivot-1);
			QuickSort(arr,pivot+1,end);
		}
		
				
	}
	
	public static void main(String[] args){
		int[] a = {5,1,3,2,4};		
		
		System.out.println("The array before the sort");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		new QuickSortExample().QuickSort(a,0,a.length-1);
		
		System.out.println("The array after the sort");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
	}
}
