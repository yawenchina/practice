import java.util.*;
public class taversal {
	static ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
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
        c.left=g;
        c.right = h;
        d.left = i;
        d.right = j;
        e.left=g;
        e.right = h;
        f.left = i;
        f.right = j;
        //System.out.print(root.val);
        print(root.left, root.right,0);
        for(ArrayList<Integer> temp : array){
        	for(int m : temp){
        		System.out.print(m);
        	}
        	System.out.println();
        }
	}
	public static void print(TreeNode left, TreeNode right,int level){
		if(left == null){
			return ;
		}
		if(right == null){
			return;
		}
		if(left != null) {
			if(level == array.size()){
				array.add(new ArrayList<Integer>());
			}
			array.get(level).add(left.val);
		}
		if(right != null) {
			if(level == array.size()){
				array.add(new ArrayList<Integer>());
			}
			array.get(level).add(right.val);
		}
		print(left.left,right.right,level+1);
		print(left.right,right.left,level+1);
	}
	
}
