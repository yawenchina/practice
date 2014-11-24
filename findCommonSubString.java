
public class findCommonSubstring {
	public static void main(String args[]){
		String S = "xabxa";
		String T = "babxba";
		System.out.print(findLCS(S, T));
		
	}
	public static int findLCS (String S, String T) {
		if (S == null || S.length() == 0 || T == null || T.length() == 0) {
			return 0;
	}
	int[][] dp = new int[S.length()][T.length()];
	// initail state
	int max = 0;
	for (int i = 0; i < S.length(); i++) {
		for (int j = 0; j < T.length(); j++) {
		  if (S.charAt(i) == T.charAt(j)) {
		    if ((i == 0) || (j == 0))
		       dp[i][j] = 1;
		    else
		       dp[i][j] = 1 + dp[i - 1][j - 1];
		    	max = Math.max(max, dp[i][j]);
		 
		   
		  }
		}
	}
		return max; 
	}

}
