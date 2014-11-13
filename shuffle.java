
public class shuffle {
	public static void main(String args[]){
		int[] m = {1,2,3,4,5,5,6,8,9};
		shuffleHelper(m);
		print(m);
	}
	public static void print(int[] m){
		for(int temp : m){
			Sysetm.out.print(temp);
		}
	}
	public static void shuffleHelper(int[] m){
		Random  rad = new Random();
		for(int i = 1; i < m.length ;i++){
			int index = rad.nextInt(i+1);
			int temp = a[index];
			a[index] = a[i];
			a[i] = temp;
		}
	}
}
