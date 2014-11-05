public class Solution {
    public int trap(int[] A) {
    	if(A == null || A.length() <= 1){
    		return 0;
    	}
    	int i = 0;
    	while(i < A.length && A[i] == 0){
    		i++;
    	}
    	int sum = 0;
    	Stack<Integer> s = new Stack<Integer>();
    	for(; i < A.length; i++){
    		while(!s.isEmpty() && A[cur] >= A[s.peek()]){
    			int b = s.pop();
    			if(s.isEmpty()){
    				continue;
    			}
    			sum += (cur-s.peek()-1)*(Math.min(A[cur], A[s.peek()])-A[b]);

    		}
    		s.push(i);
    	}

    	return sum;


}