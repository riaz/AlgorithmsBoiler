package interviews;

public class MatrixTranspose {
	public int[][] transpose(int[][] arr){
		int[][] res = new int[arr[0].length][arr.length];
		
		for(int i=0;i<arr[0].length;i++){
			for(int j=0;j<arr.length;j++){
				res[i][j] = arr[j][i];
			}
		}		
		return res;
	}
	
	public static void main(String[] args){
		
		int a[][] = {{1,2,3},
			         {4,5,6},
					 {7,8,9}};
		
		int res[][] = new MatrixTranspose().transpose(a);
		
		for(int i=0;i<res.length;i++){
			for(int j=0;j<res[0].length;j++){
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
