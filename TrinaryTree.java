//this is the constructor of the triTree ,it is the node of the the Trinary Tree
class triTree {
	int key;
	triTree left;
	triTree middle;
	triTree right;

	public triTree(int key) {
		this.key = key;
		this.left = this.middle = this.right = null;
	}

	public triTree(int val, triTree left, triTree mid, triTree right) {
		this.key = val;
		this.left = left;
		this.middle = mid;
		this.right = right;
	}

}

class TrinaryTree {
	triTree root;

	public TrinaryTree() {
		root = null;
	}

	// here implement the insert method
	private static triTree insert(int value, triTree root) {
		if (value < root.key) {
			if (root.left != null)
				insert(value, root.left);
			else
				root.left = new triTree(value);
		} else if (value > root.key) {
			if (root.right != null)
				insert(value, root.right);
			else
				root.right = new triTree(value);
		} else {
			if (root.middle != null)
				insert(value, root.middle);
			else
				root.middle = new triTree(value);
		}
		return root;
	}

	// here implement the delete function
	public static triTree delete(int key, triTree node) {
		if (node == null) {
			System.out.print("the number is not in the tree");
		} else if (key < node.key) {
			node.left = delete(key, node.left);
		} else if (key > node.key) {
			node.right = delete(key, node.right);
		} else {
			if (node.middle != null) {
				node.middle = node.middle.middle;
			} else if (node.right == null) {
				// if not have middle, not have right, use root.left.
				node = node.left;
			} else if (node.right.left == null) {
				// if not have middle, have right, but right not have left. move
				// root.right up.
				node.right.left = node.left;
				node = node.right;
			} else {
				// if not have middle, have right, and right have left, find the
				// smallest in right,
				triTree parent = node.right;
				while (parent.left != null && parent.left.left != null) {
					parent = parent.left;
				}
				triTree newRoot = parent.left;
				parent.left = newRoot.right;
				newRoot.left = node.left;
				newRoot.right = node.right;
				node = newRoot;
			}
		}
		return node;
	}

	// this is the print function to check the final result
	public static void print(triTree root) {
		if (root == null) {
			return;
		}
		System.out.println("the value of it is :" + root.key);

		if (root.left != null) {
			System.out.println("the left child of it is :" + root.left.key);
			print(root.left);
		}
		if (root.middle != null) {
			System.out.println("the middle child of it is :" + root.middle.key);
			print(root.middle);
		}
		if (root.right != null) {
			System.out.println("the right child of it is :" + root.right.key);
			print(root.right);
		}
	}

	// main function of the whole program
	public static void main(String args[]) {
		triTree root = new triTree(5);
		insert(4, root);
		insert(5, root);
		insert(9, root);
		insert(2, root);
		insert(2, root);
		insert(7, root);
		delete(9, root);
		print(root);
	}

}