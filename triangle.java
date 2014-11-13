public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() == 0){
            return 0;
        }
        int n = triangle.size();
        int[][] sum = new int[n][n];
        for(int i = n-1; i >= 0;i--){
            sum[n-1][i] = triangle.get(n-1).get(i);
        }
        for(int i = n-2; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                sum[i][j] = Math.min(sum[i+1][j], sum[i+1][j+1])+triangle.get(i).get(j);
            }
        }
        return sum[0][0];
    }
    
}