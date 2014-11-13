import java.util.*;

public class findPath {
	static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	public static void findPath(TreeNode m, int target) {

		ArrayList<Integer> s = new ArrayList<Integer>();
		recursion(s, m, target);
		print(result);

	}

	public static void print(ArrayList<ArrayList<Integer>> result) {
		for (ArrayList<Integer> one : result) {
			for (Integer value : one) {
				System.out.print(value);
			}
			System.out.println("");
		}
	}

	public static void recursion(ArrayList<Integer> s, TreeNode m, int target) {
		if (m.left == null && m.right == null) {
			s.add(m.val);
			calculate(new ArrayList<Integer>(s), target);
			s.remove(s.size() - 1);
			return;
		}
		if (m != null) {
			s.add(m.val);
			recursion(s, m.left, target);
			recursion(s, m.right, target);
			s.remove(s.size() - 1);
		}

	}

	public static void calculate(ArrayList<Integer> s, int target) {
		int sum = 0;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int size = s.size() - 1;
		while (size >= 0) {
			sum += s.get(size);
			temp.add(s.get(size--));
			if (sum == target) {
				result.add(new ArrayList<Integer>(temp));
				// print(result);

			}

		}
	}

}
