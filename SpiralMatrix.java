package interviews;

public class SpiralMatrix {
	public static void main(String[] args){
		int[][] arr = {{1,2,3,4,5},
					   {6,7,8,9,10},
					   {11,12,13,14,15},
					   {16,17,18,19,20},
					   {21,22,23,24,25}};
		
		//Note: arr is matrix , but the number of cols are constant each row
		int rows = arr.length;
		int cols = arr[0].length;
		System.out.println("Matrix : Rows > "+rows+ " Cols : "+ cols);
		
		/*for(int i=0;i<=Math.ceil(Math.max(rows,cols)/2);i++){
			pt = cols;
			for(int p=i;p<pt;p++){
				System.out.print(arr[i][])
			}
		}*/
		
	}
}
