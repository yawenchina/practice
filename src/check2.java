
public class check2 {
	public static void main (String args[]){
		System.out.print(check(16));
		System.out.print(check(15));
		System.out.print(check(255));
	}
	public static boolean check(int m){
		return (m &(m-1)) == 0;
	}
}
