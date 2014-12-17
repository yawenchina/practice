
public class largestSqure2 {
	public static void main(String args[]){
		int[][] array = {
				{0,0,0,0,0,1},
				{0,1,1,1,0,1},
				{1,1,1,1,0,1},
				{1,1,1,1,0,1},
				{1,1,0,1,0,1},	
		};
		System.out.print(largestHelper(array));
	}
	public static void print(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	public static int largestHelper(int[][] array){
		int max = 0;
		int[][] dp = new int[array.length+1][array[0].length+1];

		for (int j = 1; j <= array.length; j++) {
			for (int k = 1; k <= array[0].length; k++) {
				if(array[j-1][k-1] == 1){
					dp[j][k] = Math.min(dp[j-1][k-1], Math.min(dp[j][k-1],dp[j-1][k]))+1;
					max = Math.max(max, dp[j][k]);
				}
			}
		}
		print(dp);
		return max;
	}
}
