
public class find3array {
	public static void main(String args[]){
		int[] a = {1,2,3,4,5,6,7};
		int[] b = {2,4,6,8,10,12};
		int[] c = {3,6,9,12,14,222};
		find(a, b, c, 20);

	}
	public static void find(int[] a, int[] b, int[] c, int target){
		for(int i = 0; i < a.length ;i++){
			pair( b,  c, target-a[i],a[i]);
	}
		
	}
	public static void pair(int[] b, int[] c, int target,int a){
		int start = 0;
		int end = c.length-1;
		while (start < b.length && end >= 0){
			if(b[start] + c[end] ==  target){
				System.out.print(b[start]);
				System.out.print(" ");
				System.out.print(c[end]);
				System.out.print(" ");
				System.out.print(a);
				System.out.println("");
				start++;
				end--;
	}else if(b[start] + c[end] <  target){
		start++;
	}else{
		end--;
	}
	}
		return;


	}

}
