
public class findLCA2 {

		public static void main(String args[]){
			TreeNode root = new TreeNode(4);
			TreeNode a = new TreeNode(2);
			TreeNode b = new TreeNode(6);
			root.left = a;
			root.right = b;
			TreeNode c = new TreeNode(1);
			TreeNode d = new TreeNode(3);
			TreeNode e = new TreeNode(5);
			TreeNode f = new TreeNode(7);
			TreeNode g = new TreeNode(9);
			
			a.left = c;
			a.right = d;
			b.left = e;
			b.right = f;
			TreeNode m = findLCA2(root, e,g);
			if(count == 2)
			System.out.print(m.val);
			else{
				System.out.print("dsfas");
			}
			
		}
		public static int count = 0;
		public static TreeNode findLCA2 (TreeNode root, TreeNode a, TreeNode b) {
			// suppose all in
			if(root == null ){
				return root;
			}
			if(root == a ){
				count++;
			}
			if(root == b){
				count++;
			}
			
			TreeNode left = findLCA2(root.left, a, b);
			TreeNode right = findLCA2(root.right, a, b);
			if(left != null && right != null){
				return root;
			}
			return left == null ? right : left;

		}
	

}
