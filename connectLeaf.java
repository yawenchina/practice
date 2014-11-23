import java.util.*;
public class connectLeaf {
	public static void main(String args[]){
		TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
         TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(4);
         TreeNode d = new TreeNode(5);
         TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(7);
        TreeNode g = new TreeNode(8);
        TreeNode h = new TreeNode(9);
        TreeNode i = new TreeNode(10);
        TreeNode j = new TreeNode(11);
        root.left =a;
        root.right = b;
        a.left = c;
        a.right= d;
        b.left = e;
        b.right=f;
        c.left=h;
        f.right = g;
        h.right = j;
        ArrayList<TreeNode> m = findArrayList(root);
        for(TreeNode temp : m){
        	System.out.print(temp.val);
        }
	}
	
	public static ArrayList<TreeNode> findArrayList(TreeNode root) {
		ArrayList<TreeNode> result = new ArrayList<TreeNode>();
		if(root == null) {
			return result;
	}
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		while (!s.isEmpty()){
			TreeNode temp = s.pop();
			if(temp.right == null && temp.left == null){
				result.add(temp);
	}
	if (temp.right != null) {
				s.push(temp.right);
	}
	if(temp.left != null) {
				s.push(temp.left);
			}
	}
	return result;

	}

}
