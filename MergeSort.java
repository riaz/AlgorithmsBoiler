package interviews;

public class MergeSort {
	public void merge(int[] arr,int start,int mid,int end){
		
		System.out.println(start);
		System.out.println(mid);		
		System.out.println(end);
		
		int p[] = new int[end];
		for(int i=start;i<=end;i++){
			int j = start;
			int k = mid+1;
			//System.out.println(arr[j]+" "+arr[k]);
			if(j <= mid && k <= end){
				//System.out.println(arr[j]+" "+arr[k]);
				if(arr[j] < arr[k]){
					
					p[i] = arr[j];
					j++;					
				}
				
				if(arr[j] > arr[k]){
					p[i] = arr[k];					
					k++;
				}
			}
			else if( j <= mid ){
				p[i] = arr[j];
				j++;
			}
			else if( k <= end ){
				p[i] = arr[k];
				k++;
			}			
		}
		//Transfering the values from the auxillary array to the main array
		for(int i=start;i<end;i++){
			arr[i] = p[i];
		}
		
	}
	
	
	public void sort(int[] arr,int start,int end){
		
		if(start == end) return;
		int mid = start + (end - start)/2;		
		
		
		System.out.println(">>"+start+" "+mid);
		sort(arr,start,mid);
		
		System.out.println(">>"+(mid+1)+" "+end);		
		sort(arr,mid+1,end);	
		
		
		merge(arr,start,mid,end);
		
	}
	
	public static void main(String[] args){
		int[] a = {5,1};
		
		System.out.println("The array before the sort");
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		new MergeSort().sort(a,0,a.length);
		
		System.out.println("The array after the sort");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();		
	}
}
