
public class find {
	public static void main(String args[]){
		TreeNode root = new TreeNode(10);
        TreeNode a = new TreeNode(2);
         TreeNode b = new TreeNode(15);
        TreeNode c = new TreeNode(1);
         TreeNode d = new TreeNode(5);
         TreeNode e = new TreeNode(11);
        TreeNode f = new TreeNode(16);
        TreeNode g = new TreeNode(18);
        TreeNode h = new TreeNode(0);
      
        root.left =a;
        root.right = b;
        a.left = c;
        a.right= d;
        b.left = e;
        b.right=f;
        c.left=h;
        f.right = g;
       TreeNode m = findLCA(root, c, d);
		System.out.print(m.val);

	}
	public static TreeNode findLCA(TreeNode root, TreeNode A, TreeNode B){
		if(root == null){
			return root;
	}
	if(root.val == B.val){
		return B;
	}
	if(root.val < A.val){
		return findLCA(root.right ,A,B);
	}
	if(root.val > B.val){
		return findLCA(root.left, A,B);
	}
	return root;



	}

}
