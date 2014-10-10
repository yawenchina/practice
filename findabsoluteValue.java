
public class findAbsoluteValue {
		public static void main(String args[]){
			int[] a = {1,2,3,4,5,6,7};
			int[] b = {2,4,6,8,10,12};
			int[] c = {4,6,9,12,14,222};
			find(a, b, c);

		}
		public static void find(int[] a, int[] b, int[] c){
			int i = 0;
			int j = 0;
			int k = 0;
			int min = -1;
			int max = Math.abs(a[0]-b[0])+ Math.abs(a[0]-c[0])+ Math.abs(c[0]-b[0]);
			while(i < a.length &&  j < b.length && k < c.length){
				max = Math.min((Math.abs(a[i]-b[j])+ Math.abs(a[i]-c[k])+ Math.abs(c[k]-b[j])),max);
				System.out.print(max);
				if(a[i] <= b[j] && a[i] <= c[k]){
					i++;
	}else if(b[j] <= a[i] && b[j] <= c[k]){
		j++;
	}else{
		k++;
	}
	}
	

	}
		

}
