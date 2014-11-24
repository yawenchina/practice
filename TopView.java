
public class TopView {
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
        findTopView(root);
        
	}
	public static void findTopView (TreeNode root) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		checkTopView(map, root,0);
		Iterator iter = map.iterator();
		while(iter.hasNext()){
			Entry e = iter.next();
			System.out.print(e.getKey());
			System.out.print(e.getValue());
		}

	}
	public static void checkTopView(HashMap<Integer, Integer> map, TreeNode root, int level) {
		if(!map.containsKey(level)){
			map.put(level, root.val);
		}
		checkTopView(map, root.left, level-1);
		checkTopView(map, root.right, level+1);
	}
}
