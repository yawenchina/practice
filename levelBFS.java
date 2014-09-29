import java.util.*;

public class levelOrder {
	public static void main(String args[]) {
		Node root = new Node(7);
		Node one = new Node(4);
		Node two = new Node(9);
		Node three = new Node(1);
		Node four = new Node(5);
		Node five = new Node(8);
		Node six = new Node(3);
		root.left = one;
		root.right = two;
		one.left = three;
		one.right = four;
		two.left = five;
		four.left = six;
		doDFS(root);
		print(result);

	}

	public static int level = 0;
	static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

	public static void doDFS(Node root) {
		if (root == null) {
			return;
		}
		while (result.size() <= level) {
			result.add(new ArrayList<Integer>());
		}
		ArrayList<Integer> temp = result.get(level);
		temp.add(root.data);
		level++;
		doDFS(root.left);
		doDFS(root.right);
		level--;

	}

	public static void print(ArrayList<ArrayList<Integer>> result) {
		for (ArrayList<Integer> one : result) {
			for (int i = 0; i < one.size(); i++) {
				System.out.print(one.get(i));
			}
			System.out.println("");

		}

	}

}
