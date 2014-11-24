
public class findCommonSubsequence {
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
	for (int i = 0; i < T.length() ; i++) {
		if(S.charAt(0) == T.charAt(i)){
			dp[0][i] = 1;
	}
	}
	for (int j = 0; j < S.length(); j++) {
		if(T.charAt(0) == S.charAt(j)){
			dp[j][0] = 1;
	}
	}
	int max = 0;
	for(int m = 1; m < S.length(); m++){
		for(int n = 1; n < T.length(); n++){
			if(S.charAt(m) == T.charAt(n)){
				dp[m][n] = dp[m-1][n-1]+1;
				
			}else{
				dp[m][n] = Math.max(dp[m-1][n],Math.max(dp[m-1][n-1], dp[m][n-1]));
			}
	}
	}
	return dp[S.length()-1][T.length()-1];
	}
}
