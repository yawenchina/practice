import java.util.*;

public class findpair {

	public static void main(String args[]) {
		int[] A = { 3, 1, 4, 2, 5, 9 };
		findPair(A, 7);

	}

	public static void findPair(int[] A, int target) {
		Arrays.sort(A);
		int i = 1;

		while (i < A.length) {
			if (A[i] + A[i - 1] > target) {
				break;
			}
			i++;
		}
		System.out.print(i);
		int start = i - 1;

		while (i > 0) {
			int next = -1;

			for (; start >= 0; start--) {
				if (A[i] + A[start] <= target) {
					next = start;
					printll(i, start, A);
				}
			}
			i--;
			start = next;

		}
	}

	public static void printll(int i, int start, int[] A) {
		while (start >= 0) {
			System.out.print(A[i]);
			System.out.print(A[start]);
			System.out.println(" ");
			start--;
		}

	}
}
