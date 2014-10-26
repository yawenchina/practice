import java.util.*;
public class verticalOrder {
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
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
        printInVertical(map, root,0);
        print(map);
	}
	public static void printInVertical(TreeMap<Integer, ArrayList<Integer>> map, TreeNode root, int level){
		if(root == null){
			return;
		}
		if(!map.containsKey(level)){
			ArrayList<Integer> value = new ArrayList<Integer>();
			value.add(root.value);
			map.put(level, value);
		}else{
			ArrayList<Integer> temp =map.get(level);
			temp.add(root.value);
			map.put(level, temp);

		}
		printInVertical(map, root.left,level-1);
		printInVertical(map,root.right,level+1);


	}
	public static void print(TreeMap<Integer, ArrayList<Integer>> map){
		for(ArrayList<Integer> value : map.values()){
				for(int number : value){
					System.out.print(number+ " ");
				}
				System.out.println(" ");
		}



	}

}
