
public class findtheCloseOne {
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
		a.left = c;
		a.right = d;
		b.left = e;
		b.right = f;
		System.out.print(find(root, e));
		
	}
	public static int find (TreeNode root, TreeNode target) {
		TreeNode pre = null;
		while(root != null){
			if(root.val < target.val){
				root = root.right;
			}else{
				pre = root;
				root = root.left;
			}
		}
		return pre == null ? -1: pre.val;
		
	}
}
