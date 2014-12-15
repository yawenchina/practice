
public class palidrom {
	public static void main(String args[]){
		String m = "sdfasklm";
		System.out.print(palidrom(m));
	}
	public static int palidrom (String m) {
		int size = m.length();
		int[][] dp  = new int[size][size];
		for(int i = 0; i < size-1; i++){
			dp[i][i] = 0;
			if(m.charAt(i) == m.charAt(i+1)){
				dp[i][i+1] = 0;
			}else{
				dp[i][i+1] = 1;
			}
		}
		
		for(int i = 0; i < size;i++){
			for(int j = i+1; j < size;++j){
				if(m.charAt(i) == m.charAt(j)){
					dp[i][j] = dp[i+1][j-1];
				}else{
					dp[i][j] = Math.min(dp[i+1][j],dp[i][j-1])+1;
				}
			}
		}
		return dp[0][size-1];
	}
}
