
public class testTrinaryTree {
	public static void main(String args[]){
		TrinaryTree m = new TrinaryTree();
		m.insert(5);
		m.insert(4);
		m.insert(5);
		m.insert(9);
		m.insert(2);
		m.insert(2);
		m.insert(7);
		m.delete(9);
		System.out.println(m.root.key);
		System.out.println(m.root.left.key);
		System.out.println(m.root.mid.key);
		System.out.println(m.root.right.key);
		System.out.println(m.root.left.left.key);
		System.out.println(m.root.left.left.mid.key);
		//System.out.println(m.root.right.left.key);
	
		print(m.root);
		
	} 
	public static void print(TreeNode m){
		if(m != null){
			System.out.print(m.key);
			if(m.left!= null){
				System.out.print(m.left.key);
				print(m.left);
			}
			if(m.mid != null){
				System.out.print(m.mid.key);
				print(m.mid);
			}
			if(m.right!= null){
				System.out.print(m.right.key);
				print(m.right);
			}
		}
		return ;
	}
}
