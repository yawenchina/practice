
public class completeTree {
	public static void main(String args[]){
	TreeNode root = new TreeNode(1);
	TreeNode root1 = new TreeNode(1);
	TreeNode root2 = new TreeNode(1);
	TreeNode root3 = new TreeNode(1);
	root.left = root1;
	root.right = root2;
	root1.right = root3;
	System.out.print(check(root));
	}
	public static boolean check(TreeNode m){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(m);
		while(!q.isEmpty()){
			TreeNode temp = q.poll();
			if(temp.left == null && temp.right != null){
				return false;
			}
			if(temp.left == null && temp.right == null){
				break;
			}
			if(temp.left != null){
				q.offer(temp.left);

			}
			if(temp.right != null){
				q.offer(temp.right);
				
			}
		}
		while(!q.isEmpty()){
			TreeNode tem = q.poll();
			if(temp.left != null || temp.right != null){
				return false;
			}
		}

		return true;
	}
	
}
