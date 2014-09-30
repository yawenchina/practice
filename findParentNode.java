public class findParent {
	public static void main(String args[]) {
		Node root = new Node(7);
		Node one = new Node(4);
		Node two = new Node(9);
		Node three = new Node(1);
		Node four = new Node(6);
		Node five = new Node(8);
		Node six = new Node(3);
		root.left = one;
		root.right = two;
		one.left = three;
		one.right = four;
		two.left = five;
		four.left = six;
		Node result = findParent1(root, 1);
		System.out.print(result.data);
		Node result1 = findParent1(root, 3);
		System.out.print(result1.data);

	}

	public static Node findParent1(Node root, int target) {
		if (root == null) {
			return root;
		}
		if (root.data == target) {
			return null;
		}
		if (root.right != null && root.right.data == target) {
			return root;
		}
		if (root.left != null && root.left.data == target) {
			return root;
		}
		

			if( findParent1(root.right, target)!= null){
				return findParent1(root.right, target);
			}

	

		return findParent1(root.left, target);

	}

}
