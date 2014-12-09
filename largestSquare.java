
public class largestSqure {
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
	public static int largestHelper(int[][] array){
		int max = 0;
		int[][] dp = new int[array.length][array[0].length];
		dp[0][0] = array[0][0]
		for(int i = 0; i < array[0].length-1; i++){
			if(dp[0][i] != 0&& array[0][i+1] == 1){
				dp[0][i+1] = dp[0][i]+1;
				max = Math.max(max, dp[0][i+1]);
			}else if(dp[0][i] == 0){
				dp[0][i+1] = array[0][i+1];
			}
		}
		for(int i = 0; i < array.length-1; i++){
			if(dp[i][0] != 0&& array[i+1][0] == 1){
				dp[i+1][0] = dp[i][0]+1;
				max = Math.max(max, dp[i+1][0]);
			}else if(dp[i][0] == 0){
				dp[i+1][0] = array[i+1][0];
			}
		}

		for (int j = 1; j < array.length; j++) {
			for (int k = 1; k < array[0].length; k++) {
				if(array[j][k] == 1){
					dp[j][k] = Math.min(dp[j-1][k-1], Math.min(dp[j][k-1],dp[j-1][k]))+1;
					max = Math.max(max, dp[j][k]);
				}
			}
		}
		return max;
	}
}
