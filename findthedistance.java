
public class findShortestDistance {
	public static void main(String args[]){
		int[] A = {1, 2, 3, 4, 3, 1, 5, 6, 1};
		int a = -1;
		int b = -1;
		int i= 0;
		int distance = Integer.MAX_VALUE;
		while(i < A.length ){	
			if(A[i] == 1){
				a = i;
				if(b != -1){
					distance = Math.min(distance, Math.abs(a-b));
	}
	}else if(A[i] == 3){
		b = i;
		if(a != -1){
					distance = Math.min(distance, Math.abs(a-b));

	}
	}
			i++;
	}
		System.out.print( distance);


	}

}
