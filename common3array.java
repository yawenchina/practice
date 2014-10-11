import java.util.*;
public class findCommon3 {
	public static void main(String args[]){
		int[] a = {1,2,3,4,5};
		int[] b = {2,3,4,5,6};
		int[] c = {3,4,5,6,7};
		print(findCommon(a,b,c));
	}
	public static ArrayList<Integer> findCommon(int[] a , int[] b , int[] c){
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(a == null || c == null || b == null){
			return null;
	}
	if(a.length == 0 || b.length == 0 || c.length == 0){
		return null;
	}
		int sizeA = a.length;
		int sizeB = b.length;
		int sizeC = c.length;
		int a1 = 0;
		int b1 = 0;
		int c1 = 0;
		while(a1 < sizeA && b1 < sizeB && c1 < sizeC){
			if((a[a1] == b[b1]) &&(a[a1] == c[c1])){
				result.add(a[a1]);
				a1++;
				b1++;
				c1++;
	}else if((a[a1] < b[b1]) || (a[a1] < c[c1]))	{
		a1++;
	}else if ((b[b1]< c[c1]) || (b[b1] < a[a1])){
		b1++;
	}else{
		c1++;
	}
	}
	return result;




	}
	public static void print(ArrayList<Integer> result){
		for(int i : result){
			System.out.print(i);
		}
	}

}
