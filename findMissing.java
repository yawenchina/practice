
public class findmissing {
	public static void main(String args[]){
		int[] m = {1,2,3,5};
		int[] mm = {2,3,4,5};
		int[] mmm = {1,2,3,4};
		System.out.println(find(m));
		System.out.println(find(mm));
		System.out.println(find(mmm));
	}
	public static int find(int[] m){
		int result = 0;
		for(int i= 0; i < m.length;i++){
			result^=m[i];
			result^=i+1;
		}
		result^=(m.length+1);
		return result;
	}
}
