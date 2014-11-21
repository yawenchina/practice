import java.util.ArrayList;


public class findIncreasing3 {
	public static void main(String args[]) {
		int[] array = {1,6,7,9,2,3,4,5,78};
		int[] dp = new int[array.length];
		int num = 0;
		int result = 0;
		for(int i = 0; i < array.length; i++){
			num = 0;
			for(int j = 0; j < i; j++){
				if(array[j] < array[i] && num < dp[j]){
					num = dp[j];
				}
			}
			dp[i] = num+1;
			result = Math.max(dp[i], result);
		}
		System.out.print(result);
		
		
	}
}
