public class rightMostValue {
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
        print(root,0);
	}
    static int level = 0;
    public static void print(TreeNode root, int deep){
        if(root == null){
            return ;
        }
        if(deep == level){
            level++;
            System.out.print(root.value);
        }
        print(root.right, deep+1);
        print(root.left, deep+1);
    }
}
