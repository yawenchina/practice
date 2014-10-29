
public class check1number {
	public static void main(String args[]) {
		int n = 7;
		check(n);
	}
	public static void check(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n &=(n-1);
		}
		System.out.print(count);
	}
}
