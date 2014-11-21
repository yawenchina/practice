
public class nineCents {
	public static void main(String args[]){
		int[] dp = new int[28];
		dp[0] = 1;
		// 1 2 5 10 25 
		for(int i = 1; i < 28; i++){
			dp[i] = dp[i-1];
			if (i>=2) dp[i]+=dp[i-2];
			if (i>=5) dp[i]+=dp[i-5];
			if (i>=10) dp[i]+=dp[i-10];
			if (i>=25) dp[i]+=dp[i-25];
			
		}
		System.out.print(dp[4]);
	}
}
